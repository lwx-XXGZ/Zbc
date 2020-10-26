package com.example.controller;

import com.example.pojo.Pl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@Api(value = "HelloController|一个用来测试swagger注解的控制器")
public class HelloController {
    @RequestMapping(value = "getPlByid",method = RequestMethod.POST)
    @ApiOperation(value="根据用户编号获取用户")
    @ApiImplicitParam(paramType="query", name = "id", value = "用户编号", required = true, dataType = "Integer")
    public Pl getPlByid(Integer id){
        return new Pl();
    }
}
