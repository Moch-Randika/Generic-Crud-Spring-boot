package com.example.serverside.services.impl;

import org.springframework.stereotype.Service;

import com.example.serverside.models.Location;
import com.example.serverside.services.LocationService;
import com.example.serverside.services.generic.impl.GenericServiceImpl;

@Service
public class LocationServiceImpl extends GenericServiceImpl<Location> implements LocationService {
    
}
