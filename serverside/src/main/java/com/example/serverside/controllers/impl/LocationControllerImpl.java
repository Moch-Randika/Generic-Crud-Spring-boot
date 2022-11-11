package com.example.serverside.controllers.impl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.serverside.controllers.LocationController;
import com.example.serverside.controllers.generic.impl.GenericControllerImpl;
import com.example.serverside.models.Location;



@RestController
@RequestMapping("/api/v1/location")
public class LocationControllerImpl extends GenericControllerImpl<Location> implements LocationController {


}
