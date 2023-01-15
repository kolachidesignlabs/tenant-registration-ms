package com.kolachidesignlabs.tenant.registration.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SubscriptionPlanDto {

    public SubscriptionPlanDto(Long subscriptionPlanId) {
        this.subscriptionPlanId = subscriptionPlanId;
    }

    private Long subscriptionPlanId;
    private String tittle;
    private String description;
    private Boolean active;
}
