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
     * 入住时间
     */
   @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Timestamp uIntime;

    /**
     * 租期类型
     */
    private KyTypez utenancy;

    /**
     * 地址
     */
    private String uddress;

}