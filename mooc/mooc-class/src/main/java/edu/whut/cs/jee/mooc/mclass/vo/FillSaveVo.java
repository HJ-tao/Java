package edu.whut.cs.jee.mooc.mclass.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * 保存填空题VO
 */
@Data
public class FillSaveVo extends SubjectSaveVo {

    /**
     * 数值格式 | 文字格式
     */
    @NotNull
    @ApiModelProperty(value = "格式类型：1数值格式,2文字格式",required=true,example="1")
    private Integer keyType;

    /**
     * 数值格式答案
     */
    @ApiModelProperty(value = "数值格式答案",example = "618")
    private String decimalKey;

    /**
     * 文字格式答案
     */
    @ApiModelProperty(value = "文字格式答案",example = "文字格式答案")
    private String textKey;

    /**
     * 匹配类型：精确 | 模糊
     */
    @NotNull
    @ApiModelProperty(value = "匹配类型：1精确,2模糊",required=true,example ="未知, 精确匹配, 模糊匹配")
    private Integer matchType;

    /**
     * 是否唯一答案
     */
    @NotNull
    @ApiModelProperty(value = "是否唯一答案",required=true,example ="true")
    private boolean unique;

}