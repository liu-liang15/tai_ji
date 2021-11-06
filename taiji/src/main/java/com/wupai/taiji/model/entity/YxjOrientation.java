package com.wupai.taiji.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName yxj_orientation
 */
@TableName(value ="yxj_orientation")
@Data
public class YxjOrientation implements Serializable {
    /**
     * 房间朝向id
     */
    @TableId(type = IdType.AUTO)
    private Integer orientationId;

    /**
     * 房间朝向名称
     */
    private String orientationName;

    /**
     * 排序值
     */
    private Integer orientationNum;

    /**
     * 房间朝向描述
     */
    private String orientationRemarke;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}