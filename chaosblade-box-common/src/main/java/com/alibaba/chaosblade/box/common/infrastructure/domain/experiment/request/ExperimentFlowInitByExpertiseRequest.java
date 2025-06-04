package com.alibaba.chaosblade.box.common.infrastructure.domain.experiment.request;

import com.alibaba.chaosblade.box.common.common.domain.BaseRequest;
import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author haibin
 *
 * 
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class ExperimentFlowInitByExpertiseRequest extends BaseRequest {

    /**
     * 经验Id
     */
    @JSONField(name = "expertise_id")
    private String expertiseId;
}
