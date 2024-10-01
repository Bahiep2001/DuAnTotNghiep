package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "LoaiSP")
public class LoaiSanPham {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idLoaiSP;

    private String maLSP;

    private String tenLoai;

    private String trangThai;

    private String moTa;

}