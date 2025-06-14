package com.alibaba.chaosblade.box.service.model.scope;

import com.alibaba.chaosblade.box.common.common.domain.PageableRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * @author haibin
 *
 *
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class CloudUserScopeRequest extends PageableRequest {

    private Integer scopeType;
    private Integer osType;
    private String key;

    private List<String> tags;
}
