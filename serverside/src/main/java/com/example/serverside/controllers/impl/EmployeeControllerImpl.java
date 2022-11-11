package com.example.serverside.controllers.impl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.serverside.controllers.EmployeeController;
import com.example.serverside.controllers.generic.impl.GenericControllerImpl;
import com.example.serverside.models.Employee;

@RestController
@RequestMapping("/api/v1/employee")
public class EmployeeControllerImpl extends GenericControllerImpl<Employee> implements EmployeeController {
    
}
