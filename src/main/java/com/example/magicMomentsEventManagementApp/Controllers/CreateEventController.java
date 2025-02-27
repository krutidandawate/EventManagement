package com.example.magicMomentsEventManagementApp.Controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.magicMomentsEventManagementApp.Models.EventModel;
import com.example.magicMomentsEventManagementApp.Repositories.EventRepo;

@RestController
public class CreateEventController {
    @Autowired
    EventRepo eventRepo;
    @PostMapping("/createEvent")
    public ResponseEntity<EventModel> createEvent(@RequestBody EventModel event) {
        EventModel e = eventRepo.save(event);
        return ResponseEntity.ok(e);
    }
}
