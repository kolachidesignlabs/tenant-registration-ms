package com.kolachidesignlabs.tenant.registration.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SubscriptionPlanDto {

    private Long subscriptionPlanId;
    private String tittle;
    private String description;
    private Boolean active;
}
