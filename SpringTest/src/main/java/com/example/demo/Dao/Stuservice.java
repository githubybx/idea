package com.example.demo.Dao;

import com.example.demo.Service.Configuration.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service(value = "studentService")
public class Stuservice {
    @Autowired
    StudentDao studentDao;
    public List<Student> selectAll(int id){
        return studentDao.select(id);
    }
    public void insertById(Student student){
        studentDao.insert(student);
    }
}
