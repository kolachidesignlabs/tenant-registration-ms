package com.kolachidesignlabs.tenant.registration.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "SUBSCRIPTION_PLAN")
public class SubscriptionPlan extends BaseEntity {

    public SubscriptionPlan(Long subscriptionPlanId) {
        this.subscriptionPlanId = subscriptionPlanId;
    }

    @Id
    @Column(name = "SUBSCRIPTION_PLAN_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long subscriptionPlanId;

    @Column(name = "TITTLE")
    private String tittle;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "ACTIVE")
    private Boolean active;
}
