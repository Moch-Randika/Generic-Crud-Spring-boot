package com.example.serverside.services.impl;

import org.springframework.stereotype.Service;

import com.example.serverside.models.Job;
import com.example.serverside.services.JobService;
import com.example.serverside.services.generic.impl.GenericServiceImpl;

@Service
public class JobServiceImpl extends GenericServiceImpl<Job> implements JobService {
    
}
