package com.wupai.taiji.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 员工表 
 * @TableName ht_yuan_go
 */
@TableName(value ="ht_yuan_go")
@Data
public class HtYuanGo implements Serializable {

    /**
     * 客户预定跟进人员
     */
    @TableField(exist = false)
    private KySurepre kySurepreYg;
    /**
     * 员工ID
     */
    @TableId(type = IdType.AUTO)
    private Integer ygId;

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