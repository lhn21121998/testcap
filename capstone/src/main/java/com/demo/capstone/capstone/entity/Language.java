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
@Table(name = "language")
@Data
public class Language implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "languageid")
    private Integer languageid;
    @Basic(optional = false)
    @Column(name = "languagename")
    private String languagename;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "languageid")
    private Collection<Infolanguage> infolanguageCollection;

}
