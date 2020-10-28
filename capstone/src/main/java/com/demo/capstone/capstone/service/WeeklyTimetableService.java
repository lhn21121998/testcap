package com.demo.capstone.capstone.service;

import com.demo.capstone.capstone.entity.DayOfWeek;
import com.demo.capstone.capstone.entity.WeeklyTimetable;

import java.util.List;

public interface WeeklyTimetableService {
    List<WeeklyTimetable> findWeeklyTimetablesByIdDow(DayOfWeek dayOfWeek);
}
