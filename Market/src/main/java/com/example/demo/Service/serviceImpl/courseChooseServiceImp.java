package com.example.demo.Service.serviceImpl;

import com.example.demo.Entity.Course;
import com.example.demo.Entity.Student;
import com.example.demo.Service.serviceInter.courseChooseServiceInter;

import java.util.ArrayList;
import java.util.List;

public class courseChooseServiceImp implements courseChooseServiceInter {
    @Override
    public List<Course> getChooseCourseAll(Student student) {
        return null;
    }

    @Override
    public List<Course> getCMsgBySidAndTid(Student student, int tId) {
        List<Course> courses = new ArrayList<>();
        //判断学生信息
        if(student == null){
            return null;
        }else {
            //查询数据库后得到的信息
            return courses;
        }
    }
}
