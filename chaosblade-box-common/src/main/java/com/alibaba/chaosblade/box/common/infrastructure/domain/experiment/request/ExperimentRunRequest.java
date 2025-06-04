package com.alibaba.chaosblade.box.common.infrastructure.domain.experiment.request;

import com.alibaba.chaosblade.box.common.common.domain.BaseRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author haibin
 * 
 *
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class ExperimentRunRequest extends BaseRequest {

    private String experimentId;

    protected ExperimentRunParam param;

    /**
     * 是否同步运行
     */
    private boolean sync = false;

    /**
     * 是否是定时任务触发
     */
    private boolean triggeredByScheduler;

}
