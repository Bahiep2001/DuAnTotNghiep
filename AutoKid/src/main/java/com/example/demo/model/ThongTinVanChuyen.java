package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "ThongTinVanChuyen")
public class ThongTinVanChuyen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idTTVC;

    private String maTTVC;

    private String tinh;

    private String huyen;

    private String xa;

    private String diaChi;

    private String tenNguoiNhan;

    private String sdt;


}