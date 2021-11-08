package com.wupai.taiji.model.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Timestamp;

@Data
@TableName(value = "fg_room")
public class FyRoom {

  //主键
  @TableId(type = IdType.AUTO)
  private Integer roomId;
  private String roomName;
  private long orientationId;
  private long typeId;
  private String roomSquareMeters;
  private double roomPrices;
  private double roomFloorPrice;
  private String roomPaymentMethod;
  @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
  private Timestamp rentTime;
  @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
  private Timestamp contractTime;
  private long featureId;




}
