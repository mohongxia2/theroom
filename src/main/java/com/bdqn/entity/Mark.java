package com.bdqn.entity;

/**
 * 分数表
 */
public class Mark {
    private int mId;//分数序号
    private  int stuId;//学生ID
    private  int stuClass;//学生班级ID
    private  double mark;//学生分数
    private  String markDate;//分数日期
    private  int isflag;//是否发送给家长
    private  String remark;//备注
    private  String pNum;//试卷号

    public int getmId() {
        return mId;
    }

    public void setmId(int mId) {
        this.mId = mId;
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

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public String getMarkDate() {
        return markDate;
    }

    public void setMarkDate(String markDate) {
        this.markDate = markDate;
    }

    public int getIsflag() {
        return isflag;
    }

    public void setIsflag(int isflag) {
        this.isflag = isflag;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getpNum() {
        return pNum;
    }

    public void setpNum(String pNum) {
        this.pNum = pNum;
    }
}
