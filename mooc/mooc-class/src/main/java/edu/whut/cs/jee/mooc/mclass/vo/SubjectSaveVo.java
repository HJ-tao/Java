package edu.whut.cs.jee.mooc.mclass.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * 保存习题VO
 */
@Data
public class SubjectSaveVo {

    private Long id;

    /**
     * 作业中练习
     */
    @ApiModelProperty(value = "作业id",required=true,example="1")
    private Long exerciseId;

    /**
     * 随堂练习
     */
    @ApiModelProperty(value = "测验id",required=true,example="1")
    private Long examinationId;

    /**
     * 题干内容
     */
    @NotBlank(message = "题干不能为空")
    @ApiModelProperty(value = "题干内容",required=true,example="这是题干内容")
    private String content;

    /**
     * 分数
     */
    @NotNull(message = "分数不能为空")
    @ApiModelProperty(value = "分数",required=true,example="10.0")
    private Double score;
    /**
     * 客观题类型
     */
    @ApiModelProperty(value = "客观题类型",required=true)
    private String type;

    /**
     * 正确判断结果

    @ApiModelProperty(value = "正确判断结果",required=true,example="true")
    private boolean result;
     */

    /**
     * 数值格式 | 文字格式

    @ApiModelProperty(value = "格式类型：1数值格式,2文字格式",required=true,example="1")
    private Integer keyType;
     */
    /**
     * 数值格式答案

    @ApiModelProperty(value = "数值格式答案")
    private String decimalKey;
     */
    /**
     * 文字格式答案

    @ApiModelProperty(value = "文字格式答案")
    private String textKey;
     */
    /**
     * 匹配类型：精确 | 模糊

    @ApiModelProperty(value = "匹配类型：1精确,2模糊",required=true,example ="1")
    private Integer matchType;
     */
    /**
     * 是否唯一答案

    @ApiModelProperty(value = "是否唯一答案",required=true,example ="true")
    private boolean unique;
     */
    /**
     * 选择题选项

    @ApiModelProperty(value = "选择题选项",required=true)
    private List<OptionSaveVo> options;
     */

    /**
     * 正确答案
     */
    @ApiModelProperty(value = "正确答案",required=true)
    private String key;
}