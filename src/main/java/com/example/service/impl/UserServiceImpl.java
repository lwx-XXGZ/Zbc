package com.example.service.impl;

import com.example.mapper.RoleMapper;
import com.example.pojo.Role;
import com.example.service.UserService;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private RoleMapper userMapper;
    @Override
    public Role getUser() {

        return userMapper.selectByPrimaryKey(1);
    }

    @Override
    public List<Role> getAllUser() {
        return userMapper.selectAllUser();
    }
}
