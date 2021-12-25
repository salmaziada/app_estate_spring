package com.appEstate.testservice.controller;

import com.appEstate.testservice.entity.user;
import com.appEstate.testservice.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")

public class UserController {
    @Autowired
    userService userService;
    @GetMapping("/all")
    public List GetAll() {
        return userService.getAll();
    }
    @PostMapping("/")
    public user saveFlat(@RequestBody user user){
        return  userService.saveUser(user);
    }

    }




