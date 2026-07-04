package com.fitzen.service.impl;

import com.fitzen.dto.StatisticsResponse;
import com.fitzen.repository.ActivityRepository;
import com.fitzen.repository.ExerciseRepository;
import com.fitzen.repository.GoalRepository;
import com.fitzen.repository.MealRepository;
import com.fitzen.repository.ProgressRepository;
import com.fitzen.repository.SleepRepository;
import com.fitzen.repository.WaterRepository;
import com.fitzen.repository.WorkoutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StatisticsServiceImpl implements StatisticsService {

    @Autowired
    private GoalRepository goalRepository;

    @Autowired
    private WorkoutRepository workoutRepository;

    @Autowired
    private ExerciseRepository exerciseRepository;

    @Autowired
    private MealRepository mealRepository;

    @Autowired
    private WaterRepository waterRepository;

    @Autowired
    private SleepRepository sleepRepository;

    @Autowired
    private ProgressRepository progressRepository;

    @Autowired
    private ActivityRepository activityRepository;

    @Override
    public StatisticsResponse getStatistics() {

        return new StatisticsResponse(

                goalRepository.count(),

                workoutRepository.count(),

                exerciseRepository.count(),

                mealRepository.count(),

                waterRepository.count(),

                sleepRepository.count(),

                progressRepository.count(),

                activityRepository.count()

        );

    }

}