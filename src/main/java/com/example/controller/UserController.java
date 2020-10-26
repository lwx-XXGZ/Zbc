package com.example.controller;

import com.example.pojo.Role;
import com.example.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class UserController {
    @Resource
    private UserService userService;
    @RequestMapping("getuser")
    @ResponseBody
    public Role getUser(){
        System.out.println(userService.getUser());
        return userService.getUser();
    }
    @RequestMapping("dd")
    public String dd(){
        return "a";
    }
    @RequestMapping("getAllUser")
    @ResponseBody
    public  Object getAllUser(){
        return userService.getAllUser();
    }
    @RequestMapping("zzx")
    @ResponseBody
    public Object findAllDUser(Integer pageNo,Integer pageSize){
        PageHelper.offsetPage((pageNo-1)*pageSize,pageSize);
        List<Role> userList=userService.getAllUser();
        PageInfo<Role> pageInfo=new PageInfo<Role>(userList);
        return pageInfo;
    }
}
