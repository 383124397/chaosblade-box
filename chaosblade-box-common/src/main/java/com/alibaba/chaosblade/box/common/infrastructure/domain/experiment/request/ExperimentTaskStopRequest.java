package com.alibaba.chaosblade.box.common.infrastructure.domain.experiment.request;

import com.alibaba.chaosblade.box.common.common.domain.task.BaseExperimentTaskRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author haibin
 *
 *
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class ExperimentTaskStopRequest extends BaseExperimentTaskRequest {

    private boolean sync;

    private boolean fromScheduler;
}
