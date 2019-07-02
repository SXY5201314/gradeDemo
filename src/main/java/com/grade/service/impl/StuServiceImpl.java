package com.grade.service.impl;

import com.grade.entity.Studentinfo;
import com.grade.mapper.StudentinfoMapper;
import com.grade.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StuServiceImpl implements StuService {
    @Autowired
    private StudentinfoMapper stuMapper;
    @Override
    public List<Studentinfo> getAllSelect(){
        System.out.println(stuMapper.getAllSelect()+"aaa");
        return stuMapper.getAllSelect();
    }

    @Override
    public void insertSelective(Studentinfo s) {

    }
}
