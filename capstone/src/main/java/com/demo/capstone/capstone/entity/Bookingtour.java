/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.capstone.capstone.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

/**
 *
 * @author Linh Hoang
 */
@Entity
@Table(name = "bookingtour")
@Data
public class Bookingtour implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "bookingid")
    private Integer bookingid;
    @Column(name = "language")
    private String language;
    @Basic(optional = false)
    @Column(name = "quantity")
    private int quantity;
    @Column(name = "timebook")
    @Temporal(TemporalType.TIMESTAMP)
    private Date timebook;
    @Column(name = "groupbookingid")
    private Integer groupbookingid;
    @Column(name = "start_time")
    @Temporal(TemporalType.TIME)
    private Date startTime;
    @Column(name = "day_occur")
    @Temporal(TemporalType.DATE)
    private Date dayOccur;
    @JoinColumn(name = "username", referencedColumnName = "username")
    @ManyToOne(optional = false)
    private Account username;
    @JoinColumn(name = "id_stt_bookingtour", referencedColumnName = "id_status_bookingtour")
    @ManyToOne
    private StatusOfBookingtour idSttBookingtour;
    @JoinColumn(name = "visitorid", referencedColumnName = "visitorid")
    @ManyToOne(optional = false)
    private Visitor visitorid;
    @JoinColumn(name = "id_week_timetable", referencedColumnName = "id")
    @ManyToOne
    private WeeklyTimetable idWeekTimetable;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "bookingid")
    private Collection<Tourtopic> tourtopicCollection;

}
