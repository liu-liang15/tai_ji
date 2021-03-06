package com.wupai.taiji.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 企业账户表 
 * @TableName cw_account
 */
@TableName(value ="cw_account")
@Data
public class CwAccount implements Serializable {
    /**
     * 客户预定
     */
    private KySurepre kySurepre;
    /**
     * 企业账户编号
     */
    private Integer accountId;

    /**
     * 账户名称
     */
    private String accountName;

    /**
     * 银行卡号码
     */
    private String number;

    /**
     * 持卡人姓名
     */
    private String cardholderName;

    /**
     * 开户行
     */
    private String bank;

    /**
     * 支行全称
     */
    private String bankName;

    /**
     * 商户号
     */
    private String merchant;

    /**
     * 备注
     */
    private String remarks;

    /**
     * 账户状态
     */
    private Integer accountState;

    /**
     * 增加人
     */
    private String addname;

    /**
     * 增加时间
     */
    private Date addtime;

    /**
     * 修改人
     */
    private String updatename;

    /**
     * 最后修改时间
     */
    private Date updatetime;

    /**
     * 删除人
     */
    private String deletename;

    /**
     * 删除时间
     */
    private String deletetime;

    /**
     * 时效性
     */
    private Integer timeliness;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}