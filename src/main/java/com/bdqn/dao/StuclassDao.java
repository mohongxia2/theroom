package com.bdqn.dao;

import com.bdqn.entity.Stuclass;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StuclassDao {
    /**
     * 查询当个对象
     */
    public Stuclass findById(int classId);
}
