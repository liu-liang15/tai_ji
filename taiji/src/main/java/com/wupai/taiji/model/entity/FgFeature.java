package com.wupai.taiji.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "fg_feature")
public class FgFeature {
  //主键
  @TableId(type = IdType.AUTO)
  private Integer featureId;
  private String featureName;
  private long featureNum;
  private String featureRemark;

}
