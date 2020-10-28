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
@Table(name = "week")
@Data
public class Week implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_week")
    private Integer idWeek;
    @Basic(optional = false)
    @Column(name = "from")
    @Temporal(TemporalType.DATE)
    private Date from;
    @Basic(optional = false)
    @Column(name = "to")
    @Temporal(TemporalType.DATE)
    private Date to;
    @OneToMany(mappedBy = "idWeek")
    private Collection<Workingplan> workingplanCollection;

}
