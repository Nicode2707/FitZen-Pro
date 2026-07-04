package com.fitzen.service.impl;

import com.fitzen.dto.ProgressRequest;
import com.fitzen.dto.ProgressResponse;

public interface ProgressService {

    ProgressResponse addProgress(ProgressRequest request);

}