package com.fitzen.controller;

import com.fitzen.dto.HealthRequest;
import com.fitzen.dto.HealthResponse;
import com.fitzen.service.impl.HealthService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/health")
public class HealthController {

    @Autowired
    private HealthService healthService;

    @PostMapping
    public HealthResponse calculateHealth(
            @Valid @RequestBody HealthRequest request) {

        return healthService.calculateHealth(request);
    }
}