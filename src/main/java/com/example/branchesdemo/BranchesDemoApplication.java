package com.example.branchesdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLOutput;


@SpringBootApplication
@RestController
@RequestMapping
public class BranchesDemoApplication {

    @GetMapping("/test")
    public String test()
    {
        return "Branches demo";
    }

    public  void new_requirment_from_master()
    {
        System.out.println("tHIS IS FROM MASTER");
    }
    public void writingcode()
    {
        System.out.println("wring code");
    }
    public static void main(String[] args) {
        SpringApplication.run(BranchesDemoApplication.class, args);

    }

}
