package com.example.demo.User;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/authenticated")
public class UserController {

    @GetMapping("/user")
    public String any(){

     return "Authenticated" ;
    }

    @GetMapping("/admin")
    public String admin(){

        return "Authenticated + admin" ;
    }
}
