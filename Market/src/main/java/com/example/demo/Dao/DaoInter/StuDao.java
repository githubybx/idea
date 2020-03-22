package com.example.demo.Dao.DaoInter;

import com.example.demo.Entity.Student;

public interface StuDao {
    /**
     * 根据sId查询学生信息
     * @param sId
     */
    public Student selectStuById(int sId);

    /**
     * 根据sId删除学生信息
     * @param sId
     */
    public int deleteStuById(int sId);

    /**
     * 更新学生信息
     * @param student
     */
    public int updateStu(Student student);

    /**
     * 增加学生信息
     * @param student
     */
    public int insertStu(Student student);

}
