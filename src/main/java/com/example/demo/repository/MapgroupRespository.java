package com.example.demo.repository;

import java.util.List;

import com.example.demo.dto.ListMap;
import com.example.demo.entity.MapGroup;
import com.example.demo.entity.MapVersion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories("com.example.demo.repository")
public interface MapgroupRespository extends JpaRepository<MapGroup,Integer> {

/*    @Query("SELECT new com.example.demo.dto.ListMap(d.mapgrp_id,d.mapgrp_name,d.mapgrp_descript,e.map_id,e.map_code,e.map_name,e.map_icon,e.map_descript," +
            "e.map_is_lock,e.update_at) "+ "FROM MapGroup d LEFT JOIN d.maps  e")
            List<ListMap> fetchListMapDataRightJoin();*/

 /*   @Query("SELECT new com.example.demo.dto.ListMap(d.mapgrp_id,d.mapgrp_name,d.mapgrp_descript,e.map_id,e.map_code,e.map_name,e.map_icon,e.map_descript," +
            "e.map_is_lock,e.update_at,f.mapver_id,f.mapver_label,f.mapver_type_enum) "+ "FROM MapGroup d LEFT JOIN d.Maps e LEFT JOIN e.mapVersions f")
    List<ListMap> fetchListMapDataRightJoin();*/

    @Query("SELECT new com.example.demo.dto.ListMap(d.mapgrp_id,d.mapgrp_name,d.mapgrp_descript,e.map_id,e.map_code,e.map_name,e.map_icon,e.map_descript," +
            "e.map_is_lock,e.update_at,f.mapver_id,f.mapver_label,f.mapver_type_enum) "+ "FROM MapVersion f LEFT JOIN f.maps e LEFT JOIN e.mapGroup d")
    List<ListMap> fetchListMapDataRightJoin();

}
