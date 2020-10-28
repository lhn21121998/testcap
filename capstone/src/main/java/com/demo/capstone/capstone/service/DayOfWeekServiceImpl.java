package com.demo.capstone.capstone.service;

import com.demo.capstone.capstone.entity.DayOfWeek;
import com.demo.capstone.capstone.repository.DayOfWeekRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class DayOfWeekServiceImpl implements DayOfWeekService{

    @Autowired
    private DayOfWeekRepository dayOfWeekRepository;

    @Override
    public List<DayOfWeek> findDayOfWeeksByDateIsGreaterThanEqualAndDateIsLessThanEqual(Date after, Date before) {
        return dayOfWeekRepository.findDayOfWeeksByDateIsGreaterThanEqualAndDateIsLessThanEqual(after, before);
    }
}
