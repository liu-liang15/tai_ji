package com.wupai.taiji.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "fg_nature")
public class FgNature {

  //主键
  @TableId(type = IdType.AUTO)
  private Integer natureId;
  private String natureName;
  private long natureNum;
  private String natureRemark;


}
