package com.windy.controller;

import com.windy.entity.User;
import com.windy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/list")
    public List<User> list(){
        return userService.list();
    }

    @PostMapping("/update")
    public boolean update(@RequestBody User user) {
        return userService.updateById(user);
    }

    @GetMapping("/delete")
    public boolean delete(Integer id) {
        return userService.removeById(id);
    }

    @PostMapping("/save")
    public boolean save(@RequestBody User user) {
        return userService.save(user);
    }



}
