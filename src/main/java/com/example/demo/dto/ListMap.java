package com.example.demo.dto;

import com.example.demo.repository.MapgroupRespository;

import java.util.List;

public class ListMap {
    private int mapgrp_id;
    private String mapgrp_name;
    private String mapgrp_descript;
    private int map_id;
    private String map_code;
    private String map_name;
    private String map_icon;
    private String map_descript;
    private int map_is_lock;
    private String update_at;
    private int mapver_id;
    private String mapver_label;
    private int mapver_type_enum;



public ListMap(int mapgrp_id, String mapgrp_name,
               String mapgrp_descript,int map_id,
               String map_code,String map_name,String map_icon,
               String map_descript,int map_is_lock,String update_at,
               int mapver_id,String mapver_label,int mapver_type_enum) {

    this.mapgrp_id =mapgrp_id;
    this.mapgrp_name = mapgrp_name;
    this.mapgrp_descript = mapgrp_descript;
    this.map_id = map_id;
    this.map_code = map_code;
    this.map_name = map_name;
    this.map_icon = map_icon;
    this.map_descript = map_descript;
    this.map_is_lock = map_is_lock;
    this.update_at = update_at;
    this.mapver_id = mapver_id;
    this.mapver_label =mapver_label;
    this.mapver_type_enum=mapver_type_enum;

}

@Override
    public String toString() {
        return ""+mapgrp_id+","+mapgrp_name+","+mapgrp_descript+","+","+map_id+","+","+map_code+","+map_name+","
                +map_icon+","+map_is_lock+","+update_at+","+mapver_id+","+mapver_label+","+mapver_type_enum;

}
//getters ans setters

}
