package com.ming.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class HelloWorld {

    @GetMapping("/helloworld")
    public String helloworld(){
        System.out.println("当前线程名称："+Thread.currentThread().getName());
        return "Hello World!";
    }

    @PostMapping("/helloworld1")
    public String helloworld1(){
        System.out.println("当前线程名称："+Thread.currentThread().getName());
        return "Hello World!";
    }
}
