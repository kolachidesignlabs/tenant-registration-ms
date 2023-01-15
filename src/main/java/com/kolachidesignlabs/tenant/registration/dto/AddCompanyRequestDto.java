package com.kolachidesignlabs.tenant.registration.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddCompanyRequestDto {
    private String completeName;
    private String commercialName;
    private String landlineNumber;
    private String companyAddress;
    private String strn;
    private String registrationNumber;
    private String taxRegistrationNumber;
    private String domainUrl;
    private Long subscriptionPlanId;
    private String userName;
    private String email;
    private String password;

}
