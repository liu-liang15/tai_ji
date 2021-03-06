package com.wupai.taiji.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 维修表 
 * @TableName zh_weixiu
 */
@TableName(value ="zh_weixiu")
@Data
public class ZhWeixiu implements Serializable {
    /**
     * 维修编号
     */
    @TableId(type = IdType.AUTO)
    private Integer wxId;

    /**
     * 预约上门时间
     */
    private Date wxTime;

    /**
     * 联系电话
     */
    private String wxPhone;

    /**
     * 申请原因
     */
    private String wxReason;

    /**
     * 房屋地址外键编号
     */
    private String fwId;

    /**
     * 维修单状态外键
     */
    private String ztId;

    /**
     * 维修紧急状态外键id
     */
    private String jjId;

    /**
     * 维修类型外键
     */
    private String lxId;

    /**
     * 
     */
    private String pxLx;

    /**
     * 租客姓名
     */
    private String wxName;

    /**
     * 申请来源
     */
    private String wxLaiyuan;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}