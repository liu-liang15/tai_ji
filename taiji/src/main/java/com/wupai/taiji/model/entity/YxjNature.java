package com.wupai.taiji.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName yxj_nature
 */
@TableName(value ="yxj_nature")
@Data
public class YxjNature implements Serializable {
    /**
     * 房屋性质id
     */
    @TableId(type = IdType.AUTO)
    private Integer natureId;

    /**
     * 房屋性质名称
     */
    private String natureName;

    /**
     * 排序值
     */
    private Integer natureNum;

    /**
     * 性质描述
     */
    private String natureRemark;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}