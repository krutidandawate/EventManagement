package com.example.magicMomentsEventManagementApp.Repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.example.magicMoments.Models.EventModel;

public interface EventRepo extends JpaRepository<EventModel, Long> {
    @Query("SELECT e FROM EventModel e WHERE e.userId = ?1")
    List<EventModel> findByUserId(Long userId);
}
