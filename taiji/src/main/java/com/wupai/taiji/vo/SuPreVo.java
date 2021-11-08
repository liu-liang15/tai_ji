package com.wupai.taiji.vo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author 杨思
 * @date 2021年 11月08日1:03
 */
public class SuPreVo {
    private Integer suid;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Date sutime;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Date suntime;
    private Integer accountId;
    private Integer empid;
    private Integer stid;
    private Integer scid;
    private BigDecimal smoney;

    public SuPreVo() {
    }

    public SuPreVo(Integer suid, Date sutime, Date suntime, Integer accountId, Integer empid, Integer stid, Integer scid, BigDecimal smoney) {
        this.suid = suid;
        this.sutime = sutime;
        this.suntime = suntime;
        this.accountId = accountId;
        this.empid = empid;
        this.stid = stid;
        this.scid = scid;
        this.smoney = smoney;
    }

    public Integer getSuid() {
        return suid;
    }

    public void setSuid(Integer suid) {
        this.suid = suid;
    }

    public Date getSutime() {
        return sutime;
    }

    public void setSutime(Date sutime) {
        this.sutime = sutime;
    }

    public Date getSuntime() {
        return suntime;
    }

    public void setSuntime(Date suntime) {
        this.suntime = suntime;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public Integer getEmpid() {
        return empid;
    }

    public void setEmpid(Integer empid) {
        this.empid = empid;
    }

    public Integer getStid() {
        return stid;
    }

    public void setStid(Integer stid) {
        this.stid = stid;
    }

    public Integer getScid() {
        return scid;
    }

    public void setScid(Integer scid) {
        this.scid = scid;
    }

    public BigDecimal getSmoney() {
        return smoney;
    }

    public void setSmoney(BigDecimal smoney) {
        this.smoney = smoney;
    }
}
