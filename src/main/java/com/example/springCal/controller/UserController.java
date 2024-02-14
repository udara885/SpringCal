package com.example.springCal.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/user")
@CrossOrigin

public class UserController {
    @GetMapping("/add")
    public String add(@RequestParam int a , int b){
        return "Addition = "+(a+b);
    }
}
