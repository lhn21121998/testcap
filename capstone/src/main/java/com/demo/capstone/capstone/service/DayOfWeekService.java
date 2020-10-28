package com.demo.capstone.capstone.service;

import com.demo.capstone.capstone.entity.DayOfWeek;

import java.util.Date;
import java.util.List;

public interface DayOfWeekService {
    List<DayOfWeek> findDayOfWeeksByDateIsGreaterThanEqualAndDateIsLessThanEqual(Date after, Date before);
}
