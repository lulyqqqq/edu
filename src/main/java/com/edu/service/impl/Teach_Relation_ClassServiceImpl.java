package com.edu.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.edu.entity.Teach_Relation_Class;
import com.edu.entity.Teacher;
import com.edu.mapper.Teach_Relation_ClassServiceMapper;
import com.edu.mapper.TeacherMapper;
import com.edu.service.Teach_Relation_ClassService;
import com.edu.service.TeacherService;
import org.springframework.stereotype.Service;

/**
 * @ClassName: Teach_Relation_ClassServiceImpl
 * @author: mafangnian
 * @date: 2022/9/5 16:13
 * @Blog: null
 */
@Service
public class Teach_Relation_ClassServiceImpl extends ServiceImpl<Teach_Relation_ClassServiceMapper, Teach_Relation_Class> implements Teach_Relation_ClassService {
}
