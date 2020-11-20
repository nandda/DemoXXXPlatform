package com.example.demo.service;

import java.util.List;

import javax.annotation.Resource;


import com.example.demo.dto.ListMap;
import com.example.demo.repository.MapgroupRespository;
import org.springframework.stereotype.Service;

//import com.example.demo.dto.DeptEmpDto;
//import com.example.demo.repository.DepartmentRepository;
//import com.example.demo.repository.EmployeeRepository;

@Service
public class JoinQueryService {

  /* @Resource
    private DepartmentRepository departmentRepository;

    @Resource
    private EmployeeRepository employeeRepository;*/

    @Resource
    private MapgroupRespository mapgroupRespository;


  public List<ListMap> getListMap() {
      List<ListMap> list = mapgroupRespository.fetchListMapDataRightJoin();
      list.forEach(l -> System.out.println(l));
      return list;
  }
/*  public List<DeptEmpDto> getDeptEmployeesLeftJoin() {
        List<DeptEmpDto> list = departmentRepository.fetchEmpDeptDataLeftJoin();
        list.forEach(l -> System.out.println(l));
        return list;
    }

    public List<DeptEmpDto> getDeptEmployeesRightJoin() {
        List<DeptEmpDto> list = departmentRepository.fetchEmpDeptDataRightJoin();
        list.forEach(l -> System.out.println(l));
        return list;
    }

    public List<DeptEmpDto> getDeptEmployeesInnerJoin() {
        List<DeptEmpDto> list = employeeRepository.fetchEmpDeptDataInnerJoin();
        list.forEach(l -> System.out.println(l));
        return list;
    }

    public List<DeptEmpDto> getDeptEmployeesCrossJoin() {
        List<DeptEmpDto> list = employeeRepository.fetchEmpDeptDataCrossJoin();
        list.forEach(l -> System.out.println(l));
        return list;
    }*/




}
