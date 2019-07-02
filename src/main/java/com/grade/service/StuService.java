package com.grade.service;

import com.grade.entity.Studentinfo;
import com.grade.mapper.StudentinfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public interface StuService {
List<Studentinfo>getAllSelect();

    void insertSelective(Studentinfo s);

}
