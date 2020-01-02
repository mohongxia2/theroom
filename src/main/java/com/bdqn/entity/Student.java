package com.bdqn.entity;

/**
 * 学生表
 */
public class Student {
    private  int stuId;//学生编号
    private  int stuClass;//学生班级ID
    private  String stuName;//学生姓名
    private  String stuPwd;//学生密码
    private  String stuPhone;//学生手机号
    private  String parPhone;//家长手机号

    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    public int getStuClass() {
        return stuClass;
    }

    public void setStuClass(int stuClass) {
        this.stuClass = stuClass;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuPwd() {
        return stuPwd;
    }

    public void setStuPwd(String stuPwd) {
        this.stuPwd = stuPwd;
    }

    public String getStuPhone() {
        return stuPhone;
    }

    public void setStuPhone(String stuPhone) {
        this.stuPhone = stuPhone;
    }

    public String getParPhone() {
        return parPhone;
    }

    public void setParPhone(String parPhone) {
        this.parPhone = parPhone;
    }
}
