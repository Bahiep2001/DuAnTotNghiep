package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "GioHang")
public class GioHang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idGioHang;

    private String trangThai;
    private Date ngayTao;

    @ManyToOne
    @JoinColumn(name = "idKhachHang")
    private KhachHang khachHang;

}