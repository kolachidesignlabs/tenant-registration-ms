package com.kolachidesignlabs.tenant.registration.service;

import com.kolachidesignlabs.tenant.registration.dto.CompanyDto;
import com.kolachidesignlabs.tenant.registration.dto.CompanyStatusDto;
import com.kolachidesignlabs.tenant.registration.dto.AddCompanyRequestDto;

public interface CompanyService {
    CompanyDto addCompany(AddCompanyRequestDto addCompanyRequestDto);

    CompanyStatusDto getCompanyStatus(Long companyId);

    CompanyDto getCompany(Long companyId);

}
