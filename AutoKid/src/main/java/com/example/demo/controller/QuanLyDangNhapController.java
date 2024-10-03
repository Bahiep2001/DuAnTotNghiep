package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuanLyDangNhapController {

    @RequestMapping ("/home")
    public String index(){
        return "home";
    }
}
