package com.bdqn.entity;

/**
 * 默写表
 */
public class Writea {
    private int writeId;//序号
    private int pId;//题目号
    private  String writeWord;//默写单词
    private  int isYes;//默写是否正确
    private  String writeDate;//默写日期
    private  int stuId;//学生ID
    private  int stuClass;//学生班级ID
    private  String pNum; //试卷号
    private Paper paperid;
    private Student studentid;
    private Stuclass stuclassid;

    public Paper getPaperid() {
        return paperid;
    }

    public void setPaperid(Paper paperid) {
        this.paperid = paperid;
    }

    public Student getStudentid() {
        return studentid;
    }

    public void setStudentid(Student studentid) {
        this.studentid = studentid;
    }

    public Stuclass getStuclassid() {
        return stuclassid;
    }

    public void setStuclassid(Stuclass stuclassid) {
        this.stuclassid = stuclassid;
    }

    public int getWriteId() {
        return writeId;
    }

    public void setWriteId(int writeId) {
        this.writeId = writeId;
    }

    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    public String getWriteWord() {
        return writeWord;
    }

    public void setWriteWord(String writeWord) {
        this.writeWord = writeWord;
    }

    public int getIsYes() {
        return isYes;
    }

    public void setIsYes(int isYes) {
        this.isYes = isYes;
    }

    public String getWriteDate() {
        return writeDate;
    }

    public void setWriteDate(String writeDate) {
        this.writeDate = writeDate;
    }

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

    public String getpNum() {
        return pNum;
    }

    public void setpNum(String pNum) {
        this.pNum = pNum;
    }



}
