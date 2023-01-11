package com.saas.registeration.controller;

import com.saas.registeration.dto.AddCompanyRequestDto;
import com.saas.registeration.dto.AddCompanyResponseDto;
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
        AddCompanyResponseDto addCompanyResponseDto = companyService.addCompany(addCompanyRequestDto);
        return ResponseDto.builder()
                .data(addCompanyResponseDto)
                .message(HttpStatus.CREATED.name())
                .statusCode(HttpStatus.CREATED.toString())
                .build();
    }

}
