package com.alibaba.chaosblade.box.service.model.expertise;

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
public class ExperimentExpertiseUpdateRequest extends BaseExpertiseOperationRequest {

    @JSONField(name = "expertise_id")
    private String expertiseId;

    private boolean syncConfig = false;

    private Integer expertiseState;
}
