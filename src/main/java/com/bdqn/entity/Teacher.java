package com.bdqn.entity;

/**
 * 教师表
 */
public class Teacher {
    private  int tId;//教师ID
    private  String stuClass;//班级ID
    private  String tName;//教师姓名
    private  String tPwd;//教师密码
    private  String tPhone;//教师手机号

    public int gettId() {
        return tId;
    }

    public void settId(int tId) {
        this.tId = tId;
    }

    public String getStuClass() {
        return stuClass;
    }

    public void setStuClass(String stuClass) {
        this.stuClass = stuClass;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    public String gettPwd() {
        return tPwd;
    }

    public void settPwd(String tPwd) {
        this.tPwd = tPwd;
    }

    public String gettPhone() {
        return tPhone;
    }

    public void settPhone(String tPhone) {
        this.tPhone = tPhone;
    }
}
