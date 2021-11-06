package com.wupai.taiji.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * 房间表 
 * @TableName yxj_room
 */
@TableName(value ="yxj_room")
@Data
public class YxjRoom implements Serializable {
    /**
     * 房间表（id主键自增）
     */
    @TableId(type = IdType.AUTO)
    private Integer roomId;

    /**
     * 房间名称
     */
    private String roomName;

    /**
     * 朝向id(外键)
     */
    private Integer orientationId;

    /**
     * 房间户型id(外键)
     */
    private Integer typeId;

    /**
     * 平米（房间大小）
     */
    private String roomSquareMeters;

    /**
     * 出租价格
     */
    private BigDecimal roomPrices;

    /**
     * 底价
     */
    private BigDecimal roomFloorPrice;

    /**
     * 付款方式
     */
    private String roomPaymentMethod;

    /**
     * 可租时间
     */
    private Date rentTime;

    /**
     * 签约时长
     */
    private Date contractTime;

    /**
     * 房间特色id(外键)
     */
    private Integer featureId;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}