package com.example.springapi;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class User {

    public String name;
    public int age;

    @PostMapping  ("/users") 
    public String CreaetUser(@RequestBody User user){
         return "User Created " + user.name + " " + user.age; // return string
    }

    @PostMapping ("/usersjson")
    public User CreaetUserjson(@RequestBody User user){
        return user;
    }
}
