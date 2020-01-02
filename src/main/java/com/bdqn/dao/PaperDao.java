package com.bdqn.dao;

import com.bdqn.entity.Paper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PaperDao {
    /**
     * 查询当个对象
     */
    public Paper findById(int pid);
}
