package com.edu.dto;

import com.edu.entity.Teach_Relation_Class;
import com.edu.entity.Teacher;
import com.edu.entity.Class;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: TeacherMsg
 * @author: mafangnian
 * @date: 2022/9/5 11:43
 * @Blog: null
 */
@Data
public class TeacherMsg {
    private Teacher teacher;
    List<Class> classList = new ArrayList<>();
}
