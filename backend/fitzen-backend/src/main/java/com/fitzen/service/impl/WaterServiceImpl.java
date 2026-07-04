package com.fitzen.service.impl;

import com.fitzen.dto.WaterRequest;
import com.fitzen.dto.WaterResponse;
import com.fitzen.entity.User;
import com.fitzen.entity.Water;
import com.fitzen.repository.UserRepository;
import com.fitzen.repository.WaterRepository;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@Service
public class WaterServiceImpl implements WaterService {

    private final WaterRepository waterRepository;
    private final UserRepository userRepository;

    public WaterServiceImpl(WaterRepository waterRepository,
                            UserRepository userRepository) {
        this.waterRepository = waterRepository;
        this.userRepository = userRepository;
    }

    @Override
    public WaterResponse addWater(WaterRequest request) {

        User user = (User) SecurityContextHolder
                .getContext()
                .getAuthentication()
                .getPrincipal();

        Water water = new Water();

        water.setAmount(request.getAmount());
        water.setUser(user);

        Water savedWater = waterRepository.save(water);

        return new WaterResponse(
                savedWater.getId(),
                savedWater.getAmount()
        );
    }
}