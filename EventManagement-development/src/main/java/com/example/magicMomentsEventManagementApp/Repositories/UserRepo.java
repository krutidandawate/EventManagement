package com.example.magicMomentsEventManagementApp.Repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.magicMomentsEventManagementApp.Models.UserModel;

public interface UserRepo extends JpaRepository<UserModel, Long> {
    List<UserModel> findByUsernameAndPassword(String username, String password);

    
    @Query(value= "SELECT `user_id`, `password`, `user_email`, `user_ph_no`, `username` FROM `user_model` WHERE `username`=?1 and `password`= ?2", nativeQuery = true)
    List<UserModel> Validation(String username, String password);
}
