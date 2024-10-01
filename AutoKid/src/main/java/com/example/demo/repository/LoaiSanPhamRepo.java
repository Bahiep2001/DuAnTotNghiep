package com.example.demo.repository;

import com.example.demo.model.LoaiSanPham;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoaiSanPhamRepo extends JpaRepository<LoaiSanPham,Integer> {
}
