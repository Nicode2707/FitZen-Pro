package com.fitzen.controller;

import com.fitzen.dto.StatisticsResponse;
import com.fitzen.service.impl.StatisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/statistics")
public class StatisticsController {

    @Autowired
    private StatisticsService statisticsService;

    @GetMapping
    public StatisticsResponse getStatistics() {

        return statisticsService.getStatistics();

    }

}