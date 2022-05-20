package com.itse1907.bimatrauan.controller.rest;


import com.itse1907.bimatrauan.entity.User;
import com.itse1907.bimatrauan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/api/student")
public class Student {

    @Autowired
    UserService userService;

    public Student(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/profile/{id}")
    public User getUser(@PathVariable int id){
        return userService.getUserById(id);
    }

}
