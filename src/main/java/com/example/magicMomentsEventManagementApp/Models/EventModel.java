package com.example.magicMomentsEventManagementApp.Models;

import java.time.LocalDate;
import java.time.LocalTime;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class EventModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long eventId;
    private String eventName;
    private String eventDuration;
    private LocalTime eventTime;
    private LocalDate eventDate;
    private String eventVenue;
    private String status;
    private Long userId;
    public Long getEventId() {
        return eventId;
    }
    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }
    public String getEventName() {
        return eventName;
    }
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }
    public String getEventDuration() {
        return eventDuration;
    }
    public void setEventDuration(String eventDuration) {
        this.eventDuration = eventDuration;
    }
    public LocalTime getEventTime() {
        return eventTime;
    }
    public void setEventTime(LocalTime eventTime) {
        this.eventTime = eventTime;
    }
    public LocalDate getEventDate() {
        return eventDate;
    }
    public void setEventDate(LocalDate eventDate) {
        this.eventDate = eventDate;
    }
    public String getEventVenue() {
        return eventVenue;
    }
    public void setEventVenue(String eventVenue) {
        this.eventVenue = eventVenue;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public Long getUserId() {
        return userId;
    }
    public void setUserId(Long userId) {
        this.userId = userId;
    }
    public EventModel(Long eventId, String eventName, String eventDuration, LocalTime eventTime, LocalDate eventDate, String eventVenue, String status, Long userId) {
        this.eventId = eventId;
        this.eventName = eventName;
        this.eventDuration = eventDuration;
        this.eventTime = eventTime;
        this.eventDate = eventDate;
        this.eventVenue = eventVenue;
        this.status = status;
        this.userId = userId;
    }
    public EventModel() {}
}
