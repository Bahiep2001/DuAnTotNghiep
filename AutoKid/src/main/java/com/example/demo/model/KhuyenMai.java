package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "KhuyenMai")
public class KhuyenMai {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idKhuyenMai;

    private String maKM;
    private String tenKM;
    private Double mucGiamGia;
    private String dieuKien;
    private Date ngayBatDau;
    private Date ngayKetThuc;
    private String kieuGiamGia;
    private int soLuong;
    private String trangThaiKM;

    @ManyToOne
    @JoinColumn(name = "idHoaDon")
    private HoaDon hoaDon;

}