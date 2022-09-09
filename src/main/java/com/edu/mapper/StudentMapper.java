package com.edu.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.edu.dto.Class_Student;
import com.edu.entity.Class;
import com.edu.entity.Student;
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
public interface StudentMapper extends BaseMapper<Student> {

    @Select("select student.id,student.name,student.classId " +
            "from student,class where " +
            "class.id = #{id} and student.classId = class.id")
    List<Student> classStudentMsg(@Param("id") long id);

    @Select("select class.id,class.name FROM class,student " +
            "WHERE student.classId = class.id and student.id = #{id}")
    Class classMsg(@Param("id") long id);

    @Select("select teacher.id,teacher.name FROM teacher,class,teach_relation_class " +
            "WHERE class.id = #{id} and\n" +
            "teach_relation_class.classId = class.id and teach_relation_class.teacherId = teacher.id ")
    List<Teacher> classTeacher(@Param("id") long id);
}
