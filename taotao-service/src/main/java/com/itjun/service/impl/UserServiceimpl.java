package com.itjun.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itjun.mapper.UserMapper;
import com.itjun.pojo.User;
import com.itjun.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class UserServiceimpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public void save() {
        System.out.println("调用了UserServiceimpl的save方法");

    }

    @Override
    public List<User> selectAll() {

        //

        return userMapper.selectAll();
    }

    @Override
    public PageInfo<User> findByPage(int currtenPage, int pageSize) {
        PageHelper.startPage(currtenPage,pageSize);
        List<User> list=userMapper.selectAll();
        return new PageInfo<>(list);
    }
}
