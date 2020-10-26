package com.example.service;

import com.example.pojo.Role;

import java.util.List;

public interface UserService {
    public Role getUser();
    List<Role> getAllUser();
}
