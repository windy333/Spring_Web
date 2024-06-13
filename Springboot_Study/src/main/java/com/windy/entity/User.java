package com.windy.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Schema(description = "学生信息")
@Data
@TableName("student")
public class User {
    @TableId(value = "id", type = IdType.AUTO)
    private int id;
    private String no;
    private String name;
    private String gender;
    private int age;

    @TableField(exist = false)
    private double computer;
    @TableField(exist = false)
    private double chinese;
    @TableField(exist = false)
    private double english;
}
