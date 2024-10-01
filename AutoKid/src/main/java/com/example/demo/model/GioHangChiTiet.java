package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "GioHangChiTiet")
public class GioHangChiTiet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idGioHangChiTiet;

    @ManyToOne
    @JoinColumn(name = "idSanPhamChiTiet")
    private SanPhamChiTiet sanPhamChiTiet;
    @ManyToOne
    @JoinColumn(name = "idGioHang")
    private GioHang gioHang;
    private int soLuong;
    private Double donGia;

}
