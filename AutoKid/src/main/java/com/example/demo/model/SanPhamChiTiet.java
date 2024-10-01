package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "SanPhamChiTiet")
public class SanPhamChiTiet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idChiTietSanPham;

    @ManyToOne
    @JoinColumn(name = "idSanPham")
    private SanPham sanPham;

    @ManyToOne
    @JoinColumn(name = "idChatLieu")
    private ChatLieu chatLieu;

    @ManyToOne
    @JoinColumn(name = "idKichCo")
    private KichCo kichCo;

    @ManyToOne
    @JoinColumn(name = "idMauSac")
    private MauSac mauSac;

    @ManyToOne
    @JoinColumn(name = "idThuongHieu")

    private ThuongHieu thuongHieu;

    private String maSPCT;

    private Integer soLuong;

    private Double donGia;

    private String moTa;

    private String anh;

    private String trangThaiSPCT;


}