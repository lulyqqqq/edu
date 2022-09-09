package com.edu.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.edu.dto.Class_Student;
import com.edu.entity.Class;
import com.edu.mapper.ClassMapper;
import com.edu.mapper.Class_StudentMapper;
import com.edu.service.ClassService;
import com.edu.service.Class_StudentService;
import org.springframework.stereotype.Service;

/**
 * @ClassName: teacherServiceImpl
 * @author: mafangnian
 * @date: 2022/9/4 15:34
 * @Blog: null
 */
@Service
public class Class_StudentServiceImpl extends ServiceImpl<Class_StudentMapper, Class_Student> implements Class_StudentService {
}
