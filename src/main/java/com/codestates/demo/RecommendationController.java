package com.codestates.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecommendationController {
    @GetMapping("/")
    public String helloWord(){
        return "To-do Application !";
    }
}
