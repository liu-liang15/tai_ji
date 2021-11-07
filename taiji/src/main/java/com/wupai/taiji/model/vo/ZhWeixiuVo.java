package com.wupai.taiji.model.vo;

import java.util.Date;

/**
 * @author wenlijun
 * @date 2021年 11月07日9:05
 */
public class ZhWeixiuVo {
    private Integer wxId;

    /**
     * 预约上门时间
     */
    private Date wxTime;

    /**
     * 联系电话
     */
    private String wxPhone;

    /**
     * 申请原因
     */
    private String wxReason;

    /**
     * 房屋地址外键编号
     */
    private Integer fwId;

    /**
     * 维修单状态外键
     */
    private Integer ztId;

    /**
     * 维修紧急状态外键id
     */
    private Integer jjId;

    /**
     * 维修类型外键
     */
    private Integer lxId;

    /**
     *
     */
    private Integer pxLx;

    /**
     * 租客姓名
     */
    private String wxName;

    /**
     * 申请来源
     */
    private String wxLaiyuan;

    /**
     *维修状态
     */
    private String zttName;

    /**
     * 维修类型名称
     */
    private String lxName;
    /**
     * 城市
     */
    private String city;

    /**
     * 小区名称
     */
    private String plotName;

    /**
     * 区域
     */
    private String area;

    /**
     * 房屋编号（唯一）
     */
    private String houseNumber;

    /**
     * 楼号
     */
    private String buildingNo;

    /**
     * 单元
     */
    private String unit;

    /**
     * 室
     */
    private String house;

}