/* Copyright 2026 上海如静知华信息科技有限公司 · https://www.zhuatech.cn/ */
package cn.zhuatech.pms.controller;
import cn.zhuatech.pms.common.ApiResponse;
import cn.zhuatech.pms.service.AiProjectCopilotService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;
/**
 * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
 */
@RestController @RequestMapping("/api/pms/ai")
public class AiProjectCopilotController {
    private final AiProjectCopilotService service;
    /**
     * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
     */
    public AiProjectCopilotController(AiProjectCopilotService service) { this.service = service; }
    /**
     * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
     */
    @PostMapping("/project-copilot")
    public ApiResponse<AiProjectCopilotService.Result> summarize(@Valid @RequestBody AiProjectCopilotService.Request request) {
        return ApiResponse.ok(service.summarize(request));
    }
}
