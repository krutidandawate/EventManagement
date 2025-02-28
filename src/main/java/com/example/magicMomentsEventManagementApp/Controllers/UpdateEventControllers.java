package com.example.magicMomentsEventManagementApp.Controllers;


import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.magicMomentsEventManagementApp.Models.EventModel;
import com.example.magicMomentsEventManagementApp.Repositories.EventRepo;

@RestController
public class UpdateEventControllers {
    @Autowired
    EventRepo eventRepo;
    @PostMapping("/updateEvent")
    public ResponseEntity<EventModel> updateEvent(@RequestBody EventModel event) {
        EventModel existing = eventRepo.findById(event.getEventId()).orElse(null);
        if(existing != null) {
            existing.setEventTime(event.getEventTime());
            existing.setEventVenue(event.getEventVenue());
            EventModel updated = eventRepo.save(existing);
            return ResponseEntity.ok(updated);
        }
        return ResponseEntity.ok(null);
    }
}
