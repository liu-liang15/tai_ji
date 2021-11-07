package com.wupai.taiji.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName zh_zhuantai
 */
@TableName(value ="zh_zhuantai")
@Data
public class ZhZhuantai implements Serializable {
    /**
     * 
     */
    @TableId
    private Integer zttId;

    /**
     * 
     */
    private String zttName;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}