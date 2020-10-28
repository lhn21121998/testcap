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
@Table(name = "infolanguage")
@Data
public class Infolanguage implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @JoinColumn(name = "inforid", referencedColumnName = "inforid")
    @ManyToOne(optional = false)
    private Information inforid;
    @JoinColumn(name = "languageid", referencedColumnName = "languageid")
    @ManyToOne(optional = false)
    private Language languageid;

}
