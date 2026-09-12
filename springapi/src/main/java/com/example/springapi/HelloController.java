package com.example.springapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //tells spring it hadles http req
public class HelloController {
     
    @GetMapping ("/hello") // maps get hellow req to a perticualr method ( here hello method is defined belwo)
    public String hello(){
        return "Hellow from spring boot";
    }
}
