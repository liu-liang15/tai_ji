package com.wupai.taiji.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName yxj_fitment
 */
@TableName(value ="yxj_fitment")
@Data
public class YxjFitment implements Serializable {
    /**
     * 装修类型表id
     */
    @TableId(type = IdType.AUTO)
    private Integer fitmentId;

    /**
     * 装修类型名称
     */
    private String fitmentName;

    /**
     * 排序值
     */
    private Integer fitmentNum;

    /**
     * 装修类型描述
     */
    private String fitmentRemark;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}