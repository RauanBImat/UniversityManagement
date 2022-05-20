package com.itse1907.bimatrauan.restController;


import com.itse1907.bimatrauan.entity.User;
import com.itse1907.bimatrauan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/api/student")
public class Student {

    UserService userService;


    @Autowired
    public Student(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/profile")
    public User getUser(int id){
        return userService.getUserById(id);
    }

}
