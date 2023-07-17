package com.neuedu.swaggerdemo.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: wudagai
 * @description:
 */
@RequestMapping("/admin")
@RestController
@Api(description = "提供管理员所有操作的接口",tags = "管理员模块")
public class AdminController {

    @GetMapping("/getMessage")
    public String getMessage(){
        return "hello";
    }
}
