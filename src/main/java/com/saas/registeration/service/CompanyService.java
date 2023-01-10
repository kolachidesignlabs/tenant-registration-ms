package com.saas.registeration.service;

import com.saas.registeration.dto.AddCompanyRequestDto;
import com.saas.registeration.dto.ResponseDto;

public interface CompanyService {
    ResponseDto addCompany(AddCompanyRequestDto addCompanyRequestDto);
}
