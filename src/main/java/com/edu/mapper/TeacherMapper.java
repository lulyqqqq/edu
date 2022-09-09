package com.edu.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.edu.dto.TeacherMsg;
import com.edu.entity.Class;
import com.edu.entity.Teacher;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @ClassName: teacherMapper
 * @author: mafangnian
 * @date: 2022/9/4 15:31
 * @Blog: null
 */
@Mapper
public interface TeacherMapper extends BaseMapper<Teacher> {

//    @Select("SELECT class.id,class.name FROM teacher,class,teach_relation_class\n" +
//            "WHERE #{teacherId} = teacher.id and class.id = teach_relation_class.classId and teacher.id = teach_relation_class.teacherId")

    @Select("select c.id,c.name from teacher t,class c,teach_relation_class trc " +
            "where t.id = trc.teacherId and c.id = trc.classId and t.id = #{teacherId}")
    List<Class> selectOne(@Param("teacherId") long teacherId);

}
