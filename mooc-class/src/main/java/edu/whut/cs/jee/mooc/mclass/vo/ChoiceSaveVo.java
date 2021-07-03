package edu.whut.cs.jee.mooc.mclass.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * 保存填空题VO
 */
@Data
public class ChoiceSaveVo extends SubjectSaveVo {

    @ApiModelProperty(value = "选择题选项",required=true)
    private List<OptionSaveVo> options;

}