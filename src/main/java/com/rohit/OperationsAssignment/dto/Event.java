package com.rohit.OperationsAssignment.dto;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collation = "events")
public class Event {
    @Id
    private String userId;
    private String latLong;
    private String ts;
    private String noun;
    private String verb;
    private int timeSpent;
    private String properties;


}
