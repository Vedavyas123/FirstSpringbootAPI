package com.java.springboot.controller;

import com.java.springboot.entity.Employee;
import com.java.springboot.entity.EmployeeResponse;
import com.java.springboot.service.EmployeeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    @Autowired
    EmployeeServices employeeServices;
    @GetMapping("/fetchAllEmployees")
    public List<Employee> getAllEmployees(){
        return employeeServices.getAllEmployees();
    }

    @GetMapping("/fetchAllEmployees/{id}")
    public ResponseEntity<EmployeeResponse> getAllEmployeesbyId(@PathVariable Integer id){
        EmployeeResponse employeeResponse = employeeServices.getAllEmployeesById(id);
        return  ResponseEntity.status(HttpStatus.OK).body(employeeResponse);
    }
}
