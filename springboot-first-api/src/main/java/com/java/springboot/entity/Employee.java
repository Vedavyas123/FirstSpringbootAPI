package com.java.springboot.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "emp_name")
    private String empName;
    @Column(name = "emp_address")
    private String empAddress;
    @Column(name = "emp_mobile")
    private String empMobile;
    @Column(name = "emp_flag")
    private String emp_flag;

}
