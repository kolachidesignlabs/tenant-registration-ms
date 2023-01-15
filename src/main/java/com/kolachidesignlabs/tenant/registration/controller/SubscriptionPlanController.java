package com.kolachidesignlabs.tenant.registration.controller;

import com.kolachidesignlabs.tenant.registration.dto.SubscriptionPlanDto;
import com.kolachidesignlabs.tenant.registration.service.SubscriptionPlanService;
import com.kolachidesignlabs.tenant.registration.dto.ResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@RequiredArgsConstructor
@Controller
@RequestMapping("/subscription-plan")
public class SubscriptionPlanController {

    private final SubscriptionPlanService subscriptionPlanService;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping
    public @ResponseBody
    ResponseDto getSubscriptionPlan() {
        SubscriptionPlanDto[] subscriptionPlanDtos = subscriptionPlanService.getSubscriptionPlan();
        return ResponseDto.builder().data(subscriptionPlanDtos)
                .message(HttpStatus.OK.name())
                .statusCode(HttpStatus.OK.toString()).build();
    }

}
