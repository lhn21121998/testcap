package com.demo.capstone.capstone.filter;

import java.util.Date;

public class WeeklyTimetableFilter {
    private Integer id;
    private String username;
    private String slot;
    private Date dayOfWeek;

    public WeeklyTimetableFilter() {
    }

    public WeeklyTimetableFilter(Integer id, String username, String slot, Date dayOfWeek) {
        this.id = id;
        this.username = username;
        this.slot = slot;
        this.dayOfWeek = dayOfWeek;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSlot() {
        return slot;
    }

    public void setSlot(String slot) {
        this.slot = slot;
    }

    public Date getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(Date dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }
}
