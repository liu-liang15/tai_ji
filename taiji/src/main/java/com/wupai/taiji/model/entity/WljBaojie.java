package com.wupai.taiji.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 保洁表 
 * @TableName wlj_baojie
 */
@TableName(value ="wlj_baojie")
@Data
public class WljBaojie implements Serializable {
    /**
     * 保洁编号
     */
    @TableId(type = IdType.AUTO)
    private Integer bjId;

    /**
     * 预约上门时间
     */
    private String bjTime;

    /**
     * 联系电话
     */
    private String bjPhone;

    /**
     * 申请原因
     */
    private String bjReason;

    /**
     * 房屋地址外键编号
     */
    private String fyId;

    /**
     * 保洁单状态
     */
    private String ztId;

    /**
     * 租客姓名
     */
    private String wxName;

    /**
     * 申请来源
     */
    private String bjLaiyuan;

    /**
     * 派单ID
     */
    private String pdId;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}