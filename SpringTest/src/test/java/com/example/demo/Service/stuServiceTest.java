package com.example.demo.Service;

import com.example.demo.Dao.StudentDao;
import com.example.demo.Dao.Stuservice;
import com.example.demo.Service.Configuration.Student;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {Stuservice.class,StudentDao.class})
class stuServiceTest {
    @Autowired
    Stuservice stuservice;
    @Test
    void getCount() {
        System.out.println(stuservice == null);
    }
}