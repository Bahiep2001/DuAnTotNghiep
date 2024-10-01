package com.example.demo.repository;

import com.example.demo.model.GioHang;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GioHangRepo extends JpaRepository<GioHang,Integer> {
}
