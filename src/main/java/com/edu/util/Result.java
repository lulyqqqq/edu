package com.edu.util;

import lombok.Data;

/**
 * @ClassName: result
 * @author: mafangnian
 * @date: 2022/9/4 15:05
 * @Blog: null
 */
@Data
public class Result<T> {
    private int code;
    private String msg;
    private T data;

    public Result(int code, String msg, T data){
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

//    public <T> result<T> success(T data){
//        this.data = data;
//    }
}
