package com.kolachidesignlabs.tenant.registration.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class CompanyDto {

    private Long companyId;
    private String completeName;
    private String commercialName;
    private String landlineNumber;
    private String address;
    private String strn;
    private String registrationNumber;
    private String taxRegistrationNumber;
    private String email;
    private String domainUrl;
    private String companyStatus;
    private Long companyStatusId;
}
