package com.edu.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.edu.dto.StudentMsg;
import com.edu.entity.Estimate_Template;
import com.edu.entity.Login_Record;
import com.edu.entity.Student;
import com.edu.entity.Teacher;
import com.edu.service.Estimate_TemplateService;
import com.edu.service.Login_RecordService;
import com.edu.service.StudentService;
import com.edu.util.Result;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName: StudentController
 * @author: mafangnian
 * @date: 2022/9/8 11:55
 * @Blog: null
 */
@RestController
@RequestMapping("/student")
public class StudentController {

    @Resource
    private StudentService studentService;

    @Resource
    private Login_RecordService login_recordService;

    @Resource
    private Estimate_TemplateService estimate_templateService;


    @PostMapping("/login")
    public Result<Student> login(@RequestBody Student student, HttpServletRequest request) {
        // 1.使用MD5加密方式将密码进行加密
        String password = student.getPasswd();
        password = DigestUtils.md5DigestAsHex(password.getBytes());

        LambdaQueryWrapper<Student> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(Student::getName,student.getName());
        Student stu = studentService.getOne(queryWrapper);

        if (stu == null) {
            return new Result<>(400, "Fair!", null);
        }
        if (!stu.getPasswd().equals(password)) {
            return new Result<>(400, "Fair!", null);
        }

        // 登录成功,将学生的id存入session并返回登录成功结果
        request.getSession().setAttribute("student", stu.getId());

        Login_Record login_record = new Login_Record();
        login_record.setName(student.getName());

        login_recordService.save(login_record);

        //设置密码不可见
        stu.setPasswd("");
        return new Result<>(200, "successful!", stu);
    }

    //清除用户登录态
    @PostMapping("/logout")
    public Result<String> logout(HttpServletRequest request){
        request.getSession().removeAttribute("student");
        return new Result<>(200, "successful!",null);
    }

    @GetMapping("/person/{id}")
    public Result<StudentMsg> selectOne(@PathVariable long id){
        StudentMsg studentMsg = studentService.selectOne(id);
        if (studentMsg!=null){
            return new Result<>(200, "successful!", studentMsg);
        }else {
            return new Result<>(400, "fair!", null);
        }
    }

    //分页查询
    @GetMapping("/estimate/{id}/{currentPage}/{pageSize}")
    public Result<Page> page(@PathVariable long id,@PathVariable int currentPage, @PathVariable int pageSize) {
        //构造分页构造器
        Page<Estimate_Template> pageInfo = new Page<>(currentPage, pageSize);
        LambdaQueryWrapper<Estimate_Template> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(Estimate_Template::getStudentId,id);
        Page<Estimate_Template> page1 = estimate_templateService.page(pageInfo,queryWrapper);
        return new Result<>(200, "successful!", page1);
    }



}
