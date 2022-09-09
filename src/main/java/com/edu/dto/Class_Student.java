package com.edu.dto;

import com.edu.entity.Class;
import com.edu.entity.Student;
import lombok.Data;

import java.util.List;

/**
 * @ClassName: Class_Student
 * @author: mafangnian
 * @date: 2022/9/5 21:02
 * @Blog: null
 */
@Data
public class Class_Student {
    List<Class>  aClass;
    List<Student> studentList;
}
