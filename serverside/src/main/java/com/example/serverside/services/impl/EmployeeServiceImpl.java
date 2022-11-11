package com.example.serverside.services.impl;

import org.springframework.stereotype.Service;

import com.example.serverside.models.Employee;
import com.example.serverside.services.EmployeeService;
import com.example.serverside.services.generic.impl.GenericServiceImpl;

@Service
public class EmployeeServiceImpl extends GenericServiceImpl<Employee> implements EmployeeService{
    
}
