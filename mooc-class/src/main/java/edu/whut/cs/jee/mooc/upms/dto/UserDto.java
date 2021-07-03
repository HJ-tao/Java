package edu.whut.cs.jee.mooc.upms.dto;

import edu.whut.cs.jee.mooc.upms.model.Role;
import edu.whut.cs.jee.mooc.upms.model.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.beans.BeanUtils;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Data
@ApiModel(description="用户传输对象")
public class UserDto {

    public static final String ACTOR_TEACHER  = "教师";
    public static final String ACTOR_STUDENT  = "学生";

    @ApiModelProperty(value="用户编号",required=true,example="1")
    private Long id;

    @NotBlank(message = "用户名不能为空")
    @Size(min = 5, max = 11, message = "账号长度必须是6-11个字符")
    @ApiModelProperty(value = "名称",required=true,example="jacky")
    private String name;

    @NotBlank(message = "用户昵称不允许为空")
    @ApiModelProperty(value = "昵称",required=true,example="jacky")
    private String nickname;

    @NotBlank(message = "用户密码不能为空")
    @ApiModelProperty(value = "密码",required=true,example="jacky123456")
    @Size(min = 6, max = 16, message = "密码长度必须是6-16个字符")
    private String password;

    @Email(message = "邮箱格式不正确")
    @ApiModelProperty(value = "邮箱",required=true,example="jacky123456@qq.com")
    private String email;

    private List<Role> roles = new ArrayList<>();

    public void addRole(Role role) {
        roles.add(role);
    }

    public User convertTo(){
        User user = new User();
        BeanUtils.copyProperties(this, user);
        user.setRoles(this.getRoles());
        return user;
    }

    public UserDto convertFor(User user){
        BeanUtils.copyProperties(user,this);
        return this;
    }
}
