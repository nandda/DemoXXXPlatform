package com.example.demo.entity;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;
@Entity
@Table(name = "maps")
public class Maps implements  Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "map_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int map_id;

    @Column(name = "mapgrp_id")
    private int mapgrp_id;

    @Column(name = "map_code")
    private String map_code;

    @Column(name = "map_name")
    private String map_name;

    @Column(name = "map_icon")
    private String map_icon;

    @Column(name = "map_descript")
    private String map_descript;

    @Column(name = "map_keys")
    private String map_keys;

    @Column(name = "map_is_main")
    private int map_is_main;

    @Column(name = "map_is_extend")
    private int map_is_extend;

    @Column(name = "project_id")
    private int project_id;

    @Column(name = "map_is_lock")
    private int map_is_lock;

    @Column(name = "map_parent_id")
    private int map_parent_id;

    @Column(name = "map_parent_ver_id")
    private int map_parent_ver_id;

    @Column(name = "create_at")
    private String create_at;

    @Column(name = "create_by")
    private String create_by;

    @Column(name = "update_at")
    private String update_at;

    @Column(name = "update_by")
    private String update_by;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "mapgrp_id", insertable = false, updatable = false)
    @Fetch(FetchMode.JOIN)
    private MapGroup mapGroup;


    @OneToMany(targetEntity = MapVersion.class, mappedBy = "map_id", orphanRemoval = false, fetch = FetchType.LAZY)
    private Set<MapVersion> mapVersions;
}

