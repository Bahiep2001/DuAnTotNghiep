package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "SanPham")
public class SanPham {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idSanPham;

    private String maSP;

    private String tenSP;

    private String trangThaiSP;

    @ManyToOne
    @JoinColumn(name = "idLoaiSP")
    private LoaiSanPham loaiSanPham;


}
