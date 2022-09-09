package com.edu.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.edu.dto.TeacherMsg;
import com.edu.entity.Class;
import com.edu.entity.Teacher;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName: teacherMapper
 * @author: mafangnian
 * @date: 2022/9/4 15:31
 * @Blog: null
 */
@Mapper
public interface ClassMapper extends BaseMapper<Class> {
}
