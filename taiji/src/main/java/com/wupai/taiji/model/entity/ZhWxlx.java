package com.wupai.taiji.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 维修类型 
 * @TableName zh_wxlx
 */
@TableName(value ="zh_wxlx")
@Data
public class ZhWxlx implements Serializable {
    /**
     * 维修类型id
     */
    @TableId(type = IdType.AUTO)
    private Integer lxId;

    /**
     * 维修类型名称
     */
    private String lxName;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}