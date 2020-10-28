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
@Table(name = "systemconstraint")
@Data
public class Systemconstraint implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "constraintid")
    private Integer constraintid;
    @Basic(optional = false)
    @Column(name = "constraintname")
    private String constraintname;
    @Basic(optional = false)
    @Column(name = "issoft")
    private boolean issoft;
    @Column(name = "softpriority")
    private Integer softpriority;
    @Basic(optional = false)
    @Column(name = "constraintvalue")
    private String constraintvalue;
    @Column(name = "isdelete")
    private Boolean isdelete;
    @Column(name = "max")
    private Integer max;
    @Column(name = "min")
    private Integer min;
    @Column(name = "datatype")
    private String datatype;

}
