package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;

@Data
@Entity
@Table(name = "HoaDon_History")
public class HoaDonHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idLichSuHoaDon;

    @ManyToOne
    @JoinColumn(name = "idHD")
    HoaDon hoaDon;


    private Date ngayThayDoi;

    private Date ngayTao;

    private String trangThai;


}

