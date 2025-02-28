package com.example.magicMomentsEventManagementApp.Controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.magicMomentsEventManagementApp.Models.UserModel;
import com.example.magicMomentsEventManagementApp.Repositories.UserRepo;

@RestController
public class RegisterController {
    @Autowired
    UserRepo userRepo;
    @PostMapping("/register")
    public ResponseEntity<UserModel> register(@RequestBody UserModel user) {
        UserModel u = userRepo.save(user);
        return ResponseEntity.ok(u);
    }
}