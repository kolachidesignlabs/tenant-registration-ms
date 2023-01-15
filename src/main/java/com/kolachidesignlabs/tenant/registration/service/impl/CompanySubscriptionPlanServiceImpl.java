package com.kolachidesignlabs.tenant.registration.service.impl;

import com.kolachidesignlabs.tenant.registration.entity.CompanySubscriptionPlan;
import com.kolachidesignlabs.tenant.registration.repository.CompanySubscriptionPlanRepository;
import com.kolachidesignlabs.tenant.registration.service.CompanySubscriptionPlanService;
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
