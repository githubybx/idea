package com.example.demo.Service.Configuration;

import org.springframework.context.annotation.*;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = "com.example.demo")
@EnableTransactionManagement
public class txConfig {
    @Bean(value = "datasource")
    public DataSource getInstance1(){
        DriverManagerDataSource mysqlDataSource = new DriverManagerDataSource();
        mysqlDataSource.setUrl("jdbc:mysql://localhost:3306/student");
        mysqlDataSource.setPassword("510363");
        mysqlDataSource.setUsername("ybx");
        mysqlDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        System.out.println(mysqlDataSource.getUrl() + " " + mysqlDataSource.getUsername());
        return mysqlDataSource;
    }
    @Bean
    public PlatformTransactionManager getInstance(DataSource dataSource){
        return new DataSourceTransactionManager(dataSource);
    }
}
