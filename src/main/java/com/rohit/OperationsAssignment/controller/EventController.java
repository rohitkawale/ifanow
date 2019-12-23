package com.rohit.OperationsAssignment.controller;

import com.rohit.OperationsAssignment.dto.Event;
import com.rohit.OperationsAssignment.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class EventController {

    @Autowired
    EventService eventService;

    @PostMapping("/event")
    public void event(@RequestBody Event event){
        eventService.postEvent(event);
    }
}
