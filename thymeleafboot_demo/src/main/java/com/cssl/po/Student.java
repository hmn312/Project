package com.cssl.po;

import java.util.Date;

public class Student {

    private  Integer sid;
    private  String sname;
    private Date bornDate;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Date getBornDate() {
        return bornDate;
    }

    public void setBornDate(Date bornDate) {
        this.bornDate = bornDate;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", bornDate=" + bornDate +
                '}';
    }

    public Student(Integer sid, String sname, Date bornDate) {
        this.sid = sid;
        this.sname = sname;
        this.bornDate = bornDate;
    }

    public Student() {
    }
}
