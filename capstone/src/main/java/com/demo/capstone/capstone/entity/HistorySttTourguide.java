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
@Table(name = "history_stt_tourguide")
@Data
public class HistorySttTourguide implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_history_stt")
    private Integer idHistoryStt;
    @Basic(optional = false)
    @Column(name = "date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;
    @JoinColumn(name = "username_tourguide", referencedColumnName = "username")
    @ManyToOne(optional = false)
    private Account usernameTourguide;
    @JoinColumn(name = "id_stt_tourguide", referencedColumnName = "id_stt_tourguide")
    @ManyToOne(optional = false)
    private StatusOfTourguide idSttTourguide;

}
