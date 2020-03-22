package com.example.demo.Stu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StuService {
    @Autowired
    StuDao stuDao;

    public List<Student> sleect(int sid) {
        return stuDao.select(sid);
    }
}
