package com.wupai.taiji.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 入住人表 
 * @TableName ll_ru_zhur
 */
@TableName(value ="ll_ru_zhur")
@Data
public class LlRuZhur implements Serializable {
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

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}