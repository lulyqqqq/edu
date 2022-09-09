package com.edu.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

/**
 * @ClassName: Class
 * @author: mafangnian
 * @date: 2022/9/5 11:32
 * @Blog: null
 */
@Data
public class Class {
    private long id;
    private String name;

//    @TableField("teacherId")
//    private long teacherId;
}
