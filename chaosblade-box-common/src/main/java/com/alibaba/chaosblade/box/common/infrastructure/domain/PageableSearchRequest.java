package com.alibaba.chaosblade.box.common.infrastructure.domain;

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
public class PageableSearchRequest extends PageableRequest {

    private String key;
}
