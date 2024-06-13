package com.windy.controller;

import io.swagger.v3.oas.annotations.Hidden;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//http://localhost:8080/swagger-ui/index.html#/

@Tag(name = "控制器：测试Swagger3", description = "描述：测试Swagger3")
@RestController
public class SwaggerController {

    /**
     * swagger 不暴漏该 api，通过@Hidden隐藏
     * 但是仍然可以访问
     *
     * @return
     */
    @Hidden
    @GetMapping(value = "/swagger/hiddenApi")
    public String hiddenApi() {
        return "hiddenApi";
    }

}
