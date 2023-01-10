package com.saas.registeration.service.impl;

import com.saas.registeration.dto.AddCompanyRequestDto;
import com.saas.registeration.dto.ResponseDto;
import com.saas.registeration.entity.Company;
import com.saas.registeration.entity.CompanySubscriptionPlan;
import com.saas.registeration.entity.SubscriptionPlan;
import com.saas.registeration.repository.CompanyRepository;
import com.saas.registeration.service.CompanyService;
import com.saas.registeration.service.CompanySubscriptionPlanService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Service

@RequiredArgsConstructor
public class CompanyServiceImpl implements CompanyService {

    private final CompanyRepository companyRepository;
    private final CompanySubscriptionPlanService companySubscriptionPlanService;

    @Transactional
    @Override
    public ResponseDto addCompany(AddCompanyRequestDto addCompanyRequestDto) {

        Company company = Company.builder()
                .address(addCompanyRequestDto.getAddress())
                .commercialName(addCompanyRequestDto.getCommercialName())
                .landlineNumber(addCompanyRequestDto.getLandlineNumber())
                .completeName(addCompanyRequestDto.getCompleteName())
                .email(addCompanyRequestDto.getEmail())
                .registrationNumber(addCompanyRequestDto.getRegistrationNumber())
                .taxRegistrationNumber(addCompanyRequestDto.getTaxRegistrationNumber())
                .strn(addCompanyRequestDto.getStrn())
                .build();

        company = companyRepository.save(company);

        CompanySubscriptionPlan companySubscriptionPlan = CompanySubscriptionPlan.builder()
                .company(company)
                .subscriptionPlan(new SubscriptionPlan(addCompanyRequestDto.getSubscriptionPlanId()))
                .subscriptionDate(new Date())
                .build();

        companySubscriptionPlanService.save(companySubscriptionPlan);

        return null;
    }
}
