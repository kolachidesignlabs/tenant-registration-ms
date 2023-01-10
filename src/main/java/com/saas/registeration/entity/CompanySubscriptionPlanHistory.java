package com.saas.registeration.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "COMPANY_SUBSCRIPTION_PLAN_HISTORY")
@NoArgsConstructor
public class CompanySubscriptionPlanHistory extends BaseEntity {

    @Id
    @Column(name = "COMPANY_SUBSCRIPTION_PLAN_HISTORY_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long companySubscriptionPlanHistoryId;

    @Column(name = "SUBSCRIPTION_DATE")
    private Date subscriptionDate;

    @ManyToOne
    @JoinColumn(name = "COMPANY_ID")
    private Company company;

    @ManyToOne
    @JoinColumn(name = "SUBSCRIPTION_PLAN_ID")
    private SubscriptionPlan subscriptionPlan;

}
