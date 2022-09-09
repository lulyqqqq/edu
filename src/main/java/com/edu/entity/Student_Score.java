package com.edu.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @ClassName: student_score
 * @author: mafangnian
 * @date: 2022/9/7 21:48
 * @Blog: null
 */
@Data
@TableName("student_score")
public class Student_Score {

    private long id;
    private String name;
    private long score;
}
