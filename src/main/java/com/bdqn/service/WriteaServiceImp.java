package com.bdqn.service;

import com.bdqn.dao.WriteaDao;
import com.bdqn.entity.Writea;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WriteaServiceImp {
    @Autowired
    WriteaDao dao;
    /**
     * 查询所有
     */
    public List<Writea> findSelect(int currPage, int pageSize){
            return dao.findSelect(currPage,pageSize);
    }

    /**
     * 查询总数
     */
    public int Count(){
        return dao.Count();
    }
}
