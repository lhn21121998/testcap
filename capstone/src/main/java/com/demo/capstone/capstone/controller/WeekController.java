package com.demo.capstone.capstone.controller;

import com.demo.capstone.capstone.entity.Week;
import com.demo.capstone.capstone.filter.DateFilter;
import com.demo.capstone.capstone.filter.ListWeekFilter;
import com.demo.capstone.capstone.service.WeekService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class WeekController {
    @Autowired
    private WeekService weekService;

    @GetMapping("week")
    public List<ListWeekFilter> findAllWeek() {
        try {
            List<Week> weeks = weekService.findAllByOrderByFromAsc();
            List<ListWeekFilter> result = new ArrayList<>();
            for(int i = 0; i<weeks.size();i++) {
                ListWeekFilter listWeekFilter = new ListWeekFilter();
                listWeekFilter.setId(weeks.get(i).getIdWeek());
                listWeekFilter.setFrom(weeks.get(i).getFrom());
                listWeekFilter.setTo(weeks.get(i).getTo());
                result.add(listWeekFilter);
            }
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @GetMapping("list-week")
    public List<DateFilter> getListsDateByFromAndTo(@RequestParam("from") String from, @RequestParam("to") String to) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate fromLocalDate = LocalDate.parse(from, formatter);
            LocalDate toLocalDate = LocalDate.parse(to, formatter);
            List<DateFilter> dateFilters = new ArrayList<>();

            for(LocalDate i = fromLocalDate; i.isBefore(toLocalDate.plusDays(1)); i = i.plusDays(1)) {
                DateFilter dateFilter = new DateFilter();
                String dateString = String.valueOf(i);
                dateFilter.setDate(dateString);
                dateFilters.add(dateFilter);
            }
            return dateFilters;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
