package com.example.demoyangu;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentsController {


    @GetMapping("/")
    private String demoyangu(){

        int a = 10;
        int b = 20;
        int hello= a+b;
        return "Hello wordl";
    }
}
