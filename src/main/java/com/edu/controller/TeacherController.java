package com.edu.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.edu.dto.Class_Student;
import com.edu.dto.TeacherMsg;
import com.edu.entity.Estimate_Template;
import com.edu.entity.Login_Record;
import com.edu.entity.Student_Score;
import com.edu.entity.Teacher;
import com.edu.service.Estimate_TemplateService;
import com.edu.service.Login_RecordService;
import com.edu.service.Student_ScoreService;
import com.edu.service.TeacherService;
import com.edu.util.Result;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @ClassName: teacherController
 * @author: mafangnian
 * @date: 2022/9/4 15:04
 * @Blog: null
 */
@RestController
@RequestMapping("/teacher")
public class TeacherController {

    @Resource
    private TeacherService teacherService;

    @Resource
    private Login_RecordService login_recordService;

    @Resource
    private Estimate_TemplateService estimate_templateService;

    @Resource
    private Student_ScoreService student_scoreService;

    @PostMapping("/login")
    public Result<Teacher> login(@RequestBody Teacher teacher, HttpServletRequest request) {

        // 1.使用MD5加密方式将密码进行加密
        String password = teacher.getPasswd();
        password = DigestUtils.md5DigestAsHex(password.getBytes());

        LambdaQueryWrapper<Teacher> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(Teacher::getName, teacher.getName());
        Teacher emp = teacherService.getOne(queryWrapper);
        if (emp == null) {
            return new Result<>(400, "Fair!", null);
        }
        if (!emp.getPasswd().equals(password)) {
            return new Result<>(400, "Fair!", null);
        }

        // 登录成功,将员工的id存入session并返回登录成功结果
        request.getSession().setAttribute("teacher", emp.getId());

        Login_Record login_record = new Login_Record();
        login_record.setName(teacher.getName());

        login_recordService.save(login_record);

        //设置密码不可见
        emp.setPasswd("");
        return new Result<>(200, "successful!", emp);
    }

    //清除用户登录态
    @PostMapping("/logout")
    public Result<String> logout(HttpServletRequest request){
        request.getSession().removeAttribute("teacher");
        return new Result<>(200, "successful!",null);
    }

    @GetMapping("/person/{id}")
    public Result<TeacherMsg> person(@PathVariable long id) {
        TeacherMsg teacher = teacherService.selectOne(id);
        if (teacher == null) {
            return new Result<>(400, "此人不存在", null);
        }
        //该用户存在,设置密码不显示
        return new Result<>(200, "successful!", teacher);
    }

    @GetMapping("/estimate/{id}")
    public Result<Class_Student> selectEstimate(@PathVariable long id) {
        Class_Student class_student = teacherService.selectEstimate(id);
        if (class_student == null) {
            return new Result<>(400, "数据不存在", null);
        }
        //该用户存在,设置密码不显示
        return new Result<>(200, "successful!", class_student);
    }

    @PostMapping("/estimate/student")
    public Result<Estimate_Template> estimateStudent(@RequestBody Estimate_Template student) {
        long score;
        boolean ScoreResult;
        Student_Score student_score = new Student_Score();
        student_score.setId(student.getStudentId());

        Student_Score OldStudent = student_scoreService.getById(student.getStudentId());

        if (OldStudent == null) {
            score = 0;
        } else {
            score = OldStudent.getScore();
        }

        student_score.setName(student.getName());
        student_score.setScore(student.getScore() + score);

        boolean StudentResult = estimate_templateService.save(student);
        if (OldStudent == null) {
            ScoreResult = student_scoreService.save(student_score);
        } else {
            ScoreResult = student_scoreService.updateById(student_score);
        }


        if (StudentResult && ScoreResult) {
            return new Result<>(200, "successful!", student);
        } else {
            return new Result<>(400, "fair!", null);
        }
    }

    //分页查询
    @GetMapping("/estimate/studentse/{currentPage}/{pageSize}")
    public Result<Page> page(@PathVariable int currentPage, @PathVariable int pageSize) {
        //构造分页构造器
        Page<Estimate_Template> pageInfo = new Page<>(currentPage, pageSize);
        Page<Estimate_Template> page1 = estimate_templateService.page(pageInfo);
        return new Result<>(200, "successful!", page1);
    }

    @PostMapping("/estimate/students")
    public Result<List<Estimate_Template>> estimateStudents(@RequestBody List<Estimate_Template> studentList) {
        long score;
        boolean ScoreResult = false;
        boolean StudentResult = false;

        Student_Score OldStudent;
        Student_Score student_score = new Student_Score();

        for (Estimate_Template student : studentList) {

            OldStudent = student_scoreService.getById(student.getStudentId());

            if (OldStudent == null) {
                score = 0;
            } else {
                score = OldStudent.getScore();
            }
            student_score.setScore(score + student.getScore());
            student_score.setId(student.getStudentId());
            student_score.setName(student.getName());
            StudentResult = estimate_templateService.save(student);
            if (OldStudent == null) {
                ScoreResult = student_scoreService.save(student_score);
            } else {
                ScoreResult = student_scoreService.updateById(student_score);
            }
        }
        if (StudentResult && ScoreResult) {
            return new Result<>(200, "successful!", studentList);
        } else {
            return new Result<>(400, "fair!", null);
        }
    }

}
