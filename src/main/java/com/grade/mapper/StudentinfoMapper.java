package com.grade.mapper;

import com.grade.entity.Studentinfo;
import com.grade.entity.StudentinfoExample;
import java.util.List;

public interface StudentinfoMapper {
    int deleteByPrimaryKey(Integer sid);

    int insert(Studentinfo record);

    int insertSelective(Studentinfo record);

    List<Studentinfo> selectByExample(StudentinfoExample example);

    Studentinfo selectByPrimaryKey(Integer sid);

    int updateByPrimaryKeySelective(Studentinfo record);
    List<Studentinfo>getAllSelect();
    int updateByPrimaryKey(Studentinfo record);
}