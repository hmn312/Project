package com.cssl.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.cssl.po.Student;
import com.cssl.service.IStudentService;
import com.cssl.service.impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import sun.management.Agent;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author hmn
 * @since 2019-08-03
 */
@Controller
@RequestMapping("/student")
public class StudentController {


    @Autowired
    private StudentServiceImpl studentService;

    @RequestMapping("/findAll")
    public String findAll(Model model){

        //查询所有
       // List<Student> list = studentService.list();

        //根据条件查询,并排序     likeRight("sname", "王") ==> 王%
        /*List<Student> list = studentService.list(new QueryWrapper<Student>().lt("sid", 45).likeRight("sname", "王").orderByDesc("bornDate"));*/

        //where ... and ...
      /*  Map map=new HashMap();
        map.put("sid",44);
        map.put("sname","lisa");
        Collection list = studentService.listByMap(map);
*/


      ///分页
        IPage<Student> page = studentService.page(new Page<>(4, 2));
        long pages = page.getPages();
        long total = page.getTotal();
        long current = page.getCurrent();
        //分页显示
        List<Student> list = page.getRecords();
        long size = page.getSize();

        //总页数
        System.out.println("pages:"+pages);
        //总记录数
        System.out.println("total:"+total);
        //当前页
        System.out.println("current:"+current);
        //每页显示的条数
        System.out.println("size:"+size);

        for (Student student : list) {
            System.out.println("******"+list);
        }

        model.addAttribute("list",list);
        return "index";
    }

    @RequestMapping("/findById")
    public String findById(Integer sid){
        //根据查询
        Student stu = studentService.getById(45);
        System.out.println("*********"+stu);
        return "index";
    }

    @RequestMapping("/add")
    public String add(){
        Student student = new Student();
        student.setSname("tom");
        student.setBornDate(null);
        boolean save = studentService.save(student);
        System.out.println("*********"+save);
        return "index";
    }




}
