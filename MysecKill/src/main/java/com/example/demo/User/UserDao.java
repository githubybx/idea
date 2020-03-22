package com.example.demo.User;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserDao {
    @Select("select * from User where sname = #{sname} && pass = #{pass}")
    public User SelectBySnameAndPass(String sname, String pass);
}
