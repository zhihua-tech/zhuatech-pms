/* Copyright 2026 上海如静知华信息科技有限公司 · https://www.zhuatech.cn/ */
package cn.zhuatech.pms.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
 */
@Entity
@Table(name = "pms_project")
public class Project extends BaseEntity {
    @Column(nullable = false, unique = true, length = 32) private String projectCode;
    @Column(nullable = false, length = 120) private String projectName;
    @Column(nullable = false, length = 100) private String customer;
    @Column(nullable = false, length = 40) private String manager;
    @Column(nullable = false) private LocalDate plannedStart;
    @Column(nullable = false) private LocalDate plannedEnd;
    @Column(nullable = false, precision = 14, scale = 2) private BigDecimal budget;
    @Column(nullable = false) private Integer progress;
    @Column(nullable = false, length = 20) private String status;
    @Column(nullable = false, length = 20) private String health;

    /**
     * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
     */
    protected Project() {}

    /**
     * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
     */
    public Project(String code, String name, String customer, String manager, LocalDate plannedStart,
                   LocalDate plannedEnd, BigDecimal budget, Integer progress, String status, String health) {
        this.projectCode = code;
        this.projectName = name;
        this.customer = customer;
        this.manager = manager;
        this.plannedStart = plannedStart;
        this.plannedEnd = plannedEnd;
        this.budget = budget;
        this.progress = progress;
        this.status = status;
        this.health = health;
    }

    /**
     * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
     */
    public String getProjectCode() { return projectCode; }
    /**
     * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
     */
    public String getProjectName() { return projectName; }
    /**
     * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
     */
    public String getCustomer() { return customer; }
    /**
     * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
     */
    public String getManager() { return manager; }
    /**
     * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
     */
    public LocalDate getPlannedStart() { return plannedStart; }
    /**
     * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
     */
    public LocalDate getPlannedEnd() { return plannedEnd; }
    /**
     * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
     */
    public BigDecimal getBudget() { return budget; }
    /**
     * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
     */
    public Integer getProgress() { return progress; }
    /**
     * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
     */
    public String getStatus() { return status; }
    /**
     * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
     */
    public String getHealth() { return health; }
}
