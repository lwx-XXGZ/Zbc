package com.example.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@ApiModel(value = "Pl模型")
public class Pl {
    @ApiModelProperty(value = "用户Id",dataType = "Integer",name = "id",required = true)
    private Integer id;
    @ApiModelProperty(value = "用户名",dataType = "String",name = "username")
    private String username;
    @ApiModelProperty(value = "详细说明",dataType = "String",name = "content")
    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}