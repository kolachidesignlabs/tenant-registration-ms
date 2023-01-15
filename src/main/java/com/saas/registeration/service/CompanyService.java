package com.saas.registeration.service;

import com.saas.registeration.dto.AddCompanyRequestDto;
import com.saas.registeration.dto.CompanyDto;
import com.saas.registeration.dto.CompanyStatusDto;

public interface CompanyService {
    CompanyDto addCompany(AddCompanyRequestDto addCompanyRequestDto);

    CompanyStatusDto getCompanyStatus(Long companyId);

    CompanyDto getCompany(Long companyId);

}
