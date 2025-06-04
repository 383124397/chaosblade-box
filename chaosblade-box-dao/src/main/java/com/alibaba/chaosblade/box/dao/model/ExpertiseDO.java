package com.alibaba.chaosblade.box.dao.model;

import com.alibaba.chaosblade.box.dao.model.base.BaseDO;
import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author haibin
 *
 *
 */
@EqualsAndHashCode(callSuper = true)
@Data
@TableName(value = "t_chaos_expertise")
public class ExpertiseDO extends BaseDO {

    @TableId(value = "expertise_id", type = IdType.ID_WORKER)
    private String expertiseId;

    @TableField(value = "name", insertStrategy = FieldStrategy.NOT_EMPTY)
    private String name;

    @TableField(value = "function_desc", insertStrategy = FieldStrategy.NOT_EMPTY)
    private String functionDesc;

    @TableField(value = "background_desc", insertStrategy = FieldStrategy.NOT_EMPTY)
    private String backgroundDesc;

    @TableField(value = "design_concept", insertStrategy = FieldStrategy.NOT_EMPTY)
    private String designConcept;

    @TableField(value = "state")
    private Integer state;

    @TableField(value = "experiment_Id")
    private String experimentId;

    @TableField(value = "run_time")
    private ExpertiseRunTimeInfo runTime;

    @TableField(value = "user_id")
    private String userId;

    @TableField(value = "namespace")
    private String namespace;

    @TableField(value = "type")
    private Integer type;

    @TableField(value = "scope_type")
    private String scopeType;

}
