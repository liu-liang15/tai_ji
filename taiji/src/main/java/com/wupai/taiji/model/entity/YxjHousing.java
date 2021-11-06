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
 * @TableName yxj_housing
 */
@TableName(value ="yxj_housing")
@Data
public class YxjHousing implements Serializable {
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
     * 小区名称
     */
    private String plotName;

    /**
     * 区域
     */
    private String area;

    /**
     * 房屋编号（唯一）
     */
    private String houseNumber;

    /**
     * 楼号
     */
    private String buildingNo;

    /**
     * 单元
     */
    private String unit;

    /**
     * 室
     */
    private String house;

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
     * 朝向
     */
    private String houseOrientation;

    /**
     * 平方（共多少平方）
     */
    private String houseMeters;

    /**
     * 装修情况
     */
    private String fitment;

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
     * 房屋特色
     */
    private String houseCharacter;

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

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}