package com.neuedu.swaggerdemo.controller;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.neuedu.swaggerdemo.pojo.Users;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

import java.util.Date;

/**
 * @author: wudagai
 * @description:
 */
@RequestMapping("/users")
@RestController
@Api(description = "提供操作用户信息的接口",tags = "用户模块")
public class UsersController {

    @ApiOperation("根据编号查询用户信息接口")
    @GetMapping("/queryUserById")
    @ApiImplicitParam(dataType = "int",name = "userId", value = "用户编号",required =true)
    public Users queryUserById(Integer userId){
        Users users=new Users();
        users.setUserId(1);
        users.setMoney(20);
        users.setSex("男");
        users.setPassword("123");
        users.setAge(18);
        users.setBirthday(new Date());
        return users;
    }

    @ApiIgnore
    @ApiOperation("用户登录接口")
    @GetMapping("/userLogin")
    @ApiImplicitParams({
            @ApiImplicitParam(dataType = "string",name = "userName", value = "登录用户名",required =true),
            @ApiImplicitParam(dataType = "string",name = "password", value = "登录密码",required =true)
    })
    public Users userLogin(String userName,String password){
        Users users=new Users();
        users.setUserId(1);
        users.setMoney(20);
        users.setSex("男");
        users.setPassword("123");
        users.setAge(18);
        users.setBirthday(new Date());
        return users;
    }

    @ApiOperation("用户注册接口")
    @PostMapping("/userRegister")
    @ApiImplicitParams({
            @ApiImplicitParam(dataType = "string",name = "userName", value = "登录用户名",required =true),
            @ApiImplicitParam(dataType = "string",name = "password", value = "登录密码",required =true),
            @ApiImplicitParam(dataType = "int",name = "age", value = "年龄",required =false),
            @ApiImplicitParam(dataType = "string",name = "birthday", value = "出生日期yyyy-MM-dd HH:mm:ss",required =false),
            @ApiImplicitParam(dataType = "string",name = "sex", value = "性别",required =false),
            @ApiImplicitParam(dataType = "string",name = "money", value = "余额",required =false)
    })
    public Users userRegister(Users users){
        Users users1=new Users();
        users1.setUserId(1);
        users1.setMoney(20);
        users1.setSex("男");
        users1.setPassword("123");
        users1.setAge(18);
        users1.setBirthday(new Date());
        return users1;
    }



}
