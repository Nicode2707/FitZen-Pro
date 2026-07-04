package com.fitzen.service.impl;

import com.fitzen.dto.GoalRequest;
import com.fitzen.dto.GoalResponse;
import com.fitzen.entity.Goal;
import com.fitzen.entity.User;
import com.fitzen.repository.GoalRepository;
import com.fitzen.service.impl.GoalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@Service
public class GoalServiceImpl implements GoalService {

    @Autowired
    private GoalRepository goalRepository;

    @Override
    public GoalResponse createGoal(GoalRequest request) {

        Authentication authentication =
                SecurityContextHolder.getContext().getAuthentication();

        User loggedInUser = (User) authentication.getPrincipal();

        Goal goal = new Goal();

        goal.setGoalName(request.getGoalName());
        goal.setDescription(request.getDescription());
        goal.setTargetWeight(request.getTargetWeight());
        goal.setTargetCalories(request.getTargetCalories());

        // VERY IMPORTANT
        goal.setUser(loggedInUser);

        Goal savedGoal = goalRepository.save(goal);

        return new GoalResponse(
                savedGoal.getId(),
                savedGoal.getGoalName(),
                savedGoal.getDescription(),
                savedGoal.getTargetWeight(),
                savedGoal.getTargetCalories()
        );
    }
}