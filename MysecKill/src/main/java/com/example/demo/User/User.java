package com.example.demo.User;

public class User {
    String pass;
    String sname;
    int sid;

    public User(String pass, String sname, int sid) {
        this.pass = pass;
        this.sname = sname;
        this.sid = sid;
    }

    public User() {
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }
}
