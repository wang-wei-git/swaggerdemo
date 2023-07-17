package com.neuedu.swaggerdemo.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @author: wudagai
 * @description:
 */
@Data
@ApiModel(value = "用户对象",description = "用户信息")
public class Users {
    @ApiModelProperty(dataType = "int",value = "用户编号")
    private Integer userId;


    @ApiModelProperty(dataType = "string",value = "用户名")
    private String userName;

    @ApiModelProperty(dataType = "string",value = "密码")
    private String password;

    @ApiModelProperty(dataType = "int",value = "年龄")
    private Integer age;

    @ApiModelProperty(dataType = "string",value = "生日 yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date birthday;

    @ApiModelProperty(dataType = "string",value = "性别")
    private String sex;

    @ApiModelProperty(dataType = "int",value = "用户余额")
    private Integer money;
}
