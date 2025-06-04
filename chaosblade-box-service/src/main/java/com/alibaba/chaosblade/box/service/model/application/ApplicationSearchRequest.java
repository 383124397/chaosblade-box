package com.alibaba.chaosblade.box.service.model.application;

import com.alibaba.chaosblade.box.common.common.domain.PageableRequest;
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
public class ApplicationSearchRequest extends PageableRequest {

    private String key;

    private String appType;

    private Integer osType;

    private boolean filterDisabled;

    private List<Long> appIds;

}
