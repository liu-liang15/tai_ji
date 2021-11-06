package com.wupai.taiji.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * 派单表 
 * @TableName zh_paidan
 */
@TableName(value ="zh_paidan")
@Data
public class ZhPaidan implements Serializable {
    /**
     * 派单id
     */
    @TableId(type = IdType.AUTO)
    private Integer pdId;

    /**
     * 派单金额
     */
    private BigDecimal pdFeiyong;

    /**
     * 派单预计时间
     */
    private Date pdTime;

    /**
     * 派单工人id
     */
    private String paNaid;

    /**
     * 派单承担方
     */
    private String pdCdf;

    /**
     * 派单备注
     */
    private String pdBeizhu;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}