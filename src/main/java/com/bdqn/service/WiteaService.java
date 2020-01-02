package com.bdqn.service;

import com.bdqn.entity.Writea;

import java.util.List;

public interface WiteaService {
    /**
     * 查询所有
     */
    public List<Writea> findSelect(int currPage, int pageSize);

    /**
     * 查询总数
     */
    public int Count();
}
