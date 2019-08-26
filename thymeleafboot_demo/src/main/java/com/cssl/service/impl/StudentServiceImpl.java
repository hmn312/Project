package com.cssl.service.impl;

import com.cssl.dao.StudentMapper;
import com.cssl.po.Student;
import com.cssl.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class StudentServiceImpl  implements StudentService {

    @Autowired
    private StudentMapper  studentMapper;

    @Override
    public List<Student> findAll() {
        return studentMapper.findAll();
    }
}
