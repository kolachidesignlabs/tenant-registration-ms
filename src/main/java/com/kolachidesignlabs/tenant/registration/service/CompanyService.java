package com.kolachidesignlabs.tenant.registration.service;

import com.kolachidesignlabs.tenant.registration.dto.AddCompanyRequestDto;
import com.kolachidesignlabs.tenant.registration.dto.CompanyDto;

public interface CompanyService {
    CompanyDto addCompany(AddCompanyRequestDto addCompanyRequestDto);
}
