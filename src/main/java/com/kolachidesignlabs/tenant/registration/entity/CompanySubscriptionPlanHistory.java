package com.kolachidesignlabs.tenant.registration.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "COMPANY_SUBSCRIPTION_PLAN_HISTORIES")
@NoArgsConstructor
public class CompanySubscriptionPlanHistory {

    @Id
    @Column(name = "COMPANY_SUBSCRIPTION_PLAN_HISTORY_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long companySubscriptionPlanHistoryId;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "SUBSCRIPTION_DATE")
    private Date subscriptionDate;

    @ManyToOne
    @JoinColumn(name = "COMPANY_ID", nullable = false)
    private Company company;

    @ManyToOne
    @JoinColumn(name = "SUBSCRIPTION_PLAN_ID", nullable = false)
    private SubscriptionPlan subscriptionPlan;

}
