package com.example.demo.Dao;

import com.example.demo.Service.Configuration.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StuController {
    @Autowired
    Stuservice stuservice;
@RequestMapping("/getAll")
    public List<Student> select(){
    return stuservice.selectAll(1);
   }
}
