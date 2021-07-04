package edu.whut.cs.jee.mooc.mclass.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ExerciseDto {

    @ApiModelProperty(value="作业id",example="1")
    private Long id;

    @NotNull(message = "课程id不允许为空")
    @ApiModelProperty(value="课程id",required=true,example="1")
    private Long courseId;

    @NotBlank(message = "作业名称不允许为空")
    @ApiModelProperty(value="作业名称",required=true,example="作业名称")
    private String name;

}
