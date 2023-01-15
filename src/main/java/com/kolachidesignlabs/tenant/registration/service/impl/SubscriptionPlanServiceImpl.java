package com.kolachidesignlabs.tenant.registration.service.impl;

import com.kolachidesignlabs.tenant.registration.dto.SubscriptionPlanDto;
import com.kolachidesignlabs.tenant.registration.entity.SubscriptionPlan;
import com.kolachidesignlabs.tenant.registration.repository.SubscriptionPlanRepository;
import com.kolachidesignlabs.tenant.registration.service.SubscriptionPlanService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SubscriptionPlanServiceImpl implements SubscriptionPlanService {

    private final SubscriptionPlanRepository subscriptionPlanRepository;

    @Override
    public SubscriptionPlanDto[] getSubscriptionPlan() {
        List<SubscriptionPlan> subscriptionPlans = subscriptionPlanRepository.findAll();
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(subscriptionPlans, SubscriptionPlanDto[].class);
    }
}
