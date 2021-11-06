package com.wupai.taiji.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 预约表 
 * @TableName ys_pre
 */
@TableName(value ="ys_pre")
@Data
public class YsPre implements Serializable {
    /**
     * 预约编号
     */
    @TableId(type = IdType.AUTO)
    private Integer pid;

    /**
     * 租客编号
     */
    private Integer pCid;

    /**
     * 房源编号
     */
    private Integer pHid;

    /**
     * 预约类型（合租，整租）
     */
    private Integer pTid;

    /**
     * 预约状态
     */
    private Integer pStatuTid;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}