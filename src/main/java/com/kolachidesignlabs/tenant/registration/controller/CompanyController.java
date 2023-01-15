package com.kolachidesignlabs.tenant.registration.controller;

import com.kolachidesignlabs.tenant.registration.dto.AddCompanyRequestDto;
import com.kolachidesignlabs.tenant.registration.dto.CompanyDto;
import com.kolachidesignlabs.tenant.registration.dto.CompanyStatusDto;
import com.kolachidesignlabs.tenant.registration.dto.ResponseDto;
import com.kolachidesignlabs.tenant.registration.service.CompanyService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RequiredArgsConstructor
@Controller
@RequestMapping("/company")
public class CompanyController {

    private final CompanyService companyService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public @ResponseBody
    ResponseDto addCompany(@RequestBody @Valid AddCompanyRequestDto addCompanyRequestDto) {
        CompanyDto companyDto = companyService.addCompany(addCompanyRequestDto);
        return new ResponseDto(HttpStatus.CREATED, companyDto);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping
    public @ResponseBody
    ResponseDto getCompany(@RequestParam(name = "companyId") Long companyId) {
        CompanyDto companyDto = companyService.getCompany(companyId);
        return new ResponseDto(companyDto);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/status")
    public @ResponseBody
    ResponseDto getCompanyStatus(@RequestParam(name = "companyId") Long companyId) {
        CompanyStatusDto companyStatusDto = companyService.getCompanyStatus(companyId);
        return new ResponseDto(companyStatusDto);
    }

}
