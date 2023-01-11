package com.saas.registeration.service;

import com.saas.registeration.dto.AddCompanyRequestDto;
import com.saas.registeration.dto.AddCompanyResponseDto;
import com.saas.registeration.dto.ResponseDto;

public interface CompanyService {
    AddCompanyResponseDto addCompany(AddCompanyRequestDto addCompanyRequestDto);
}
