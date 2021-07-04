package edu.whut.cs.jee.mooc.upms.dto;

import edu.whut.cs.jee.mooc.upms.model.Admin;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.springframework.beans.BeanUtils;

import javax.validation.constraints.NotNull;

/**
 * @author wadao
 * @version 1.0
 * @date 2020/6/15 18:17
 * @site niter.cn
 */

@Data
@ApiModel(description="管理员用户传输对象")
public class AdminDto extends UserDto{
    @NotNull(message = "工资号不允许为空")
    @Length(max = 20, min = 6)
    private String salaryNo;

    private String title;

    public Admin convertTo(){
        Admin admin = new Admin();
        BeanUtils.copyProperties(this, admin);
        return admin;
    }

    public AdminDto convertFor(Admin admin){
        BeanUtils.copyProperties(admin,this);
        return this;
    }
}
