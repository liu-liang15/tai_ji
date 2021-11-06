package com.wupai.taiji.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 岗位表 
 * @TableName ll_gang_wei
 */
@TableName(value ="ll_gang_wei")
@Data
public class LlGangWei implements Serializable {
    /**
     * 岗位ID
     */
    @TableId(type = IdType.AUTO)
    private Integer gwId;

    /**
     * 岗位名称
     */
    private String gwName;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}