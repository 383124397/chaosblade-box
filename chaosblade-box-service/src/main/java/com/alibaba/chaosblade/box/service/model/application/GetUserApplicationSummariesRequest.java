package com.alibaba.chaosblade.box.service.model.application;

import com.alibaba.chaosblade.box.common.common.domain.PageableRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author haibin
 *
 *
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class GetUserApplicationSummariesRequest extends PageableRequest {

    private boolean filterDisabled;

}
