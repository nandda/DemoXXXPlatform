package com.example.demo.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;
@Entity
@Table(name = "mapgroup")

public class MapGroup implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "mapgrp_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int mapgrp_id;

    @Column(name = "mapgrp_name")
    private String  mapgrp_name;

    @Column(name = "mapgrp_descript")
    private String mapgrp_descript;

    @OneToMany(targetEntity = Maps.class, mappedBy = "mapgrp_id", orphanRemoval = false, fetch = FetchType.LAZY)
    private Set<Maps> maps;
}
