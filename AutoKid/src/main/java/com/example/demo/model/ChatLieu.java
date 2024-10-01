package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
@Table(name = "ChatLieu")
public class ChatLieu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idChatLieu;

    private String maCL;

    private String tenCL;

    private String trangThaiCL;

}
