package com.demo.capstone.capstone.controller;

import com.demo.capstone.capstone.entity.DayOfWeek;
import com.demo.capstone.capstone.entity.WeeklyTimetable;
import com.demo.capstone.capstone.filter.WeeklyTimetableFilter;
import com.demo.capstone.capstone.service.DayOfWeekService;
import com.demo.capstone.capstone.service.WeeklyTimetableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class WeeklyTimetableController {

    @Autowired
    private DayOfWeekService dayOfWeekService;

    @Autowired
    private WeeklyTimetableService weeklyTimetableService;

    @GetMapping("weekly-timetable")
    public List<WeeklyTimetableFilter> getDayOfWeek(@RequestParam("after") String after, @RequestParam("before") String before) throws ParseException {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date dateAfter = sdf.parse(after);
            Date dateBefore = sdf.parse(before);
            List<DayOfWeek> dayOfWeeks = dayOfWeekService.findDayOfWeeksByDateIsGreaterThanEqualAndDateIsLessThanEqual(dateAfter, dateBefore);
            List<WeeklyTimetable> result = new ArrayList<>();
            List<WeeklyTimetableFilter> filters = new ArrayList<>();
            for(int i = 0; i<dayOfWeeks.size(); i++) {
                result.addAll(weeklyTimetableService.findWeeklyTimetablesByIdDow(dayOfWeeks.get(i)));
            }
            for(int i = 0; i < result.size();i++) {
                WeeklyTimetableFilter filter = new WeeklyTimetableFilter();
                filter.setId(result.get(i).getId());
                filter.setUsername(result.get(i).getUsername().getUsername());
                filter.setSlot(result.get(i).getIdSlot().getName());
                filter.setDayOfWeek(result.get(i).getIdDow().getDate());
                filters.add(filter);
            }
            return filters;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
