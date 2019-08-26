package com.cssl.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cssl.dao.StudentMapper;
import com.cssl.po.Student;
import com.cssl.service.IStudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author hmn
 * @since 2019-08-03
 */
@Service
@Transactional
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements IStudentService {

    @Autowired
    private StudentMapper studentMapper;

}
