package com.example.serverside.controllers.impl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.serverside.controllers.JobController;
import com.example.serverside.controllers.generic.impl.GenericControllerImpl;
import com.example.serverside.models.Job;

@RestController
@RequestMapping("/api/v1/job")
public class JobControllerImpl extends GenericControllerImpl<Job> implements JobController {

}
