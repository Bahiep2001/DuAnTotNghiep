package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "MauSac")
public class MauSac {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMauSac;

    private String maMS;

    private String tenMS;

    private String trangThaiMS;


}