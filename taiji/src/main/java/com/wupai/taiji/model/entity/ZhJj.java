package com.wupai.taiji.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName zh_jj
 */
@TableName(value ="zh_jj")
@Data
public class ZhJj implements Serializable {
    /**
     * 维修紧急状态id
     */
    @TableId
    private Integer wxjjid;

    /**
     * 维修紧急状态名称
     */
    private String wxjjname;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}