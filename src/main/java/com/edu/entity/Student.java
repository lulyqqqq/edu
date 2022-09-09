package com.edu.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

/**
 * @ClassName: Student
 * @author: mafangnian
 * @date: 2022/9/5 21:01
 * @Blog: null
 */
@Data
public class Student {
    private long id;
    private String name;
    @TableField("classId")
    private long classId;
    private int role;
    private String passwd;
}
