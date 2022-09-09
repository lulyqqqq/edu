package com.edu.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.edu.dto.TeacherMsg;
import com.edu.entity.Login_Record;
import com.edu.entity.Teacher;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @ClassName: teacherMapper
 * @author: mafangnian
 * @date: 2022/9/4 15:31
 * @Blog: null
 */
@Mapper
public interface Login_RecordMapper extends BaseMapper<Login_Record> {


}
