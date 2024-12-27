package com.shreyas.Journal.controller;

import com.shreyas.Journal.entity.User;
import com.shreyas.Journal.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/public")
public class PublicController {

    @Autowired
    private UserService userService;

    @PostMapping("/create-user")
    public void AddUSer(@RequestBody User user){
        userService.saveNewUser(user);
    }

}