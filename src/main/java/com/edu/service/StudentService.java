package com.edu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.edu.dto.StudentMsg;
import com.edu.entity.Student;
import org.apache.ibatis.annotations.Param;

public interface StudentService extends IService<Student> {

    StudentMsg selectOne(long id);
}
