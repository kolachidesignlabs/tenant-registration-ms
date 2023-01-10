package com.saas.registeration.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
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
    @NotNull
    private String tittle;

    @Column(name = "DESCRIPTION")
    @NotNull
    private String description;

    @Column(name = "ACTIVE")
    @NotNull
    private Boolean active;
}
