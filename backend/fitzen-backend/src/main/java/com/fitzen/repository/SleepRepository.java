package com.fitzen.repository;

import com.fitzen.entity.Sleep;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SleepRepository extends JpaRepository<Sleep, Long> {
}