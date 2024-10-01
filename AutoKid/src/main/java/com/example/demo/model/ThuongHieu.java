package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "ThuongHieu")
public class ThuongHieu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idThuongHieu;

    private String maTH;

    private String tenTH;

    private String trangThaiTH;

    private String diaChi;

}