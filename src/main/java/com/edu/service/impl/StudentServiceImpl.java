package com.edu.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.edu.dto.StudentMsg;
import com.edu.entity.Class;
import com.edu.entity.Student;
import com.edu.entity.Student_Score;
import com.edu.entity.Teacher;
import com.edu.mapper.StudentMapper;
import com.edu.service.StudentService;
import com.edu.service.Student_ScoreService;
import com.edu.util.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName: teacherServiceImpl
 * @author: mafangnian
 * @date: 2022/9/4 15:34
 * @Blog: null
 */
@Slf4j
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements StudentService {


    @Resource
    private StudentMapper studentMapper;

    @Resource
    private Student_ScoreService student_scoreService;
    @Override
    public StudentMsg selectOne(long id) {

        StudentMsg studentMsg = new StudentMsg();
        Class aClass = studentMapper.classMsg(id);
        studentMsg.setAClass(aClass);
        Student_Score student = student_scoreService.getById(id);
        if (student == null){
            log.info("用户不存在!");
            return null;
        }
        long score = student.getScore();
        studentMsg.setScore(score);
        long ClassId = aClass.getId();

        List<Teacher> teachers = studentMapper.classTeacher(ClassId);

        studentMsg.setTeacherList(teachers);

        return studentMsg;
    }
}
