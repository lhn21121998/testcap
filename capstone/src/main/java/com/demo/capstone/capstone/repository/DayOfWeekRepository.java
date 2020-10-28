package com.demo.capstone.capstone.repository;

import com.demo.capstone.capstone.entity.DayOfWeek;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface DayOfWeekRepository extends JpaRepository<DayOfWeek, Integer> {
    List<DayOfWeek> findDayOfWeeksByDateIsGreaterThanEqualAndDateIsLessThanEqual(Date after, Date before);
}
