package com.example.demo.Dao.DaoInter;

import com.example.demo.Entity.Student;
import com.example.demo.Entity.Teacher;

public interface TecDao {
    /**
     * 根据tId查询老师信息
     * @param tId
     */
    public Teacher selectTeaById(int tId);

    /**
     * 根据tId删除老师信息
     * @param tId
     */
    public int deleteTeaById(int tId);

    /**
     * 更新老师信息
     * @param teacher
     */
    public int updateTea(Teacher teacher);

    /**
     * 增加老师信息
     * @param teacher
     */
    public int insertTea(Teacher teacher);
}
