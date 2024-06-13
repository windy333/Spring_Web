package com.windy.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.windy.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface UserService extends IService<User> {
    List<User> SelectUserGrades();
}
