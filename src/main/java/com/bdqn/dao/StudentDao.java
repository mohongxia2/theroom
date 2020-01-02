package com.bdqn.dao;


import com.bdqn.entity.Student;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StudentDao {
    /**
     * 查询当个对象
     */
    public Student findById(int stuId);
}
