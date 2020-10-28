package com.demo.capstone.capstone.filter;

import java.util.Date;

public class ListWeekFilter {
    private Integer id;
    private Date from;
    private Date to;

    public ListWeekFilter() {
    }

    public ListWeekFilter(Integer id, Date from, Date to) {
        this.id = id;
        this.from = from;
        this.to = to;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFrom() {
        return from;
    }

    public void setFrom(Date from) {
        this.from = from;
    }

    public Date getTo() {
        return to;
    }

    public void setTo(Date to) {
        this.to = to;
    }
}
