package edu.whut.cs.jee.mooc.mclass.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * 保存填空题VO
 */
@Data
public class JudgmentSaveVo extends SubjectSaveVo {

    /**
     * 正确判断结果
     */
    @NotNull(message = "必须设置正确答案")
    @ApiModelProperty(value = "正确答案",required=true,example="true")
    private boolean result;
}