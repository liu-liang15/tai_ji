package com.wupai.taiji.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 费用类型表 
 * @TableName cw_costtype
 */
@TableName(value ="cw_costtype")
@Data
public class CwCosttype implements Serializable {
    /**
     * 费用类型编号
     */
    @TableId(type = IdType.AUTO)
    private Integer costtypeId;

    /**
     * 费用类型名称
     */
    private String costtypeName;

    /**
     * 增加人
     */
    private String addname;

    /**
     * 增加时间
     */
    private Date addtime;

    /**
     * 修改人
     */
    private String updatename;

    /**
     * 最后修改时间
     */
    private Date updatetime;

    /**
     * 删除人
     */
    private String deletename;

    /**
     * 删除时间
     */
    private Date deletetime;

    /**
     * 时效性
     */
    private Integer timeliness;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}