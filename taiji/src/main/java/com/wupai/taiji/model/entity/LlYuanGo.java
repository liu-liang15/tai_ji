package com.wupai.taiji.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 员工表 
 * @TableName ll_yuan_go
 */
@TableName(value ="ll_yuan_go")
@Data
public class LlYuanGo implements Serializable {
    /**
     * 员工ID
     */
    @TableId(type = IdType.AUTO)
    private Integer untitled;

    /**
     * 员工名
     */
    private String ygName;

    /**
     * 员工密码
     */
    private String password;

    /**
     * 员工岗位
     */
    private String gwId;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}