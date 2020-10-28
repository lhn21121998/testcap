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
@Table(name = "topic")
@Data
public class Topic implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "topicid")
    private Integer topicid;
    @Column(name = "isdelete")
    private Boolean isdelete;
    @Basic(optional = false)
    @Column(name = "priority")
    private int priority;
    @Basic(optional = false)
    @Column(name = "topicname")
    private String topicname;
    @Basic(optional = false)
    @Column(name = "timefrom")
    @Temporal(TemporalType.DATE)
    private Date timefrom;
    @Basic(optional = false)
    @Column(name = "timeto")
    @Temporal(TemporalType.DATE)
    private Date timeto;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "topicid")
    private Collection<Tourtopic> tourtopicCollection;

}
