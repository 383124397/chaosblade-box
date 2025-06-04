package com.alibaba.chaosblade.box.controller;

import com.alibaba.chaosblade.box.model.RestResponseUtil;
import com.alibaba.chaosblade.box.service.model.RestResponse;
import groovy.util.logging.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author chennan01
 * Date 2025/4/22
 * Time 17:07
 * Description please write the file desc over here
 */
@RestController
@Slf4j
public class VCreditController {

    /**
     * 健康检查
     *
     * @return RestResponse
     */
    @GetMapping("/actuator/health")
    public RestResponse<Void> health() {
        return RestResponseUtil.ok();
    }

    /**
     * 指标检查
     *
     * @return RestResponse
     */
    @GetMapping("/actuator/metrics")
    public RestResponse<Void> metrics() {
        return RestResponseUtil.ok();
    }
}
