package com.fitzen.controller;

import com.fitzen.dto.WaterRequest;
import com.fitzen.dto.WaterResponse;
import com.fitzen.service.impl.WaterService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/water")
public class WaterController {

    private final WaterService waterService;

    public WaterController(WaterService waterService) {
        this.waterService = waterService;
    }

    @PostMapping
    public WaterResponse addWater(
            @Valid @RequestBody WaterRequest request) {

        return waterService.addWater(request);
    }
}