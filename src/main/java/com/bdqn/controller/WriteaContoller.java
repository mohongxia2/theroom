package com.bdqn.controller;

import com.alibaba.fastjson.JSON;
import com.bdqn.entity.Writea;
import com.bdqn.service.WriteaServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/writeall")
public class WriteaContoller {
    @Autowired
    WriteaServiceImp imp;
    @RequestMapping("/list")
    public String list() {

        return "writealist";
    }
    @RequestMapping("/list2")
    public String list2() {

        return "index";
    }
    @RequestMapping(value="/writealisttk", produces= {"application/json;charset=UTF-8"})
    @ResponseBody
    //添加犯罪信息
    public Object findCriName(
            @RequestParam(value="page",required=false)Integer currPage,
            @RequestParam(value="limit",required=false)Integer pageSize){
        System.out.print("进入查询方法...");
        if(currPage==null){//如果当前页为空，则默认为第1页
            currPage=1;
        }
        if(pageSize==null){//如果每页条数为空，则默认为每页10条
            pageSize=10;
        }
        int limitOne  = (currPage- 1) * pageSize;//计算出从哪一条开始显示
        //记录数
        List<Writea> list=imp.findSelect( limitOne, pageSize);
        //总条数
        int count=imp.Count();
        System.out.println("记录数："+count);
        String strJson = JSON.toJSONString(list);
        //layui json 格式
        //String json="{\"code\":0,\"msg\":\"\",\"count\":"+count+",\"data\":"+strJson+"}";
        String json="{\"code\":0,\"msg\":\"\",\"count\":"+count+",\"data\":"+strJson+"}";
        System.out.println("-->"+json);
        return json;

    }
}
