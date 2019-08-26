package com.cssl.dao;

import com.cssl.po.Student;

import java.util.List;

public interface StudentMapper {

    //查询所有学生
    List<Student> findAll();
}
