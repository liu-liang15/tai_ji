package com.wupai.taiji.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName yxj_feature
 */
@TableName(value ="yxj_feature")
@Data
public class YxjFeature implements Serializable {
    /**
     * 房间特色表id
     */
    @TableId(type = IdType.AUTO)
    private Integer featureId;

    /**
     * 房间特色名称
     */
    private String featureName;

    /**
     * 排序值
     */
    private Integer featureNum;

    /**
     * 房间特色描述
     */
    private String featureRemarke;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}