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

/**
 *
 * @author Linh Hoang
 */
@Entity
@Table(name = "weekly_timetable")
@Data
public class WeeklyTimetable implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @OneToMany(mappedBy = "idWeekTimetable")
    private Collection<Bookingtour> bookingtourCollection;
    @JoinColumn(name = "username", referencedColumnName = "username")
    @ManyToOne(optional = false)
    private Account username;
    @JoinColumn(name = "id_dow", referencedColumnName = "id_dow")
    @ManyToOne(optional = false)
    private DayOfWeek idDow;
    @JoinColumn(name = "id_slot", referencedColumnName = "id_slot")
    @ManyToOne(optional = false)
    private Slot idSlot;

}
