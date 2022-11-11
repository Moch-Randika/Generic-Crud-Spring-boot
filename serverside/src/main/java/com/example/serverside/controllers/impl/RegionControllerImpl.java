package com.example.serverside.controllers.impl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.serverside.controllers.RegionController;
import com.example.serverside.controllers.generic.impl.GenericControllerImpl;
import com.example.serverside.models.Region;


@RestController
@RequestMapping(path = "/api/v1/region")
public class RegionControllerImpl extends GenericControllerImpl<Region> implements RegionController {

    

}
