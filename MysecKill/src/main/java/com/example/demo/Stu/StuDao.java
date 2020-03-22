package com.example.demo.Stu;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface StuDao {
    @Select("Select * from Student where sid = #{sid}")
    public List<Student> select(int sid);
}
