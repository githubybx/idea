package com.example.demo.Dao.DaoInter;

import com.example.demo.Entity.CTable;
import com.example.demo.Entity.Course;

import java.util.List;

public interface ChoCourseDao {
    /**
     * 根据sId查询该学生所有选课信息
     * @param sId
     */
    public List<Course> selectCouBysId(int sId);
    /**
     * 根据sId和tId查询该学生关于某个老师的选课信息
     * @param sId
     */
    public List<Course> selectCouBysIdAndTtId(int sId, int tId);
    /**
     * 根据sId和cId查询该学生关于某个老师的某门课的选课信息
     * @param sId
     */
    public Course selectCouBysIdAndcId(int sId, int cId);
    /**
     * 根据sId和cId删除某门选课信息
     * @param sId
     */
    public int deleteCouById(int sId,int cId);

    /**
     * 更新选课信息
     * @param ctable
     */
    public int updateCou(CTable ctable);

    /**
     * 增加选课信息
     * @param ctable
     */
    public int insertCou(CTable ctable);
}
