package edu.whut.cs.jee.mooc.mclass.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @author wadao
 * @version 1.0
 * @date 2020/6/11 18:15
 * @site niter.cn
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description="公告传输对象")
public class NoticeDto {
    @ApiModelProperty(value="公告id")
    private Long id;

    @NotNull(message = "课程id不允许为空")
    @ApiModelProperty(value="课程id",required=true,example="1")
    private Long courseId;

    @NotBlank(message = "公告标题不允许为空")
    @ApiModelProperty(value="公告标题",required=true,example="这是公告标题")
    private String title;

    @ApiModelProperty(value="公告链接",example="/notice/detail/1")
    private String url;

    @ApiModelProperty(value="公告图片",example="/images/1.png")
    private String image;

    @NotBlank(message = "公告内容不允许为空")
    @ApiModelProperty(value="公告内容",required=true,example="这是公告内容")
    private String content;

    @ApiModelProperty(value="公告状态",example="1")
    private Integer status;
}
