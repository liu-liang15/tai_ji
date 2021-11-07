package com.wupai.taiji.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 预定表 
 * @TableName ky_surepre
 */
@TableName(value ="ky_surepre")
@Data
public class KySurepre implements Serializable {

    /**
     * 客户预定收款账户
     */
//    private CwAccount cwAccount;
    
    /**
     * 客户预定跟进人员
     */
    private HtYuanGo kyYg;

    /**
     * 客户预定状态
     */
    private KyTypez kyStatu;
    /**
     * 客户预定和客户信息
     */
    private KyCustominfo kyCustominfo;
    /**
     * 客户预约和客户预定
     */
    private KyPre KyPre ;
    /**
     * 预定编号
     */
    @TableId(type = IdType.AUTO)
    private Integer suid;

    /**
     * 预计签约时间
     */
    private Date sutime;

    /**
     * 定金失效时间
     */
    private Date suntime;






}