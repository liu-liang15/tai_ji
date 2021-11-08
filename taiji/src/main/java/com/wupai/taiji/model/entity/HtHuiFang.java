package com.wupai.taiji.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

/**
 * 回访记录表 
 * @TableName ht_hui_fang
 */
@TableName(value ="ht_hui_fang")
@Data
public class HtHuiFang implements Serializable {
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
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Timestamp hfSj;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}