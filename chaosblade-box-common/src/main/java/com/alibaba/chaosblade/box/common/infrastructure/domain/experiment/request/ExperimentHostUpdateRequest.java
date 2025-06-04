package com.alibaba.chaosblade.box.common.infrastructure.domain.experiment.request;

import com.alibaba.chaosblade.box.common.app.sdk.scope.Host;
import com.alibaba.chaosblade.box.common.common.domain.BaseRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * @author sunpeng
 *
 *
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class ExperimentHostUpdateRequest extends BaseRequest {

    private String experimentId;

    private String miniGroupId;

    private String appId;

    private List<String> appGroups;

    private List<Host> hosts;

    private Integer selectType = 1;

    private Integer hostPercent;

}
