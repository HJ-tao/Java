package edu.whut.cs.jee.mooc.mclass.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class OptionSaveVo {

    @ApiModelProperty(value = "选项id")
    private Long id;

    @ApiModelProperty(value = "选项名称",required=true,example ="选项名称")
    private String name;

    @ApiModelProperty(value = "选项内容",required=true,example ="选项内容")
    private String content;

    @ApiModelProperty(value = "正确?",example ="true")
    private boolean correct;
}
