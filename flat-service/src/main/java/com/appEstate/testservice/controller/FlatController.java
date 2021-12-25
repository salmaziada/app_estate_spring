package com.appEstate.testservice.controller;

import com.appEstate.testservice.entity.flat;
import com.appEstate.testservice.service.flatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/flat")

public class FlatController {
    @Autowired
    flatService flatService;
    @GetMapping("/all")
    public List GetAll() {
        return flatService.getAll();
    }
    @PostMapping("/")
    public flat saveFlat(@RequestBody  flat flat){
        return  flatService.saveFlat( flat);
    }
    }




