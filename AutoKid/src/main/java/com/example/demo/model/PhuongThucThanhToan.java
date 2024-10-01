package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "PhuongThucThanhToan")
public class PhuongThucThanhToan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPTTT;

    private String maPTTT;

    private String tenPTTT;

    private String maCode;

    private String thongTinThanhToan;

    private String trangThai;

}