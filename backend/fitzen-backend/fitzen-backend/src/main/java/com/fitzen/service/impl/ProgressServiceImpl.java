package com.fitzen.service.impl;

import com.fitzen.dto.ProgressRequest;
import com.fitzen.dto.ProgressResponse;
import com.fitzen.entity.Progress;
import com.fitzen.entity.User;
import com.fitzen.repository.ProgressRepository;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class ProgressServiceImpl implements ProgressService {

    private final ProgressRepository progressRepository;

    public ProgressServiceImpl(ProgressRepository progressRepository) {
        this.progressRepository = progressRepository;
    }

    @Override
    public ProgressResponse addProgress(ProgressRequest request) {

        User user = (User) SecurityContextHolder
                .getContext()
                .getAuthentication()
                .getPrincipal();

        Progress progress = new Progress();

        progress.setWeight(request.getWeight());
        progress.setBmi(request.getBmi());
        progress.setRecordDate(LocalDate.now());
        progress.setUser(user);

        Progress savedProgress = progressRepository.save(progress);

        return new ProgressResponse(
                savedProgress.getId(),
                savedProgress.getWeight(),
                savedProgress.getBmi(),
                savedProgress.getRecordDate()
        );
    }
}