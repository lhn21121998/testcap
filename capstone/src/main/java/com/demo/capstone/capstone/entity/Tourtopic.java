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
@Table(name = "tourtopic")
@Data
public class Tourtopic implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @JoinColumn(name = "bookingid", referencedColumnName = "bookingid")
    @ManyToOne(optional = false)
    private Bookingtour bookingid;
    @JoinColumn(name = "topicid", referencedColumnName = "topicid")
    @ManyToOne(optional = false)
    private Topic topicid;

}
