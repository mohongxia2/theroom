package com.bdqn.dao;

import com.bdqn.entity.Writea;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface WriteaDao {

    /**
     * 查询所有
     */
    public List<Writea> findSelect(
            @Param("currPage") int currPage,
            @Param("pageSize") int pageSize);

    /**
     * 查询总数
     */
    public int Count();
}
