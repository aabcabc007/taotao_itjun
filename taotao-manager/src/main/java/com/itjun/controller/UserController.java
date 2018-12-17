package com.itjun.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.github.pagehelper.PageInfo;
import com.itjun.pojo.User;
import com.itjun.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Currency;
import java.util.List;

@RestController
public class UserController {
   // @Reference
    private UserService userService;

    @RequestMapping("save")
    public String save(){
        System.out.println("调用了UserController的save方法");

        userService.save();

        return "save success!!";

    }

    @RequestMapping("selectAll")
    public String selectAll(){
        System.out.println("调用了UserController的save方法");

        List<User> list = userService.selectAll();

        for(User user:list){
            System.out.println("user=" + user);
        }

        return "save success!!";

    }

    @RequestMapping("findByPage")
    public PageInfo<User> findByPage(int currentPage, int pageSize) {
        PageInfo<User> page = userService.findByPage(currentPage, pageSize);
        return page;

    }
}
