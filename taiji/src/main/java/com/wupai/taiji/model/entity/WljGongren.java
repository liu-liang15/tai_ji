package com.wupai.taiji.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 工人表 
 * @TableName wlj_gongren
 */
@TableName(value ="wlj_gongren")
@Data
public class WljGongren implements Serializable {
    /**
     * 工人id
     */
    @TableId(type = IdType.AUTO)
    private Integer grId;

    /**
     * 工人名称
     */
    private String grName;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}