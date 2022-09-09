package com.edu.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.edu.dto.Class_Student;
import com.edu.entity.Class;
import org.apache.ibatis.annotations.Mapper;

/**
 * @ClassName: teacherMapper
 * @author: mafangnian
 * @date: 2022/9/4 15:31
 * @Blog: null
 */
@Mapper
public interface Class_StudentMapper extends BaseMapper<Class_Student> {
}
