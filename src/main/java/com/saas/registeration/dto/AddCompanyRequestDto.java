package com.saas.registeration.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddCompanyRequestDto {
    String completeName;
    String commercialName;
    String landlineNumber;
    String email;
    String address;
    String strn;
    String registrationNumber;
    String taxRegistrationNumber;
    String domainUrl;
    Long subscriptionPlanId;
}
