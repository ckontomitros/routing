package com.plato.routing.controllers;

import com.plato.routing.services.LoginService;
import dto.LoginDto;
import dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    LoginService loginService;
    @PostMapping("/login")
    public String authenticate(@RequestBody LoginDto loginDto){
        loginService.authenticateUser(loginDto);
        return "Success";
    }

    @PostMapping("/signIn")
    public String signIn (@RequestBody UserDto user){
        return "Success";

    }



}
