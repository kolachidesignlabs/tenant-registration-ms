package com.saas.registeration.controller;

import com.saas.registeration.dto.AddCompanyRequestDto;
import com.saas.registeration.dto.CompanyDto;
import com.saas.registeration.dto.CompanyStatusDto;
import com.saas.registeration.dto.ResponseDto;
import com.saas.registeration.service.CompanyService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
        return ResponseDto.builder()
                .data(companyDto)
                .message(HttpStatus.CREATED.name())
                .statusCode(HttpStatus.CREATED.toString())
                .build();
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping
    public @ResponseBody
    ResponseDto getCompany(@RequestParam(name = "companyId") Long companyId) {
        CompanyDto companyDto = companyService.getCompany(companyId);
        return ResponseDto.builder()
                .data(companyDto)
                .message(HttpStatus.OK.name())
                .statusCode(HttpStatus.OK.toString())
                .build();
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/status")
    public @ResponseBody
    ResponseDto getCompanyStatus(@RequestParam(name = "companyId") Long companyId) {
        CompanyStatusDto companyStatusDto = companyService.getCompanyStatus(companyId);
        return ResponseDto.builder()
                .data(companyStatusDto)
                .message(HttpStatus.OK.name())
                .statusCode(HttpStatus.OK.toString())
                .build();
    }

}
