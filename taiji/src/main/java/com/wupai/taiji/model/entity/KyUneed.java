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
 * 客户需求表 
 * @TableName ky_uneed
 */
@TableName(value ="ky_uneed")
@Data
public class KyUneed implements Serializable {
    /**
     * 客户需求和客户信息
     */
    private KyCustominfo kyCustominfo;

    /**
     * 需求编号
     */
    @TableId(type = IdType.AUTO)
    private Integer uid;

    /**
     * 客户编号
     */
    private Integer uCid;

    /**
     * 需求类型编号
     */
    private Integer uNeedTid;

    /**
     * 入住时间
     */
    private Date uIntime;

    /**
     * 租期类型
     */
    private Integer uTenancyTid;
    /**
     * 最高价格
     */
    private BigDecimal uTopmoney;
    /**
     * 最低价格
     */
    private BigDecimal uDownmoney;
    /**
     * 省
     */
    private String uProvince;
    /**
     * 市
     */
    private String uPcity;
    /**
     * 区
     */
    private String uParea;
}