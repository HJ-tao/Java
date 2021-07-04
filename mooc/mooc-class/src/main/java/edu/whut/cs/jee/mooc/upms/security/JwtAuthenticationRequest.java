package edu.whut.cs.jee.mooc.upms.security;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@Data
@ApiModel(description="JWT授权请求对象")
public class  JwtAuthenticationRequest implements Serializable {

    @ApiModelProperty(value="用户名",required=true,example="jacky")
    @NotBlank(message = "用户名不能为空")
    private String username;

    @ApiModelProperty(value="密码",required=true,example="jacky123456")
    @NotBlank(message = "密码不能为空")
    private String password;

}
