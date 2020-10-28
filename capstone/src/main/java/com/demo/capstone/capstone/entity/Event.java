/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.capstone.capstone.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Linh Hoang
 */
@Entity
@Table(name = "event")
@Data
public class Event implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "eventid")
    private Integer eventid;
    @Basic(optional = false)
    @Column(name = "eventname")
    private String eventname;
    @Basic(optional = false)
    @Column(name = "timefrom")
    @Temporal(TemporalType.DATE)
    private Date timefrom;
    @Basic(optional = false)
    @Column(name = "timeto")
    @Temporal(TemporalType.DATE)
    private Date timeto;
    @Basic(optional = false)
    @Column(name = "isdelete")
    private boolean isdelete;

}
