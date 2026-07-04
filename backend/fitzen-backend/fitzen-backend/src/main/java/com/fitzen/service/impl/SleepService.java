package com.fitzen.service.impl;

import com.fitzen.dto.SleepRequest;
import com.fitzen.dto.SleepResponse;

public interface SleepService {

    SleepResponse createSleep(SleepRequest request);

}
