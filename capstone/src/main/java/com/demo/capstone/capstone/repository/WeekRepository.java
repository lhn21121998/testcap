package com.demo.capstone.capstone.repository;

import com.demo.capstone.capstone.entity.Week;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface WeekRepository extends JpaRepository<Week, Integer> {
    List<Week> findAllByOrderByFromAsc();
    Week findWeekByFromAndTo(Date from, Date to);
}
