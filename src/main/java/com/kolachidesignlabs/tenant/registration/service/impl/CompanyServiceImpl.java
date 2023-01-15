package com.kolachidesignlabs.tenant.registration.service.impl;

import com.kolachidesignlabs.tenant.registration.entity.*;
import com.kolachidesignlabs.tenant.registration.service.RabbitMqProducerService;
import com.kolachidesignlabs.tenant.registration.common.Constants;
import com.kolachidesignlabs.tenant.registration.dto.AddCompanyRequestDto;
import com.kolachidesignlabs.tenant.registration.dto.CompanyDto;
import com.kolachidesignlabs.tenant.registration.dto.CompanyProvisioningMessageDto;
import com.kolachidesignlabs.tenant.registration.dto.CompanyStatusDto;
import com.saas.registeration.entity.*;
import com.kolachidesignlabs.tenant.registration.repository.CompanyRepository;
import com.kolachidesignlabs.tenant.registration.service.CompanyService;
import com.kolachidesignlabs.tenant.registration.service.CompanySubscriptionPlanService;
import com.kolachidesignlabs.tenant.registration.service.UserService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

import java.util.Date;

@Service
@RequiredArgsConstructor
public class CompanyServiceImpl implements CompanyService {

    private final CompanyRepository companyRepository;
    private final CompanySubscriptionPlanService companySubscriptionPlanService;
    private final UserService userService;
    private final RabbitMqProducerService rabbitMqProducerService;

    @Transactional
    @Override
    public CompanyDto addCompany(AddCompanyRequestDto addCompanyRequestDto) {

        Company company = Company.builder()
                .address(addCompanyRequestDto.getCompanyAddress())
                .commercialName(addCompanyRequestDto.getCommercialName())
                .landlineNumber(addCompanyRequestDto.getLandlineNumber())
                .completeName(addCompanyRequestDto.getCompleteName())
                .email(addCompanyRequestDto.getEmail())
                .registrationNumber(addCompanyRequestDto.getRegistrationNumber())
                .taxRegistrationNumber(addCompanyRequestDto.getTaxRegistrationNumber())
                .strn(addCompanyRequestDto.getStrn())
                .companyStatus(new CompanyStatus(Constants.COMPANY_STATUS.DRAFT))
                .build();

        company = companyRepository.save(company);
        CompanySubscriptionPlan companySubscriptionPlan = addCompanySubscriptionPlan(addCompanyRequestDto, company);
        User user = addCompanyUser(addCompanyRequestDto, company);

        CompanyProvisioningMessageDto companyProvisioningMessageDto = CompanyProvisioningMessageDto.builder()
                .domainUrl(company.getDomainUrl())
                .companyAddress(company.getAddress())
                .companyId(company.getCompanyId())
                .commercialName(company.getCommercialName())
                .completeName(company.getCompleteName())
                .subscriptionPlanId(companySubscriptionPlan.getCompanySubscriptionPlanId())
                .userName(user.getUserName())
                .email(user.getEmail())
                .build();

        rabbitMqProducerService.send(companyProvisioningMessageDto, null, null);

        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(company, CompanyDto.class);
    }

    @Override
    public CompanyStatusDto getCompanyStatus(Long companyId) {
        Company company = companyRepository.findById(companyId).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Company not exist"));
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(company, CompanyStatusDto.class);
    }

    @Override
    public CompanyDto getCompany(Long companyId) {
        Company company = companyRepository.findById(companyId).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Company not exist"));
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(company, CompanyDto.class);
    }

    private CompanySubscriptionPlan addCompanySubscriptionPlan(AddCompanyRequestDto addCompanyRequestDto, Company company) {
        CompanySubscriptionPlan companySubscriptionPlan = CompanySubscriptionPlan.builder()
                .company(company)
                .subscriptionPlan(new SubscriptionPlan(addCompanyRequestDto.getSubscriptionPlanId()))
                .subscriptionDate(new Date())
                .build();
        return companySubscriptionPlanService.save(companySubscriptionPlan);
    }

    private User addCompanyUser(AddCompanyRequestDto addCompanyRequestDto, Company company) {
        User user = User.builder()
                .userName(addCompanyRequestDto.getUserName())
                .email(addCompanyRequestDto.getEmail())
                .password(addCompanyRequestDto.getPassword())
                .company(company)
                .userType(new UserType(Constants.USER_TYPE.COMPANY))
                .userRole(new UserRole(Constants.USER_ROLE.ADMIN))
                .build();
        return userService.save(user);
    }

}
