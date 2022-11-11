package com.example.serverside.services.impl;

import org.springframework.stereotype.Service;

import com.example.serverside.models.Country;
import com.example.serverside.services.CountryService;
import com.example.serverside.services.generic.impl.GenericServiceImpl;

@Service
public class CountryServiceImpl extends GenericServiceImpl<Country> implements CountryService{
    
}
