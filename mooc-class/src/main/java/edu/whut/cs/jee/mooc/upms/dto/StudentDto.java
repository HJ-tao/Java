package edu.whut.cs.jee.mooc.upms.dto;

import edu.whut.cs.jee.mooc.upms.model.Role;
import edu.whut.cs.jee.mooc.upms.model.Student;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.springframework.beans.BeanUtils;

import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;

@Data
@ApiModel(description="学生用户传输对象")
public class StudentDto extends UserDto{

    @NotBlank(message = "学号不允许为空")
    @Length(max = 20, min = 6, message = "学号长度必须是6-20个字符")
    @ApiModelProperty(value="学号",required=true,example="2019150001")
    private String studentNo;

    public Student convertTo(){
        Student student = new Student();
        BeanUtils.copyProperties(this, student);
        Role studentRole = new Role();
        studentRole.setId(Role.ROLE_STUDENT_ID.longValue());
        List<Role> roles = new ArrayList<>();
        roles.add(studentRole);
        student.setRoles(roles);
        return student;
    }

    public StudentDto convertFor(Student student){
        BeanUtils.copyProperties(student,this);
        return this;
    }

}
