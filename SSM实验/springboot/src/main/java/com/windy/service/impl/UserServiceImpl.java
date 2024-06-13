package com.windy.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.windy.entity.User;
import com.windy.mapper.UserMapper;
import com.windy.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @Resource
    private UserMapper userMapper;
}