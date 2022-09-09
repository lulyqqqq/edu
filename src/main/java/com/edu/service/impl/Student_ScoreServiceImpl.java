package com.edu.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.edu.entity.Student;
import com.edu.entity.Student_Score;
import com.edu.mapper.StudentMapper;
import com.edu.mapper.Student_ScoreMapper;
import com.edu.service.StudentService;
import com.edu.service.Student_ScoreService;
import org.springframework.stereotype.Service;

/**
 * @ClassName: teacherServiceImpl
 * @author: mafangnian
 * @date: 2022/9/4 15:34
 * @Blog: null
 */
@Service
public class Student_ScoreServiceImpl extends ServiceImpl<Student_ScoreMapper, Student_Score> implements Student_ScoreService {
}
