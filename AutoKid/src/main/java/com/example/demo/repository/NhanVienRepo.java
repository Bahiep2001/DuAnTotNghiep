package com.example.demo.repository;

import com.example.demo.model.NhanVien;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NhanVienRepo extends JpaRepository<NhanVien,Integer> {
}
