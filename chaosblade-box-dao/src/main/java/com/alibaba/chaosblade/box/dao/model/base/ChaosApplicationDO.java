package com.alibaba.chaosblade.box.dao.model.base;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@ToString
@EqualsAndHashCode(callSuper = true)
public class ChaosApplicationDO extends BaseDO {

    /**
     * 应用名
     */
    private String appName;

    /**
     * namespace
     */
    private String namespace;

    /**
     * 应用归属账号
     */
    private String userId;

    /**
     * 应用类型
     */
    private Integer appType;

    /**
     * 应用是否被禁用
     */
    private Boolean disabled;

    /**
     * 资源划分维度
     */
    private Integer dimension;

}
