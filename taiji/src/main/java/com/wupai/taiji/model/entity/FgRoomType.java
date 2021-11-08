package com.wupai.taiji.model.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "fg_room_type")
public class FgRoomType {

  //主键
  @TableId(type = IdType.AUTO)
  private Integer typeId;
  private String typeName;
  private long typeNum;
  private String typeRemark;


}
