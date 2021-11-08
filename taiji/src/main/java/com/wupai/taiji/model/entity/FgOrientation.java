package com.wupai.taiji.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "fg_orientation")
public class FgOrientation {

  //主键
  @TableId(type = IdType.AUTO)
  private Integer orientationId;
  private String orientationName;
  private long orientationNum;
  private String orientationRemark;


}
