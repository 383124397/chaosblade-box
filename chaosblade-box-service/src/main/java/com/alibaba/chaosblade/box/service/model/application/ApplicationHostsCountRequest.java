package com.alibaba.chaosblade.box.service.model.application;

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
public class ApplicationHostsCountRequest extends BaseRequest {

    private String appId;

    private List<String> groupNames;

}
