package com.wupai.taiji.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "fg_fitment")
public class FgFitment {

  //主键
  @TableId(type = IdType.AUTO)
  private Integer fitmentId;
  private String fitmentName;
  private long fitmentNum;
  private String fitmentRemark;


}
