package com.example.demo.Dao.DaoImp;

import com.example.demo.Dao.DaoInter.ChoCourseDao;
import com.example.demo.Entity.CTable;
import com.example.demo.Entity.Course;

import java.util.List;

public class ChoCourseDaoImp implements ChoCourseDao {
    @Override
    public List<Course> selectCouBysId(int sId) {
        return null;
    }

    @Override
    public List<Course> selectCouBysIdAndTtId(int sId, int tId) {
        return null;
    }

    @Override
    public Course selectCouBysIdAndcId(int sId, int cId) {
        return null;
    }

    @Override
    public int deleteCouById(int sId, int cId) {
        return 0;
    }

    @Override
    public int updateCou(CTable ctable) {
        return 0;
    }

    @Override
    public int insertCou(CTable ctable) {
        return 0;
    }
}
