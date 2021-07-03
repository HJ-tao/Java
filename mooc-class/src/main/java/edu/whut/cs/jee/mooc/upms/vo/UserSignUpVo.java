package edu.whut.cs.jee.mooc.upms.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class UserSignUpVo {

    @NotNull(message = "用户角色不能为空")
    @ApiModelProperty(value = "管理员：1，教师：2，学生：3",required=true,example="3")
    private Long role;

    @NotNull(message = "用户名不能为空")
    @Size(min = 5, max = 11, message = "账号长度必须是5-11个字符")
    @ApiModelProperty(value = "名称",required=true,example="jacky")
    private String name;

    @NotBlank(message = "用户昵称不允许为空")
    @ApiModelProperty(value = "昵称",required=true,example="jacky")
    private String nickname;

    @NotNull(message = "用户密码不能为空")
    @ApiModelProperty(value = "密码",required=true,example="jacky123456")
    @Size(min = 6, max = 16, message = "密码长度必须是6-16个字符")
    private String password;

    @Email(message = "邮箱格式不正确")
    @ApiModelProperty(value = "邮箱",required=true,example="jacky123456@qq.com")
    private String email;

    private String salaryNo;

    private String title;

    private String studentNo;

}
