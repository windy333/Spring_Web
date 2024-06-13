package com.windy.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.windy.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface UserMapper extends BaseMapper<User> {
    List<User> SelectUserGrades();
}
