package com.yeditepe.comp301.controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @PostMapping("autenticate")
    public String autenticate(String username, String password) {
        return "";
    }

    @GetMapping("welcome")
    public String welcome() {
        return "Welcome Spring Boot";
    }


}
