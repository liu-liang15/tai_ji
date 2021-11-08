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
 * 
 * @TableName cw_finance
 */
@TableName(value ="cw_finance")
@Data
public class CwFinance implements Serializable {
    /**
     * 财务信息编号
     */
    private Integer financeId;

    /**
     * 入住编号（外键）
     */
    private HtRuZhur htRuZhur;
    private String rzId;

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
    private Date costCyclestart;

    /**
     * 费用周期（结束）
     */
    private Date costCycleend;

    /**
     * 金额
     */
    private BigDecimal money;

    /**
     * 收支时间
     */
    private Date budgetsTime;

    /**
     * 状态(0：待收款；1：待付款；2：待审核；3：审核成功；4：审核失败)
     */
    private Integer state;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}