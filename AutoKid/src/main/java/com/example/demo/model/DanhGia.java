package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "DanhGia")
public class DanhGia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDanhGia;

    @ManyToOne
    @JoinColumn(name = "idSanPhamChiTiet")
    private SanPhamChiTiet sanPhamChiTiet;

    private String noiDungDanhGia;
    private Date ngayTao;
    private Integer soSao;

}