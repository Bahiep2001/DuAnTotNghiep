package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "nhanvien")
public class NhanVien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdNV")
    private Integer id_nv;

    private String ma_nV;
    private String ten_nV;
    private String gioi_tinh;
    private Date ngay_sinh;
    private Date ngay_lam_viec;
    private String mat_khau;
    private String sdt;
    private String email;
    private String diachi;
    private String trang_thai;




}