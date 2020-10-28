package com.demo.capstone.capstone.service;

import com.demo.capstone.capstone.entity.DayOfWeek;
import com.demo.capstone.capstone.entity.WeeklyTimetable;
import com.demo.capstone.capstone.repository.WeeklyTimetableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WeeklyTimetableServiceImpl implements WeeklyTimetableService{
    @Autowired
    private WeeklyTimetableRepository weeklyTimetableRepository;

    @Override
    public List<WeeklyTimetable> findWeeklyTimetablesByIdDow(DayOfWeek dayOfWeek) {
        return weeklyTimetableRepository.findWeeklyTimetablesByIdDow(dayOfWeek);
    }
}
