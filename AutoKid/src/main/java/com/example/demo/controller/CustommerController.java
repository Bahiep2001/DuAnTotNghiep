package com.example.demo.controller;


import com.example.demo.model.GioHangChiTiet;
import com.example.demo.repository.GioHangChiTietRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class CustommerController {
    @Autowired
    GioHangChiTietRepo gioHangChiTietRepo;

    @GetMapping("/custommer_giohang")
    public List<GioHangChiTiet> showGH(){
        return gioHangChiTietRepo.findAll();
    }
}
