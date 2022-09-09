package com.edu.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.edu.entity.Login_Record;
import com.edu.entity.Teacher;
import com.edu.mapper.Login_RecordMapper;
import com.edu.mapper.TeacherMapper;
import com.edu.service.Login_RecordService;
import com.edu.service.TeacherService;
import org.springframework.stereotype.Service;

/**
 * @ClassName: teacherServiceImpl
 * @author: mafangnian
 * @date: 2022/9/4 15:34
 * @Blog: null
 */
@Service
public class Login_RecordServiceImpl extends ServiceImpl<Login_RecordMapper, Login_Record> implements Login_RecordService {
}
