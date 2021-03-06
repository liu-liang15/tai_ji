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
 * 房源表 
 * @TableName fy_housing
 */
@TableName(value ="fy_housing")
@Data
public class FyHousing implements Serializable {
    /**
     * 房源ID（主键自增
     */
    @TableId(type = IdType.AUTO)
    private Integer houseId;

    /**
     * 城市
     */
    private String city;


    /**
     * 房源负责人（外键）id
     */
    private String userId;

    /**
     * 房间(几间卧室)
     */
    private String roomNum;

    /**
     * 厅
     */
    private String hall;

    /**
     * 卫
     */
    private String defend;

    /**
     * 厨房
     */
    private String kitchen;

    /**
     * 所处层数
     */
    private String inLayers;

    /**
     * 共几层
     */
    private String totalCeng;

    /**
     * 朝向id(外键)
     */
    private Integer orientationId;

    /**
     * 平方（共多少平方）
     */
    private String houseMeters;

    /**
     * 装修类型id(外键)
     */
    private Integer fitmentId;

    /**
     * 可租日期（房屋可租日期）
     */
    private Date houserRentDate;

    /**
     * 出租价格
     */
    private BigDecimal rentalPrices;

    /**
     * 底价
     */
    private BigDecimal houseFloorPrice;

    /**
     * 付款方式（押一付三）
     */
    private String housePaymentMethod;

    /**
     * 房屋特色id(外键)
     */
    private Integer featureId;

    /**
     * 房源描述
     */
    private String houseProperty;

    /**
     * 房屋状态（可租）
     */
    private Integer homeState;

    /**
     * 合租整租状态
     */
    private Integer jointRent;

    /**
     * 房屋性质id(外键)
     */
    private Integer natureId;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}