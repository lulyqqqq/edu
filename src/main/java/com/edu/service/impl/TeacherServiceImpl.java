package com.edu.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.edu.dto.Class_Student;
import com.edu.dto.TeacherMsg;
import com.edu.entity.Class;
import com.edu.entity.Student;
import com.edu.entity.Teach_Relation_Class;
import com.edu.entity.Teacher;
import com.edu.mapper.StudentMapper;
import com.edu.mapper.TeacherMapper;
import com.edu.service.*;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: teacherServiceImpl
 * @author: mafangnian
 * @date: 2022/9/4 15:34
 * @Blog: null
 */
@Service
public class TeacherServiceImpl extends ServiceImpl<TeacherMapper, Teacher> implements TeacherService {

    @Resource
    private TeacherService teacherService;


    @Resource
    private TeacherMapper teacherMapper;

    @Resource
    private ClassService classService;

    @Resource
    private Teach_Relation_ClassService teach_relation_classService;

    @Resource
    private Class_StudentService class_studentService;

    @Resource
    private StudentMapper studentMapper;
    @Resource
    private StudentService studentService;
    @Override
    public TeacherMsg selectOne(long teacherId) {
        Teacher teacher = teacherService.getById(teacherId);

        //设置密码不可见
        teacher.setPasswd("");
        System.out.println(teacher);
        TeacherMsg teacherMsg = new TeacherMsg();
        teacherMsg.setTeacher(teacher);

        List<Class> classList = teacherMapper.selectOne(teacherId);


        teacherMsg.setClassList(classList);
        return teacherMsg;
    }

    @Override
    public Class_Student selectEstimate(long id) {

        Class_Student class_student = new Class_Student();
        List<Class> classList = teacherMapper.selectOne(id);
        List<Student> ListStudent = new ArrayList<>();
        for (Class aClass : classList) {
            long classId = aClass.getId();
            List<Student> student = studentMapper.classStudentMsg(classId);
            ListStudent.addAll(student);
        }
        class_student.setStudentList(ListStudent);
        class_student.setAClass(classList);

        return class_student;
    }


}
