package com.example.serverside.controllers.impl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.serverside.controllers.CountryController;
import com.example.serverside.controllers.generic.impl.GenericControllerImpl;
import com.example.serverside.models.Country;

@RestController
@RequestMapping("/api/v1/country")
public class CountryControllerImpl extends GenericControllerImpl<Country> implements CountryController {
    
}
