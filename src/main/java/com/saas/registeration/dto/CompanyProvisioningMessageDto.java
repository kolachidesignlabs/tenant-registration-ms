package com.saas.registeration.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class CompanyProvisioningMessageDto {

    private Long companyId;
    private String completeName;
    private String commercialName;
    private String companyAddress;
    private String domainUrl;
    private Long subscriptionPlanId;
    private String userName;
    private String email;

}
