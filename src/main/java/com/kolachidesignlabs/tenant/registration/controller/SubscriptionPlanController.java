package com.kolachidesignlabs.tenant.registration.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@RequiredArgsConstructor
@Controller
@RequestMapping()
public class SubscriptionPlanController {

    @ResponseStatus(HttpStatus.OK)
    @GetMapping
    public @ResponseBody
    String getSubscriptionPlan() {
        return "Hello World";
    }

}
