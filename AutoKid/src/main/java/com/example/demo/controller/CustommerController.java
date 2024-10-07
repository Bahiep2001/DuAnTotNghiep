package com.example.demo.controller;


import com.example.demo.model.GioHangChiTiet;
import com.example.demo.repository.GioHangChiTietRepo;
import com.example.demo.repository.GioHangRepo;
import com.example.demo.service.GioHangChiTietService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/home")
public class CustommerController {

    @Autowired
    GioHangChiTietService gioHangChiTietService;

    @Autowired
    GioHangRepo gioHangRepo;

    @GetMapping("")
    public String showGioHang(Model model){
        List<GioHangChiTiet> gioHangChiTietList = gioHangChiTietService.getAllGHCT();
        System.out.println(gioHangChiTietList);
        model.addAttribute("ghct", gioHangChiTietList);
        return "/ogani-master/shoping-cart";
    }
}
