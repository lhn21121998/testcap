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
@Table(name = "status_of_tourguide")
@Data
public class StatusOfTourguide implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_stt_tourguide")
    private Integer idSttTourguide;
    @Column(name = "name_of_stt")
    private String nameOfStt;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idSttTourguide")
    private Collection<HistorySttTourguide> historySttTourguideCollection;

}
