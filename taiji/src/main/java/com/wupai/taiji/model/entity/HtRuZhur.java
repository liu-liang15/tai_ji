package com.wupai.taiji.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 入住人表 
 * @TableName ht_ru_zhur
 */
@TableName(value ="ht_ru_zhur")
@Data
@Accessors(chain = true)
public class HtRuZhur implements Serializable {
    /**
     * 入住Id
     */
    @TableId(type = IdType.AUTO)
    private Integer rzId;

    /**
     * 姓名
     */
    private String name;

    /**
     * 手机号码
     */
    private String phone;

    /**
     * 身份证号
     */
    private String sfz;

    /**
     * 跟谁进来的
     */
   private String fjId;
}