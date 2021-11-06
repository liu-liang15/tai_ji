package com.wupai.taiji.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 客户信息表 
 * @TableName ys_custominfo
 */
@TableName(value ="ys_custominfo")
@Data
public class YsCustominfo implements Serializable {
    /**
     * 编号
     */
    @TableId(type = IdType.AUTO)
    private Integer cid;

    /**
     * 姓名
     */
    private String cname;

    /**
     * 手机号码
     */
    private String ctel;

    /**
     * 身份证号码
     */
    private String cardnum;

    /**
     * 性别（0女1男）
     */
    private Boolean csex;

    /**
     * 来源类型编号
     */
    private String cTypeid;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}