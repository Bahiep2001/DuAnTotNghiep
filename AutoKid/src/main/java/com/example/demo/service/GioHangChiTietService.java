package com.example.demo.service;

import com.example.demo.model.GioHangChiTiet;
import com.example.demo.repository.GioHangChiTietRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GioHangChiTietService {
    @Autowired
    GioHangChiTietRepo gioHangChiTietRepo;

    public List<GioHangChiTiet> getAllGHCT(){
        return gioHangChiTietRepo.findAll();
    }
}
