package com.example.magicMomentsEventManagementApp.Controllers;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.magicMomentsEventManagementApp.Models.EventModel;
import com.example.magicMomentsEventManagementApp.Repositories.EventRepo;

@RestController
public class GetUserEventsController {
    @Autowired
    EventRepo eventRepo;
    @PostMapping("/getUserEvents")
    public ResponseEntity<Map<String, List<EventModel>>> getUserEvents(@RequestBody Map<String, Long> data) {
        Long userId = data.get("userId");
        List<EventModel> userEvents = eventRepo.findByUserId(userId);
        List<EventModel> pastEvents = new ArrayList<>();
        List<EventModel> upcomingEvents = new ArrayList<>();
        LocalDate today = LocalDate.now();
        for(EventModel e : userEvents) {
            if(e.getEventDate().isBefore(today)) {
                pastEvents.add(e);
            } else {
                upcomingEvents.add(e);
            }
        }
        Map<String, List<EventModel>> response = new HashMap<>();
        response.put("PastEvents", pastEvents);
        response.put("UpcomingEvents", upcomingEvents);
        return ResponseEntity.ok(response);
    }
}
