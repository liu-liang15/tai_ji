package com.wupai.taiji.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 预定表 
 * @TableName ys_surepre
 */
@TableName(value ="ys_surepre")
@Data
public class YsSurepre implements Serializable {
    /**
     * 预定编号
     */
    @TableId(type = IdType.AUTO)
    private Integer suid;

    /**
     * 预计签约时间
     */
    private Date sutime;

    /**
     * 定金失效时间
     */
    private Date suntime;

    /**
     * 收款账号
     */
    private Integer accountId;

    /**
     * 房屋收订人
     */
    private Integer empid;

    /**
     * 预定状态(类别表)
     */
    private Integer sTid;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}