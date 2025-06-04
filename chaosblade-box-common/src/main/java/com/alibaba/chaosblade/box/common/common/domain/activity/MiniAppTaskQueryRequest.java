package com.alibaba.chaosblade.box.common.common.domain.activity;

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
public class MiniAppTaskQueryRequest extends BaseRequest {

    private  String miniAppTaskId;

}
