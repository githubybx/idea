package com.example.demo.Stu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StuController {
    @Autowired
    StuService stuService;

    @RequestMapping("/SelectStu/{sid}")
    public List<Student> select(@PathVariable("sid") int sid) {
        return stuService.sleect(sid);
    }

    @RequestMapping("/hello")
    public String sayHello() {
        return "hello";
    }

}
