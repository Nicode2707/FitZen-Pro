package com.fitzen.controller;

import com.fitzen.dto.ProgressRequest;
import com.fitzen.dto.ProgressResponse;
import com.fitzen.service.impl.ProgressService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/progress")
public class ProgressController {

    private final ProgressService progressService;

    public ProgressController(ProgressService progressService) {
        this.progressService = progressService;
    }

    @PostMapping
    public ProgressResponse addProgress(
            @Valid @RequestBody ProgressRequest request) {

        return progressService.addProgress(request);
    }
}