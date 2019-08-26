package com.cssl.controller;

import com.cssl.po.Student;
import com.cssl.service.StudentService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import sun.plugin2.message.ShowDocumentMessage;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class StudentController {

    @Autowired
    private StudentService  studentService;

    @RequestMapping("/hello")
    public String hello(Model model, HttpSession session){
        Student stu = new Student(45,"王麻子", new Date());

        session.setAttribute("stu",stu);

        model.addAttribute("student",stu);

        //使用model
        model.addAttribute("message","This is your message");

        //存储集合
        List<Student> list = studentService.findAll();
        model.addAttribute("list",list);

        //存储map
        Map hm=new HashMap();
        hm.put("aa","测试aa");
        hm.put("baidu","<a href='http://www.baidu.com'>百度一下</a>");
        hm.put("stu",stu);
        hm.put("list",list);
        model.addAttribute("map",hm);

        return "hello";
    }

    @RequestMapping("/test")
    public String test(int id,String name){
        System.out.println("id:"+id+",name:"+name);
        return "show";
    }


}
