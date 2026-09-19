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
@Table(name = "pms_timesheet")
public class Timesheet extends BaseEntity {
    @Column(nullable = false, unique = true, length = 32) private String sheetNo;
    @Column(nullable = false, length = 32) private String projectCode;
    @Column(nullable = false, length = 40) private String contributor;
    @Column(nullable = false) private LocalDate workDate;
    @Column(nullable = false, precision = 4, scale = 1) private BigDecimal hours;
    @Column(nullable = false, length = 180) private String workItem;
    @Column(nullable = false, length = 20) private String approvalStatus;

    /**
     * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
     */
    protected Timesheet() {}

    /**
     * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
     */
    public Timesheet(String sheetNo, String projectCode, String contributor, LocalDate workDate,
                     BigDecimal hours, String workItem, String approvalStatus) {
        this.sheetNo = sheetNo;
        this.projectCode = projectCode;
        this.contributor = contributor;
        this.workDate = workDate;
        this.hours = hours;
        this.workItem = workItem;
        this.approvalStatus = approvalStatus;
    }

    /**
     * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
     */
    public String getSheetNo() { return sheetNo; }
    /**
     * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
     */
    public String getProjectCode() { return projectCode; }
    /**
     * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
     */
    public String getContributor() { return contributor; }
    /**
     * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
     */
    public LocalDate getWorkDate() { return workDate; }
    /**
     * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
     */
    public BigDecimal getHours() { return hours; }
    /**
     * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
     */
    public String getWorkItem() { return workItem; }
    /**
     * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
     */
    public String getApprovalStatus() { return approvalStatus; }
}
