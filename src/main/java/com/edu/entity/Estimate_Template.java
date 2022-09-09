package com.edu.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * @ClassName: Estimate_Template
 * @author: mafangnian
 * @date: 2022/9/7 21:47
 * @Blog: null
 */
@Data
@TableName("Estimate_Template")
public class Estimate_Template {
    @TableId(value = "id" ,type = IdType.AUTO)
    private long id;
    @TableField("studentId")
    private long studentId;
    private String name;
    private long score;
    private String content;
    @TableField("teacherName")
    private String teacherName;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date date;
}
