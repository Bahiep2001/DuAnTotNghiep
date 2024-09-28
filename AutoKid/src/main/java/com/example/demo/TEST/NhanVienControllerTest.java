package com.example.demo.TEST;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NhanVienControllerTest {
    @Autowired
    NhanVienRepoTest repo;

    @GetMapping("/nhanvien")
    public List<NhanVien> demo(){
        return repo.findAll();
    }
}
