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
    public void thisisfromqa()
    {
        System.out.println("statred testing code");
    }

    public  void  this_is_from_devreal()
    {
        System.out.println("This is dev real branch");
    }
    public void thisisfromqa1()
    {
        System.out.println("this is qa1 child branch");
    }
    public static void main(String[] args) {
        SpringApplication.run(BranchesDemoApplication.class, args);
        System.out.println("This is master branch");
        System.out.println("this is from dev before merge");
        System.out.println("This is devl brnh");

        System.out.println("Hello");
    }

}
