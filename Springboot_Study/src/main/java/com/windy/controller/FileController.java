/*
 * Copyright (c) Windy my copyright message. 2024-2024. All rights reserved. (MIT)
 *
 */

package com.windy.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@RestController
@RequestMapping("/file")
public class FileController {

    @PostMapping("/upload")
    public String uploadFile(@RequestParam("file") MultipartFile file) {
        // 定义保存文件的相对路径
        String uploadDir = System.getProperty("user.dir") + "/picture/";

        // 获取文件名
        String fileName = file.getOriginalFilename();

        // 确保目录存在，不存在则创建
        File directory = new File(uploadDir);
        if (!directory.exists()) {
            directory.mkdirs();
        }

        // 保存文件
        try {
            File destinationFile = new File(directory, fileName);
            file.transferTo(destinationFile);
            return "File uploaded successfully: " + destinationFile.getAbsolutePath();
        } catch (IOException e) {
            e.printStackTrace();
            return "Failed to upload file: " + e.getMessage();
        }
    }
}
