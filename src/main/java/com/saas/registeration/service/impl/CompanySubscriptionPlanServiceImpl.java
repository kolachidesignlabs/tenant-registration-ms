package com.saas.registeration.service.impl;

import com.saas.registeration.entity.CompanySubscriptionPlan;
import com.saas.registeration.repository.CompanySubscriptionPlanRepository;
import com.saas.registeration.service.CompanySubscriptionPlanService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CompanySubscriptionPlanServiceImpl implements CompanySubscriptionPlanService {

    private final CompanySubscriptionPlanRepository companySubscriptionPlanRepository;

    @Override
    public CompanySubscriptionPlan save(CompanySubscriptionPlan companySubscriptionPlan) {
        return companySubscriptionPlanRepository.save(companySubscriptionPlan);
    }

}
