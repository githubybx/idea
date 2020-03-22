package com.example.demo.Dao.DaoInter;

import com.example.demo.Entity.Course;
import com.example.demo.Entity.Course;

public interface CourseDao {
    /**
     * 根据cId查询课程信息
     * @param cId
     */
    public Course selectCouById(int cId);

    /**
     * 根据cId删除课程信息
     * @param cId
     */
    public int deleteCouById(int cId);

    /**
     * 更新课程信息
     * @param course
     */
    public int updateCou(Course course);

    /**
     * 增加课程信息
     * @param course
     */
    public int insertCou(Course course);
}
