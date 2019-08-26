package com.cssl.dao;

import com.cssl.po.Student;

import java.util.List;

public interface StudentMapper {

    List<Student> findAll();
}
