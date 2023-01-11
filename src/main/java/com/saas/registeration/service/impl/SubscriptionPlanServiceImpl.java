package com.saas.registeration.service.impl;

import com.saas.registeration.dto.SubscriptionPlanDto;
import com.saas.registeration.entity.SubscriptionPlan;
import com.saas.registeration.repository.SubscriptionPlanRepository;
import com.saas.registeration.service.SubscriptionPlanService;
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
