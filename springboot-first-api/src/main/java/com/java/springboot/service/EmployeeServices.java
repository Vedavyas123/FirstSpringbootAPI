package com.java.springboot.service;

import com.java.springboot.entity.Employee;
import com.java.springboot.entity.EmployeeResponse;
import com.java.springboot.repository.EmployeeRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServices {

    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    ModelMapper mapper;

    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }

    public EmployeeResponse getAllEmployeesById(Integer id) {
        //employee --> employeeResponse
        Employee employee = employeeRepository.findById(id).get();
        EmployeeResponse employeeResponse =new EmployeeResponse();
        employeeResponse = mapper.map(employee, EmployeeResponse.class);
//        employeeResponse.setId(employee.getId());
//        employeeResponse.setEmpName(employee.getEmpName());
//        employeeResponse.setEmpAddress(employee.getEmpAddress());
//        employeeResponse.setEmpMobile(employee.getEmpMobile());
//        employeeResponse.setEmp_flag(employee.getEmp_flag());
        return employeeResponse;
    }
}
