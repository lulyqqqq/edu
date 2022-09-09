package com.edu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.edu.dto.Class_Student;
import com.edu.dto.TeacherMsg;
import com.edu.entity.Teacher;

import java.util.List;

public interface TeacherService extends IService<Teacher> {

    TeacherMsg selectOne(long teacherId);

    Class_Student selectEstimate(long id);
}
