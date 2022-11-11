package com.example.serverside.factory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.serverside.models.Country;
import com.example.serverside.models.Region;
import com.example.serverside.models.Country;
import com.example.serverside.repository.CountryRepository;
import com.example.serverside.repository.RegionRepository;
import com.example.serverside.services.RegionService;
import com.example.serverside.services.impl.CountryServiceImpl;
import com.example.serverside.services.impl.RegionServiceImpl;
import com.github.javafaker.Faker;


import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class SimpleDataLoader implements CommandLineRunner {
    
    private RegionServiceImpl regionServiceImpl;
    private CountryServiceImpl countryServiceImpl;
    private CountryRepository countryRepository;
    private RegionRepository regionRepository;
    private Faker faker;


    @Override
    public void run(String... args) throws Exception {
        // createAllRegion();
        // CreateAllCountry();
        
    }

    // Create All Region
    public void createAllRegion(){
        List<Region> ListRegion = new ArrayList<>();
        ListRegion.add( new Region("Amerika",null));
        ListRegion.add( new Region("Asia",null));
        ListRegion.add( new Region("Eropa",null));
        ListRegion.add( new Region("Australia",null));
        regionRepository.saveAll(ListRegion);
        

        
    }

    public void CreateAllCountry(){
        // for( int i = 0 ; i <= 10 ; i ++) {

        //     // Random rand = new Random(); //instance of random class
        //     // int upperbound = 5;
        //     // //generate random values from 0-24
        //     // int int_random = rand.nextInt(upperbound);
        //     // Long id = Long.valueOf(int_random);
        //     Country country = new Country(faker.country().name(), faker.country().countryCode2(), regionServiceImpl.findById(1L), null);
        //    countryServiceImpl.save(country);
        // }


        List<Country> countries = IntStream.rangeClosed(1, 10).mapToObj(mapper -> new Country(faker.country().name(), faker.country().countryCode2(), regionServiceImpl.findById(1L), null)).collect(Collectors.toList());
        countryRepository.saveAll(countries);
        

    }
    

}
