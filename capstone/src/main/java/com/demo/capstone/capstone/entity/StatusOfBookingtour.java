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
@Table(name = "status_of_bookingtour")
@Data
public class StatusOfBookingtour implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_status_bookingtour")
    private Integer idStatusBookingtour;
    @Basic(optional = false)
    @Column(name = "name_stt")
    private String nameStt;
    @OneToMany(mappedBy = "idSttBookingtour")
    private Collection<Bookingtour> bookingtourCollection;

}
