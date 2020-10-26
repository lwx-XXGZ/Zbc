package com.example.mapper;

import com.example.pojo.Pl;

public interface PlMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Pl record);

    int insertSelective(Pl record);

    Pl selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Pl record);

    int updateByPrimaryKey(Pl record);
}