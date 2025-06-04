package com.alibaba.chaosblade.box.dao.model.base;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class BaseDO implements Serializable {

    public static final String COLUMN_ID = "id";

    public static final String COLUMN_GMT_CREATE = "gmt_create";

    private Long id;

    @TableField(fill = FieldFill.INSERT)
    private Date gmtCreate;

    @TableField(fill = FieldFill.INSERT_UPDATE, update = "now()")
    private Date gmtModified;
}
