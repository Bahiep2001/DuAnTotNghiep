package com.example.demo.TEST;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NhanVienControllerTest {
    @Autowired
    NhanVienRepoTest repo;

    @GetMapping("/nhanvien")
    public String demo(){
        return "/ogani-master/index";
    }

    @GetMapping("/blog")
    public String demo2(){
        return  "/ogani-master/blog";
        }
}
