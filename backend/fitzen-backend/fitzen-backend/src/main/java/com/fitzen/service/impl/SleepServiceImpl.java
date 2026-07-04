package com.fitzen.service.impl;

import com.fitzen.dto.SleepRequest;
import com.fitzen.dto.SleepResponse;
import com.fitzen.entity.Sleep;
import com.fitzen.repository.SleepRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class SleepServiceImpl implements SleepService {

    @Autowired
    private SleepRepository sleepRepository;

    @Override
    public SleepResponse createSleep(SleepRequest request) {

        Sleep sleep = new Sleep();

        sleep.setSleepHours(request.getSleepHours());
        sleep.setSleepQuality(request.getSleepQuality());
        sleep.setBedTime(request.getBedTime());
        sleep.setWakeTime(request.getWakeTime());
        sleep.setSleepDate(LocalDate.now());

        Sleep savedSleep = sleepRepository.save(sleep);

        return new SleepResponse(
                savedSleep.getId(),
                savedSleep.getSleepHours(),
                savedSleep.getSleepQuality(),
                savedSleep.getBedTime(),
                savedSleep.getWakeTime(),
                savedSleep.getSleepDate()
        );
    }
}
