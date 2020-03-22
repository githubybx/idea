package com.example.demo.Stu;

public class Student {
    int sid;
    String sname;
    String pass;

    public Student(int sid, String sname, String pass) {
        this.sid = sid;
        this.sname = sname;
        this.pass = pass;
    }

    public Student() {
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
