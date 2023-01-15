package com.kolachidesignlabs.tenant.registration.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "SUBSCRIPTION_PLANS")
public class SubscriptionPlan {

    public SubscriptionPlan(Long subscriptionPlanId) {
        this.subscriptionPlanId = subscriptionPlanId;
    }

    @Id
    @Column(name = "SUBSCRIPTION_PLAN_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long subscriptionPlanId;

    @Column(name = "TITTLE", nullable = false, length = 500)
    private String tittle;

    @Column(name = "DESCRIPTION", nullable = false, length = 1000)
    private String description;

    @Column(name = "ACTIVE", nullable = false)
    private Boolean active;
}
