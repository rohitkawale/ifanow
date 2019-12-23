package com.rohit.OperationsAssignment.repository;

import com.rohit.OperationsAssignment.dto.Event;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EventRepository extends MongoRepository<Event, String> {

}
