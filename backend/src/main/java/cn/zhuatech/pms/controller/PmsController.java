/* Copyright 2026 上海如静知华信息科技有限公司 · https://www.zhuatech.cn/ */
package cn.zhuatech.pms.controller;

import cn.zhuatech.pms.common.ApiResponse;
import cn.zhuatech.pms.dto.PmsDto.CreateProjectRequest;
import cn.zhuatech.pms.dto.PmsDto.CreateTaskRequest;
import cn.zhuatech.pms.dto.PmsDto.Dashboard;
import cn.zhuatech.pms.dto.PmsDto.MilestoneView;
import cn.zhuatech.pms.dto.PmsDto.ProjectView;
import cn.zhuatech.pms.dto.PmsDto.RiskView;
import cn.zhuatech.pms.dto.PmsDto.SubmitTimesheetRequest;
import cn.zhuatech.pms.dto.PmsDto.TaskView;
import cn.zhuatech.pms.dto.PmsDto.TimesheetView;
import cn.zhuatech.pms.service.PmsService;
import jakarta.validation.Valid;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/**
 * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
 */
@RestController
@RequestMapping("/api/pms")
public class PmsController {
    private final PmsService service;

    /**
     * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
     */
    public PmsController(PmsService service) { this.service = service; }

    /**
     * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
     */
    @GetMapping("/dashboard") public ApiResponse<Dashboard> dashboard() {
        return ApiResponse.ok(service.dashboard());
    }
    /**
     * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
     */
    @GetMapping("/projects") public ApiResponse<List<ProjectView>> projects() {
        return ApiResponse.ok(service.projects());
    }
    /**
     * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
     */
    @GetMapping("/tasks") public ApiResponse<List<TaskView>> tasks() {
        return ApiResponse.ok(service.tasks());
    }
    /**
     * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
     */
    @GetMapping("/milestones") public ApiResponse<List<MilestoneView>> milestones() {
        return ApiResponse.ok(service.milestones());
    }
    /**
     * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
     */
    @GetMapping("/risks") public ApiResponse<List<RiskView>> risks() {
        return ApiResponse.ok(service.risks());
    }
    /**
     * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
     */
    @GetMapping("/timesheets") public ApiResponse<List<TimesheetView>> timesheets() {
        return ApiResponse.ok(service.timesheets());
    }

    /**
     * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
     */
    @PostMapping("/projects")
    @PreAuthorize("hasAnyRole('ADMIN','PROJECT_MANAGER')")
    public ApiResponse<ProjectView> createProject(@Valid @RequestBody CreateProjectRequest request) {
        return ApiResponse.ok("项目创建成功", service.createProject(request));
    }

    /**
     * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
     */
    @PostMapping("/tasks")
    @PreAuthorize("hasAnyRole('ADMIN','PROJECT_MANAGER')")
    public ApiResponse<TaskView> createTask(@Valid @RequestBody CreateTaskRequest request) {
        return ApiResponse.ok("项目任务创建成功", service.createTask(request));
    }

    /**
     * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
     */
    @PatchMapping("/tasks/{id}/advance")
    @PreAuthorize("hasAnyRole('ADMIN','PROJECT_MANAGER','MEMBER')")
    public ApiResponse<TaskView> advanceTask(@PathVariable Long id) {
        return ApiResponse.ok("项目任务状态已推进", service.advanceTask(id));
    }

    /**
     * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
     */
    @PostMapping("/timesheets")
    @PreAuthorize("hasAnyRole('ADMIN','PROJECT_MANAGER','MEMBER')")
    public ApiResponse<TimesheetView> submitTimesheet(@Valid @RequestBody SubmitTimesheetRequest request) {
        return ApiResponse.ok("工时已提交", service.submitTimesheet(request));
    }
}
