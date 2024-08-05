package com.java.springboot.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;

@Data
public class EmployeeResponse {
    private Integer id;
    private String empName;
    private String empAddress;
    private String empMobile;
    private String emp_flag;


}
