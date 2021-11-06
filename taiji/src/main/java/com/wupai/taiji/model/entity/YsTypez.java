package com.wupai.taiji.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 类别表 
 * @TableName ys_typez
 */
@TableName(value ="ys_typez")
@Data
public class YsTypez implements Serializable {
    /**
     * 子编号
     */
    @TableId(type = IdType.AUTO)
    private Integer tid;

    /**
     * 类别名字
     */
    private String tname;

    /**
     * 父级编号
     */
    private String tcid;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}