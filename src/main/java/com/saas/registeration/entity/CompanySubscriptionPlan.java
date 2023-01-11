package com.saas.registeration.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.Date;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "COMPANY_SUBSCRIPTION_PLAN")
public class CompanySubscriptionPlan extends BaseEntity {

    @Id
    @Column(name = "COMPANY_SUBSCRIPTION_PLAN_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long companySubscriptionPlanId;

    @Column(name = "SUBSCRIPTION_DATE")
    private Date subscriptionDate;

    @ManyToOne
    @JoinColumn(name = "COMPANY_ID")
    private Company company;

    @ManyToOne
    @JoinColumn(name = "SUBSCRIPTION_PLAN_ID")
    private SubscriptionPlan subscriptionPlan;
}
