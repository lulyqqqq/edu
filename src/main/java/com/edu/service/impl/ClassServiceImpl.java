package com.edu.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.edu.dto.TeacherMsg;
import com.edu.entity.Class;
import com.edu.entity.Teach_Relation_Class;
import com.edu.entity.Teacher;
import com.edu.mapper.ClassMapper;
import com.edu.mapper.TeacherMapper;
import com.edu.service.ClassService;
import com.edu.service.TeacherService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName: teacherServiceImpl
 * @author: mafangnian
 * @date: 2022/9/4 15:34
 * @Blog: null
 */
@Service
public class ClassServiceImpl extends ServiceImpl<ClassMapper, Class> implements ClassService {
}
