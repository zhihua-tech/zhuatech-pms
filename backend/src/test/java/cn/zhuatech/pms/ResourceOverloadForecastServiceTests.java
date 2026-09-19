/* Copyright 2026 上海如静知华信息科技有限公司 · https://www.zhuatech.cn/ */
package cn.zhuatech.pms;

import cn.zhuatech.pms.service.ResourceOverloadForecastService;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
 */
class ResourceOverloadForecastServiceTests {
    private final ResourceOverloadForecastService service = new ResourceOverloadForecastService();

    /**
     * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
     */
    @Test void escalatesSevereOverload() {
        var result = service.forecast(new ResourceOverloadForecastService.Request(
            bd("100"), bd("145"), bd("110"), 4, bd("10"), 3));
        assertThat(result.status()).isEqualTo("ESCALATE");
        assertThat(result.reallocationHours()).isPositive();
    }

    /**
     * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
     */
    @Test void keepsBalancedPlan() {
        var result = service.forecast(new ResourceOverloadForecastService.Request(
            bd("120"), bd("90"), bd("60"), 1, bd("8"), 0));
        assertThat(result.status()).isEqualTo("BALANCED");
        assertThat(result.shortageHours()).isZero();
    }

    /**
     * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
     */
    private BigDecimal bd(String value) { return new BigDecimal(value); }
}
