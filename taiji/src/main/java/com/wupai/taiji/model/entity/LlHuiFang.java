package com.wupai.taiji.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 回访记录表 
 * @TableName ll_hui_fang
 */
@TableName(value ="ll_hui_fang")
@Data
public class LlHuiFang implements Serializable {
    /**
     * 回访ID
     */
    @TableId(type = IdType.AUTO)
    private Integer hfid;

    /**
     * 回访记录
     */
    private String hfjl;

    /**
     * 回访人
     */
    private String hfr;

    /**
     * 回访的合同ID
     */
    private String htId;

    /**
     * 回访时间
     */
    private Date hfSj;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}