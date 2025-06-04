package com.alibaba.chaosblade.box.dao.infrastructure.event;

import com.alibaba.chaosblade.box.dao.model.ExperimentMiniAppTaskDO;
import lombok.Getter;

/**
 * @author haibin
 *
 *
 */
@Getter
public class ExperimentActivityTargetTaskBeforeCreateEvent extends BaseChaosEvent {

    protected ExperimentMiniAppTaskDO experimentMiniAppTaskDO;

    public ExperimentActivityTargetTaskBeforeCreateEvent(ExperimentMiniAppTaskDO experimentMiniAppTaskDO) {
        this.experimentMiniAppTaskDO = experimentMiniAppTaskDO;

    }
}
