/* Copyright 2026 上海如静知华信息科技有限公司 · https://www.zhuatech.cn/ */
package cn.zhuatech.pms.controller;

import cn.zhuatech.pms.common.ApiResponse;
import cn.zhuatech.pms.service.DeliveryConfidenceService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

/**
 * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
 */
@RestController
@RequestMapping("/api/pms")
public class DeliveryConfidenceController {
    private final DeliveryConfidenceService service;
    /**
     * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
     */
    public DeliveryConfidenceController(DeliveryConfidenceService service) { this.service = service; }

    /**
     * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
     */
    @PostMapping("/delivery-confidence")
    public ApiResponse<DeliveryConfidenceService.Result> evaluate(@Valid @RequestBody DeliveryConfidenceService.Request request) {
        return ApiResponse.ok(service.evaluate(request));
    }
}
