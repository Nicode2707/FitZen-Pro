package com.fitzen.service.impl;

import com.fitzen.dto.DashboardResponse;
import org.springframework.stereotype.Service;

@Service
public class DashboardServiceImpl implements DashboardService {

    @Override
    public DashboardResponse getDashboard() {

        return new DashboardResponse(
                5L,
                12L,
                45L,
                30L,
                2100
        );
    }
}