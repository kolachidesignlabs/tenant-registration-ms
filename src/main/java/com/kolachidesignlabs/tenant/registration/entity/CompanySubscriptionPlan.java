package com.kolachidesignlabs.tenant.registration.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "COMPANY_SUBSCRIPTION_PLANS")
public class CompanySubscriptionPlan {

    @Id
    @Column(name = "COMPANY_SUBSCRIPTION_PLAN_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long companySubscriptionPlanId;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "SUBSCRIPTION_DATE", nullable = false)
    private Date subscriptionDate;

    @ManyToOne
    @JoinColumn(name = "COMPANY_ID", nullable = false, unique = true)
    private Company company;

    @ManyToOne
    @JoinColumn(name = "SUBSCRIPTION_PLAN_ID", nullable = false)
    private SubscriptionPlan subscriptionPlan;
}
