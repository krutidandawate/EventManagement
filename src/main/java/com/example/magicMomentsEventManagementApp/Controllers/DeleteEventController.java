package com.example.magicMomentsEventManagementApp.Controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.magicMomentsEventManagementApp.Models.EventModel;
import com.example.magicMomentsEventManagementApp.Repositories.EventRepo;

@RestController
public class DeleteEventController {
    @Autowired
    EventRepo eventRepo;
    @PostMapping("/deleteEvent")
    public ResponseEntity<String> deleteEvent(@RequestBody EventModel event) {
        eventRepo.deleteById(event.getEventId());
        return ResponseEntity.ok("Event Deleted");
    }
}
