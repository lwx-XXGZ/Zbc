package com.example.controller;

import com.example.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class TestController {
    @Resource
    private UserService userService;
    @RequestMapping("ldk")
    public String zdc(Model model){
        model.addAttribute("message","message");
        return "a";
    }
}
