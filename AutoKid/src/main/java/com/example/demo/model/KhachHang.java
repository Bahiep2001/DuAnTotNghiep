package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "KhachHang")
public class KhachHang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idKhachHang;

    private String maKH;
    private String tenKH;
    private String email;
    private String sdt;
    private String diaChi;
    private String matKhau;

    @ManyToOne
    @JoinColumn(name = "idTTVC")
    private ThongTinVanChuyen thongTinVanChuyen;

}