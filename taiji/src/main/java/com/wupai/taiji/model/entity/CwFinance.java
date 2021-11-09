package com.wupai.taiji.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 
 * @TableName cw_finance
 */
@TableName(value ="cw_finance")
@Data
@Accessors(chain = true)
public class CwFinance implements Serializable {
    /**
     * 财务信息编号
     */
    private Integer financeId;

    /**
     * 入住编号（外键）
     */
    private HtRuZhur htRuZhur;
    private Integer rzId;

    /**
     * 费用类型
     */
    private CwCosttype cwCosttype;
    private String costtypeId;

    /**
     * 费用描述
     */
    private String costDescription;

    /**
     * 费用周期（开始）
     */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Timestamp costCyclestart;

    /**
     * 费用周期（结束）
     */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Timestamp costCycleend;

    /**
     * 金额
     */
    private BigDecimal money;

    /**
     * 收支时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date budgetsTime;

    /**
     * 状态(0：待收款；1：待付款；2：待审核；3：审核成功；4：审核失败)
     */
    private Integer state;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}