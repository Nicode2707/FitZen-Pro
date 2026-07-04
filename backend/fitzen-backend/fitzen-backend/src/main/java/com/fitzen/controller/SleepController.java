package com.fitzen.controller;

import com.fitzen.dto.SleepRequest;
import com.fitzen.dto.SleepResponse;
import com.fitzen.service.impl.SleepService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/sleep")
public class SleepController {

    @Autowired
    private SleepService sleepService;

    @PostMapping
    public SleepResponse createSleep(
            @Valid @RequestBody SleepRequest request) {

        return
                sleepService.createSleep(request);
    }
}