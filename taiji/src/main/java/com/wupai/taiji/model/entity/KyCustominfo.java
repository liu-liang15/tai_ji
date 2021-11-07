package com.wupai.taiji.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.List;

import lombok.Data;

/**
 * 客户信息表 
 * @TableName ky_custominfo
 */
@TableName(value ="ky_custominfo")
@Data
public class KyCustominfo implements Serializable {
    /**
     * 客户信息客户需求一对多
     */
    private List<KyUneed> kyUneeds;
    /**
     * 客户信息客户预约
     */
    private  List<KyPre> kyPres;
    /**
     * 客户信息客户预定
     */
    private  List<KySurepre> kySurepres;

    /**
     * 客户信息客户来源
     */
    private KyTypez cTypeid;

    public KyCustominfo() {
    }

    /**
     * 编号
     */
    @TableId(type = IdType.AUTO)
    private Integer cid;

    /**
     * 姓名
     */
    private String cname;

    /**
     * 手机号码
     */
    private String ctel;

    /**
     * 身份证号码
     */
    private String cardnum;

    /**
     * 性别（0女1男）
     */
    private Integer csex;




}