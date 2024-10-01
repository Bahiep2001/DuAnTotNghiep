package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "HoaDonChiTiet")
public class HoaDonChiTiet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idHoaDonChiTiet;

    @ManyToOne
    @JoinColumn(name = "idHD")
    private HoaDon hoaDon;

    @ManyToOne
    @JoinColumn(name = "idSanPhamChiTiet")
    private SanPhamChiTiet sanPhamChiTiet;

    private Integer soLuong;

    private Double donGia;

    private Double donGiaSauGiam;

}
