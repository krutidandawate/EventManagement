package com.example.magicMomentsEventManagementApp.Repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.magicMomentEventManagementApps.Models.UserModel;

public interface UserRepo extends JpaRepository<UserModel, Long> {
    List<UserModel> findByUsernameAndPassword(String username, String password);
}
