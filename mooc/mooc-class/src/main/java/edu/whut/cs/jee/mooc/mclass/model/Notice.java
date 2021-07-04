package edu.whut.cs.jee.mooc.mclass.model;

/**
 * @author wadao
 * @version 1.0
 * @date 2020/6/11 17:51
 * @site niter.cn
 */

import edu.whut.cs.jee.mooc.common.persistence.BaseEntity;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 课堂公告
 */
@Entity
@Table(name = "mclass_notice")
@Builder
@Data
@ToString(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
public class Notice extends BaseEntity {

    /**
     * 课程id
     */
    @Column(name = "course_id")
    private Long courseId;

    /**
     * 公告标题
     */
    @Column(name = "title")
    private String title;

    /**
     * 公告链接
     */
    @Column(name = "url")
    private String url;

    /**
     * 公告图片
     */
    @Column(name = "image")
    private String image;

    /**
     * 公告内容
     */
    @Column(name = "content")
    private String content;

    /**
     * 公告状态
     */
    @Column(name = "status")
    private Integer status;

}
