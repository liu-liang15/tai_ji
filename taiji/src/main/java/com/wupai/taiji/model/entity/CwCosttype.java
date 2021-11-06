package com.wupai.taiji.model.entity;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableName;
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

    private static final long serialVersionUID = 1L;
}