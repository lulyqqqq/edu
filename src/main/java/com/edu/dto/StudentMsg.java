package com.edu.dto;

import com.edu.entity.Class;
import com.edu.entity.Teacher;
import lombok.Data;

import java.util.List;

/**
 * @ClassName: StudentMsg
 * @author: mafangnian
 * @date: 2022/9/8 19:15
 * @Blog: null
 */
@Data
public class StudentMsg {

    private List<Teacher> teacherList;
    private Class aClass;
    private long score;
}
