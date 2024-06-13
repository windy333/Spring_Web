package com.windy.controller;


import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@RequestMapping("/jsp")
@RestController
public class JspController {

    @PostMapping("/upload")
    public String upload(String name, MultipartFile photo,
                         HttpServletRequest request) throws IOException {
        System.out.println(name);
        System.out.println(photo.getOriginalFilename());
        System.out.println(photo.getContentType());
        System.out.println(System.getProperty("user.dir"));

        String path= request.getServletContext().getRealPath("/upload");
        System.out.println(path);
        saveFile(photo,path);

        return "upload success";
    }

    public void saveFile(MultipartFile photo, String path) throws IOException {
        File dir = new File(path);
        if (!dir.exists()) {
            dir.mkdir();
        }
        File file=new File(path+photo.getOriginalFilename());
        photo.transferTo(file);
    }
}
