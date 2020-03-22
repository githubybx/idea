package com.example.demo.Dao;

import com.example.demo.Service.Configuration.Student;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.context.annotation.ComponentScan;

import java.util.List;

@ComponentScan(value = "studentDao")
public interface StudentDao {
    @Select("select * from student where id = #{id}")
    public List<Student> select(int id);
    @Insert("insert into student(affoard,award,id) values(#{affoard},#{award},#{id})")
    public int insert(Student student);
}
