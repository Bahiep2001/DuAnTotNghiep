package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;

@Entity
@Data
@Table(name = "HoaDon")
public class HoaDon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idHoaDon;

    private String maHD;

    @ManyToOne
    @JoinColumn(name = "idKH")
    private KhachHang khachHang;

    @ManyToOne
    @JoinColumn(name = "idNV")
    private NhanVien nhanVien;

    @ManyToOne
    @JoinColumn(name = "idPTTT")
    private PhuongThucThanhToan phuongThucThanhToan;

    private Date ngayTao;

    private Float phiShip;

    private String hinhThucThanhToan;

    private Float tongTien;

    private String trangThaiHD;

}
