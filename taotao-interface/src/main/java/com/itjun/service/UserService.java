package com.itjun.service;

import com.github.pagehelper.PageInfo;
import com.itjun.pojo.User;

import java.util.List;

public interface UserService {
    void save();

    List<User> selectAll();

    PageInfo<User> findByPage(int currtenPage, int pageSize);
}
