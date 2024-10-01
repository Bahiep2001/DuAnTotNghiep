package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "NhanVien")
public class NhanVien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idNhanVien;

    private String maNV;
    private String tenNV;
    private String gioiTinh;
    private Date ngaySinh;
    private Date ngayLamViec;
    private String matKhau;
    private String sdt;
    private String email;
    private String diaChi;
    private String trangThaiNV;

    @ManyToOne
    @JoinColumn(name = "idChucVu")
    private ChucVu chucVu;


}