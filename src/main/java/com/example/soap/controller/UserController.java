package com.example.soap.controller;

import com.example.soap.model.User;
import com.example.soap.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;

//when we import class User do not use catalina, use SOAP! we wor with soap

@Endpoint
public class UserController {
   @Autowired
    private UserService userService;

/*    private UserService userService;
    public UserController(UserService userService){
        this.userService = userService;*/

    public User getUserRequest(int id){
        return userService.getUsers(id);
    }
}
