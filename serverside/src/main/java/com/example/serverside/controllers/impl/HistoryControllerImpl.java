package com.example.serverside.controllers.impl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.serverside.controllers.HistoryController;
import com.example.serverside.controllers.generic.impl.GenericControllerImpl;
import com.example.serverside.models.History;

@RestController
@RequestMapping("/api/v1/history")
public class HistoryControllerImpl extends GenericControllerImpl<History> implements HistoryController {

}
