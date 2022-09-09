package com.edu.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @ClassName: teacher
 * @author: mafangnian
 * @date: 2022/9/4 15:29
 * @Blog: null
 */
@Data
@Getter
@Setter
public class Teacher implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String name;
    private String passwd;
    private int role;
}
