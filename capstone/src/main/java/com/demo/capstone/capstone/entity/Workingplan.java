/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.capstone.capstone.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 *
 * @author Linh Hoang
 */
@Entity
@Table(name = "workingplan")
@Data
public class Workingplan implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "planid")
    private Integer planid;
    @Column(name = "monday")
    private Boolean monday;
    @Column(name = "tuesday")
    private Boolean tuesday;
    @Column(name = "wednesday")
    private Boolean wednesday;
    @Column(name = "thursday")
    private Boolean thursday;
    @Column(name = "friday")
    private Boolean friday;
    @Column(name = "saturday")
    private Boolean saturday;
    @Column(name = "sunday")
    private Boolean sunday;
    @JoinColumn(name = "username", referencedColumnName = "username")
    @ManyToOne(optional = false)
    private Account username;
    @JoinColumn(name = "id_week", referencedColumnName = "id_week")
    @ManyToOne
    private Week idWeek;

}
