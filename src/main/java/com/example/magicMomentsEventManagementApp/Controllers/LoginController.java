package com.example.magicMomentsEventManagementApp.Controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.magicMomentsEventManagementApp.Models.UserModel;
import com.example.magicMomentsEventManagementApp.Repositories.UserRepo;

@RestController
public class LoginController {
    @Autowired
    UserRepo userRepo;
    @PostMapping("/login")
    public ResponseEntity<Map<String, String>> login(@RequestBody UserModel user) {
        Map<String, String> response = new HashMap<>();
        List<UserModel> list = userRepo.findByUsernameAndPassword(user.getUsername(), user.getPassword());
        if(list.size() == 0) {
            response.put("Sign In", "Failed");
            response.put("User", "Not found");
        } else {
            String pwd = list.get(0).getPassword();
            if(!user.getPassword().equals(pwd)) {
                response.put("Sign In", "Failed");
                response.put("User", "Invalid password");
            } else {
                response.put("Sign In", "Success");
                response.put("UserId", Long.toString(list.get(0).getUserId()));
                response.put("Username", list.get(0).getUsername());
            }
        }
        return ResponseEntity.ok(response);
    }
}