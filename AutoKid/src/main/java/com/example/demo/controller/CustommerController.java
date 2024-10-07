package com.example.demo.controller;


import com.example.demo.repository.GioHangChiTietRepo;
import com.example.demo.repository.GioHangRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class CustommerController {

    @Autowired
    GioHangChiTietRepo gioHangChiTietRepo;

    @Autowired
    GioHangRepo gioHangRepo;

    @GetMapping("")
    public String home(Model model){
        model.addAttribute("ghct", gioHangChiTietRepo.findAll());
    return "/ogani-master/index";
    }
}
