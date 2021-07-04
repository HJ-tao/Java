package edu.whut.cs.jee.mooc.upms.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * @author wadao
 * @version 1.0
 * @date 2020/6/15 18:20
 * @site niter.cn
 */

@Entity
@Data
@EqualsAndHashCode
@DiscriminatorValue("Admin")
public class Admin extends User {

    @Column(name = "title")
    private String title;

    @Column(name = "salary_no")
    private String salaryNo;

}
