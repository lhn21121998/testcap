package com.demo.capstone.capstone.service;

import com.demo.capstone.capstone.entity.Week;

import java.util.Date;
import java.util.List;

public interface WeekService {
    List<Week> findAllByOrderByFromAsc();

    Week findWeekByFromAndTo(Date from, Date to);
}
