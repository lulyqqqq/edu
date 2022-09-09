package com.edu.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @ClassName: Teach_Relation_Class
 * @author: mafangnian
 * @date: 2022/9/5 16:08
 * @Blog: null
 */
@Data
@TableName("teach_relation_class")
public class Teach_Relation_Class {

    @TableField("classId")
    private long classId;

    @TableField("teacherId")
    private long teacherId;
}
