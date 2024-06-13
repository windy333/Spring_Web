package com.windy.controller;


import com.windy.common.JwtUtils;
import com.windy.common.Result;
import com.windy.entity.User;
import com.windy.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public Result login(@RequestBody User user) {
        String token = JwtUtils.generateToken(user.getName());
        return Result.suc().data("token", token);
    }

    @GetMapping("/info")
    public ResponseEntity<Map<String, Object>> testParseToken(@RequestParam String token) {
        Map<String, Object> claims = JwtUtils.parseToken(token);
        if (claims != null) {
            return ResponseEntity.ok(claims);
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(Collections.singletonMap("error", "Invalid token"));
        }
    }

    @PostMapping("/logout")
    public Result logout() {
        return Result.suc();
    }

    @Operation(summary = "连表查询学生信息与成绩")
    @GetMapping("/grades")
    public List<User> getGrades() {
        return userService.SelectUserGrades();
    }

    @Operation(summary = "检查账号是否唯一（在数据库中找是否存在no，如果存在返回true，不存在返回false）")
    @GetMapping("/findByNo")
    public boolean findByNo(@RequestParam String no) {
        List list = userService.lambdaQuery().eq(User::getNo, no).list();
        return list.size() > 0 ? false : true;
    }

    @GetMapping("/list")
    public List<User> list() {
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
