package com.wupai.taiji.vo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.sql.Timestamp;

/**
 * @author 杨思
 * @date 2021年 11月07日18:06
 */
public class UneedVo {

    private Integer ucid;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Timestamp uinitime;
    private Integer  utenancytid;
    private String  uaddress;

    public UneedVo() {
    }

    public UneedVo(Integer ucid, Timestamp uinitime, Integer utenancytid, String uaddress) {
        this.ucid = ucid;
        this.uinitime = uinitime;
        this.utenancytid = utenancytid;
        this.uaddress = uaddress;
    }

    public Integer getUcid() {
        return ucid;
    }

    public void setUcid(Integer ucid) {
        this.ucid = ucid;
    }

    public Timestamp getUinitime() {
        return uinitime;
    }

    public void setUinitime(Timestamp uinitime) {
        this.uinitime = uinitime;
    }

    public Integer getUtenancytid() {
        return utenancytid;
    }

    public void setUtenancytid(Integer utenancytid) {
        this.utenancytid = utenancytid;
    }

    public String getUaddress() {
        return uaddress;
    }

    public void setUaddress(String uaddress) {
        this.uaddress = uaddress;
    }
}
