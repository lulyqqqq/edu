package com.edu.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @ClassName: login_record
 * @author: mafangnian
 * @date: 2022/9/4 22:58
 * @Blog: null
 */
@Data
@TableName("login_record")
public class Login_Record {
    private String name;
}
