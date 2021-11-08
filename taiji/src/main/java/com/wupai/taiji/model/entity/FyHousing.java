package com.wupai.taiji.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.List;

@Data
@TableName(value = "fy_housing")
public class FyHousing {
  //主键
  @TableId(type = IdType.AUTO)
  private Integer houseId;
  private String city;
  private String userId;
  private String roomNum;
  private String hall;
  private String defend;
  private String kitchen;
  private String inLayers;
  private String totalCeng;
  private long orientationId;
  private String houseMeters;
  private long fitmentId;
  private java.sql.Timestamp houserRentDate;
  private double rentalPrices;
  private double houseFloorPrice;
  private String housePaymentMethod;
  private long featureId;
  private String houseProperty;
  private long homeState;
  private long jointRent;
  private long natureId;

  @TableField(exist = false)
  private FgFeature fgFeature;
  @TableField(exist = false)
  private FgFitment fgFitment;
  @TableField(exist = false)
  private FgNature fgNature;
  @TableField(exist = false)
  private FgOrientation fgOrientation;
  @TableField(exist = false)
  private List<FyRoom> fyRooms;


}
