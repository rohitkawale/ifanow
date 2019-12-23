package com.rohit.OperationsAssignment.service;

import com.rohit.OperationsAssignment.dto.Event;
import com.rohit.OperationsAssignment.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventService {

    @Autowired
    EventRepository eventRepository;


    public void postEvent(Event event) {
        eventRepository.insert(event);
    }
}
