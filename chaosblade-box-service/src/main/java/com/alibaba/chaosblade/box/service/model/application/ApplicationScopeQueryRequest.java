package com.alibaba.chaosblade.box.service.model.application;

import com.alibaba.chaosblade.box.common.common.domain.BaseRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author haibin.lhb
 *
 *
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class ApplicationScopeQueryRequest extends BaseRequest {

    private  String appConfigurationId;;

}
