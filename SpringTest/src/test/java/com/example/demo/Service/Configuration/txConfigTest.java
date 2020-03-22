package com.example.demo.Service.Configuration;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.test.context.ContextConfiguration;

import javax.sql.DataSource;

import static org.junit.jupiter.api.Assertions.*;

class txConfigTest {
    @Test
    public void getsth(){
        ApplicationContext ac = new AnnotationConfigApplicationContext("com.example.demo.Service.Configuration");
        DriverManagerDataSource student = (DriverManagerDataSource) ac.getBean("datasource");
        System.out.println(student.getUrl());
    }

}