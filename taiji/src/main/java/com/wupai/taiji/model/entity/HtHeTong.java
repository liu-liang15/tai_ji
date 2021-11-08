package com.wupai.taiji.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

/**
 * 合同表 
 * @TableName ht_he_tong
 */
@TableName(value ="ht_he_tong")
@Data
public class HtHeTong implements Serializable {
    /**
     * 主键ID
     */
    @TableId(type = IdType.AUTO)
    private Integer zjId;

    /**
     * 合同 编号
     */
    private String htId;

    /**
     * 房源编号
     */
    private String fwId;
    /**
     * 承租人Id
     */
    private  String czr;
    /**
     * 承租人实体类
     */
    @TableField(exist = false)
    private HtRuZhur czrPojo;
    /**
     * 入住人
     */
    @TableField(exist = false)
    private List<HtRuZhur> czrs;

    /**
     * 合同开始时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Timestamp htksSj;

    /**
     * 合同到期时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Timestamp htdqSj;

    /**
     * 每月租金（房源表查）
     */
    private BigDecimal zhuJing;

    /**
     * 押金
     */
    private BigDecimal yaJing;

    /**
     * 提前付款天数
     */
    private Integer tqfk;

    /**
     * 合同状态（审核）
     */
    private String zhuangTai;

    /**
     * 成交人实体类
     */
    @TableField(exist = false)
    private HtYuanGo cjr;

    /**
     * 成交人
     */
    @TableField("cjr")
    private String cjr2;



    /**
     * 备用字段
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Timestamp qysj;

    @TableField(exist = false)
    private FyHousing fyHousing;


}