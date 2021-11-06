package com.wupai.taiji.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName yxj_room_type
 */
@TableName(value ="yxj_room_type")
@Data
public class YxjRoomType implements Serializable {
    /**
     * 房间户型id
     */
    @TableId(type = IdType.AUTO)
    private Integer typeId;

    /**
     * 房间户型（主卧..）
     */
    private String typeName;

    /**
     * 排序值
     */
    private Integer typeNum;

    /**
     * 房间描述
     */
    private String typeRemark;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}