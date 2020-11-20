package com.example.demo.entity;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;
@Entity
@Table(name = "mapversion")
public class MapVersion implements  Serializable{

    @Id
    @Column(name = "mapver_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int mapver_id;

    @Column(name = "map_id")
    private int map_id;

    @Column(name = "mapver_label")
    private String mapver_label;

    @Column(name = "mapver_type_enum")
    private int mapver_type_enum;

    @Column(name = "create_at")
    private String create_at;

    @Column(name = "create_by")
    private String create_by;

    @Column(name = "update_at")
    private String update_at;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "map_id", insertable = false, updatable = false)
    @Fetch(FetchMode.JOIN)
    private Maps maps;

    public MapVersion() {

    }




}
