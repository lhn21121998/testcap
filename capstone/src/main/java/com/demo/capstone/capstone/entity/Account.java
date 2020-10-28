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
@Table(name = "account")
@Data
public class Account implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "username")
    private String username;
    @Basic(optional = false)
    @Column(name = "password")
    private String password;
    @Column(name = "isblock")
    private Boolean isblock;
    @Column(name = "timework")
    private String timework;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usernameTourguide")
    private Collection<HistorySttTourguide> historySttTourguideCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "username")
    private Collection<Bookingtour> bookingtourCollection;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "username")
    private Information information;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "username")
    private Collection<Workingplan> workingplanCollection;
    @JoinColumn(name = "roleid", referencedColumnName = "roleid")
    @ManyToOne(optional = false)
    private Role roleid;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "username")
    private Collection<WeeklyTimetable> weeklyTimetableCollection;

}
