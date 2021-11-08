package com.wupai.taiji.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

/**
 * 预约表 
 * @TableName ky_pre
 */
@TableName(value ="ky_pre")
@Data
public class KyPre implements Serializable {



    /**
     * 客户预约状态
     */
    private KyTypez typeStatu;

    /**
     * 客户预约和客户预定
     */
    private KySurepre kySurepre;
    /**
     * 预约和信息
     */
    private KyCustominfo kyCustominfo;
    /**
     * 预约编号
     */
    @TableId(type = IdType.AUTO)
    private Integer pid;

    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Timestamp ptime;


}