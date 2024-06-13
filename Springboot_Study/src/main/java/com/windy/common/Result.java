/*
 * Copyright (c) Windy my copyright message. 2024-2024. All rights reserved. (MIT)
 *
 */

package com.windy.common;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

//后端返回数据的封装
@Data
public class Result {
    private int code;
    private String msg;
    private long total;
    private Map<String,Object> data=new HashMap<>();

    private Result(){}

    public static Result suc(){
        Result result=new Result();
        result.code=200;
        result.msg="success";
        return result;
    }

    public static Result fail(){
        Result result=new Result();
        result.code=400;
        result.msg="fail";
        return result;
    }

    public Result data(String key, Object value) {
       this.data.put(key,value);
       return this;
    }

    public Result data(Map<String, Object> map) {
        this.setData(map);
        return this;
    }
}
