package com.example.demo.Service.serviceInter;

import com.example.demo.Entity.Course;
import com.example.demo.Entity.Student;

import java.util.List;

public interface courseChooseServiceInter {
    /**
     * 查询该生所有选课信息
     * @return
     */
    public List<Course> getChooseCourseAll(Student student);
    /**
     * 查询该生关于某个老师的选课信息
     * @return
     */
    public List<Course> getCMsgBySidAndTid(Student student, int tId);

}
