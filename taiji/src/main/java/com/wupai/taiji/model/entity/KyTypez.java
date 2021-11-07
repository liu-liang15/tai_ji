package com.wupai.taiji.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.List;

import lombok.Data;

/**
 * 类别表 
 * @TableName ky_typez
 */
@TableName(value ="ky_typez")
@Data
public class KyTypez implements Serializable {

    /**
     * 预定状态
     */
    private List<KySurepre > KySuStatu;
    /**
     * 客户来源
     */
    private List<KyCustominfo> custins;
    /**
     * 租房方式
     */
    private List<KyPre >kyPreway;
    /**
     * 预约状态
     */
    private List<KyPre>  kyPrestatu;
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


}