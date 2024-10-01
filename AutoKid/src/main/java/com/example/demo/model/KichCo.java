package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "KichCo")
public class KichCo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idKichCo;

    private String maKC;
    private String tenKC;
    private String trangThaiKC;
    private String moTa;
}