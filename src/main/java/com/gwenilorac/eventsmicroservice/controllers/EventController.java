package com.gwenilorac.eventsmicroservice.controllers;

import com.gwenilorac.eventsmicroservice.domain.Event;
import com.gwenilorac.eventsmicroservice.dtos.EventRequestDTO;
import com.gwenilorac.eventsmicroservice.dtos.SubscriptionRequestDTO;
import com.gwenilorac.eventsmicroservice.exceptions.EventFullException;
import com.gwenilorac.eventsmicroservice.exceptions.EventNotFoundException;
import com.gwenilorac.eventsmicroservice.services.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/events")
public class EventController {

    @Autowired
    private EventService eventService;

    @GetMapping
    public List<Event> getAllEvents() {
        return eventService.getAllEvents();
    }

    @GetMapping("/upcoming")
    public List<Event> getUpcomingEvents() {
        return eventService.getUpcomingEvents();
    }

    @PostMapping
    public Event createEvent(@RequestBody EventRequestDTO event) {
        return eventService.createEvent(event);
    }

    @PostMapping("/{eventId}/register")
    public ResponseEntity<String> registerParticipant(@PathVariable String eventId, @RequestBody SubscriptionRequestDTO subscriptionRequest) {
        eventService.registerParticipant(eventId, subscriptionRequest.participantEmail());
        return ResponseEntity.ok("Event created successfully");
    }
}
