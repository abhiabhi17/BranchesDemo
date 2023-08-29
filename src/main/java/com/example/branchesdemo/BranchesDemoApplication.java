package com.example.branchesdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
@RequestMapping
public class BranchesDemoApplication {

    @GetMapping("/test")
    public String test()
    {
        return "Branches demo";
    }

    public void test1()
    {
        System.out.println("this is testing ");
    }
    public static void main(String[] args) {
        SpringApplication.run(BranchesDemoApplication.class, args);

    }

}
