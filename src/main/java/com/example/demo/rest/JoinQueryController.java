package com.example.demo.rest;

import java.util.List;

import com.example.demo.dto.ListMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//import com.example.demo.dto.DeptEmpDto;
import com.example.demo.service.JoinQueryService;

//import com.example.demo.repository.EmployeeRepository;


@RestController
@RequestMapping("/api")
//@ResponseBody
public class JoinQueryController {

    @Autowired
    private JoinQueryService joinQueryService;


  /*  @GetMapping("/dept/employees/left")
    public ResponseEntity<List<DeptEmpDto>> getDeptEmployeesLeftJoin() {
        return new ResponseEntity<List<DeptEmpDto>>(joinQueryService.getDeptEmployeesLeftJoin(), HttpStatus.OK);
    }

    @GetMapping("/dept/employees/right")
    public ResponseEntity<List<DeptEmpDto>> getDeptEmployeesRightJoin() {
        return new ResponseEntity<List<DeptEmpDto>>(joinQueryService.getDeptEmployeesRightJoin(), HttpStatus.OK);
    }

    @GetMapping("/dept/employees/inner")
    public ResponseEntity<List<DeptEmpDto>> getDeptEmployeesInnerJoin() {
        return new ResponseEntity<List<DeptEmpDto>>(joinQueryService.getDeptEmployeesInnerJoin(), HttpStatus.OK);
    }

    @GetMapping("/dept/employees/cross")
    public ResponseEntity<List<DeptEmpDto>> getDeptEmployeesCrossJoin() {
        return new ResponseEntity<List<DeptEmpDto>>(joinQueryService.getDeptEmployeesCrossJoin(), HttpStatus.OK);
    }*/
    
    @GetMapping(value="/ListMap")
    public ResponseEntity<List<ListMap>> getListMap() {
        return new ResponseEntity<List<ListMap>>(joinQueryService.getListMap(),HttpStatus.OK);
    }
    

}
