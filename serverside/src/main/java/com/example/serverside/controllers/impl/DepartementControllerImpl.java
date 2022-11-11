package com.example.serverside.controllers.impl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.serverside.controllers.DepartementController;
import com.example.serverside.controllers.generic.impl.GenericControllerImpl;
import com.example.serverside.models.Departement;



@RestController
@RequestMapping("/api/v1/departement")
public class DepartementControllerImpl extends GenericControllerImpl<Departement> implements DepartementController {
    
}
