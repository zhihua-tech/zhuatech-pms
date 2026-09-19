/* Copyright 2026 上海如静知华信息科技有限公司 · https://www.zhuatech.cn/ */
package cn.zhuatech.pms.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

/**
 * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
 */
@Entity
@Table(name = "pms_project_risk")
public class ProjectRisk extends BaseEntity {
    @Column(nullable = false, unique = true, length = 32) private String riskNo;
    @Column(nullable = false, length = 32) private String projectCode;
    @Column(nullable = false, length = 160) private String title;
    @Column(nullable = false, length = 40) private String owner;
    @Column(nullable = false, length = 16) private String probability;
    @Column(nullable = false, length = 16) private String impact;
    @Column(nullable = false, length = 260) private String mitigation;
    @Column(nullable = false, length = 20) private String status;

    /**
     * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
     */
    protected ProjectRisk() {}

    /**
     * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
     */
    public ProjectRisk(String riskNo, String projectCode, String title, String owner, String probability,
                       String impact, String mitigation, String status) {
        this.riskNo = riskNo;
        this.projectCode = projectCode;
        this.title = title;
        this.owner = owner;
        this.probability = probability;
        this.impact = impact;
        this.mitigation = mitigation;
        this.status = status;
    }

    /**
     * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
     */
    public String getRiskNo() { return riskNo; }
    /**
     * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
     */
    public String getProjectCode() { return projectCode; }
    /**
     * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
     */
    public String getTitle() { return title; }
    /**
     * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
     */
    public String getOwner() { return owner; }
    /**
     * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
     */
    public String getProbability() { return probability; }
    /**
     * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
     */
    public String getImpact() { return impact; }
    /**
     * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
     */
    public String getMitigation() { return mitigation; }
    /**
     * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
     */
    public String getStatus() { return status; }
}
