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

    public void this_is_master()
    {
        System.out.println("This is master");
    }
    public void this_is_dev()
    {
        System.out.println("this is from dev");
    }
    public void this_is_master_2()
    {
        System.out.println("this is from master");

    }
    public static void main(String[] args) {
        SpringApplication.run(BranchesDemoApplication.class, args);

    }

}
