package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "giohangchitiet")
public class GioHangChiTiet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdGioHangChiTiet")
    private Integer id_gio_hang_chi_tiet;

    @ManyToOne
    @JoinColumn(name = "IdSanPhamChiTiet")
    private SanPhamChiTiet san_pham_chi_tiet;

    @ManyToOne
    @JoinColumn(name = "IdGioHang")
    private GioHang gio_hang;

    @Column(name = "SoLuong")
    private int so_luong;

    @Column(name = "DonGia")
    private Double don_gia;

}
