package com.demo.capstone.capstone.repository;

import com.demo.capstone.capstone.entity.DayOfWeek;
import com.demo.capstone.capstone.entity.WeeklyTimetable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WeeklyTimetableRepository extends JpaRepository<WeeklyTimetable, Integer> {
    List<WeeklyTimetable> findWeeklyTimetablesByIdDow(DayOfWeek dayOfWeek);
}
