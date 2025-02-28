package com.example.magicMomentsEventManagementApp.Controllers;

import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.magicMomentsEventManagementApp.Models.EventModel;
import com.example.magicMomentsEventManagementApp.Repositories.EventRepo;

@RestController
public class GetAllEventsController {

    @Autowired
    EventRepo eventRepo;
    @GetMapping("/getAllEvents")
    public ResponseEntity<List<EventModel>> getAllEvents() {
        List<EventModel> events = eventRepo.findAll();
        return ResponseEntity.ok(events);
    }
}
