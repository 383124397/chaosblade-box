package com.alibaba.chaosblade.box.service.model.application;

import com.alibaba.chaosblade.box.common.common.domain.PageableRequest;
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
public class UserApplicationQueryRequest extends PageableRequest {
	
	@JSONField(name = "app_name")
	private String appName;
	
	@JSONField(name = "app_id")
	private Long appId;
}
