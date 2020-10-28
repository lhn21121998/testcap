package com.demo.capstone.capstone.service;

import com.demo.capstone.capstone.entity.Week;
import com.demo.capstone.capstone.repository.WeekRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class WeekServiceImpl implements WeekService {
    @Autowired
    private WeekRepository weekRepository;


    @Override
    public List<Week> findAllByOrderByFromAsc() {
        return weekRepository.findAllByOrderByFromAsc();
    }

    @Override
    public Week findWeekByFromAndTo(Date from, Date to) {
        return weekRepository.findWeekByFromAndTo(from, to);
    }
}
