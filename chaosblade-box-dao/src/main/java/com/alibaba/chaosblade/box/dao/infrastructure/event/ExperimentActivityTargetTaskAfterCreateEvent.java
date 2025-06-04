package com.alibaba.chaosblade.box.dao.infrastructure.event;

import lombok.Getter;

/**
 * @author haibin
 * 
 *
 */
public class ExperimentActivityTargetTaskAfterCreateEvent extends BaseChaosEvent {

    @Getter
    protected String executionId;

    public ExperimentActivityTargetTaskAfterCreateEvent(String executionId) {
        this.executionId = executionId;
    }
}
