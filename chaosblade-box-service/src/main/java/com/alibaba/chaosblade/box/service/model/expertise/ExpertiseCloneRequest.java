package com.alibaba.chaosblade.box.service.model.expertise;

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
public class ExpertiseCloneRequest  extends BaseRequest {

    private String expertiseId;

    private String name;

}
