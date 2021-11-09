package com.wupai.taiji.vo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.sql.Timestamp;

/**
 * @author 杨思
 * @date 2021年 11月08日3:07
 *  预约vo
  */
public class PreVo {
    private Integer pid;
    private Integer pcid;//租房类型
    private Integer phid;//房源地址
    private Integer pstatid;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Timestamp ptime;//约看时间
    private Integer pageNo;
    private Integer pageSize;
    private String pname;//姓名

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public PreVo() {
    }

    public PreVo(Integer pid, Integer pcid, Integer phid, Integer pstatid, Timestamp ptime, Integer pageNo, Integer pageSize, String pname) {
        this.pid = pid;
        this.pcid = pcid;
        this.phid = phid;
        this.pstatid = pstatid;
        this.ptime = ptime;
        this.pageNo = pageNo;
        this.pageSize = pageSize;
        this.pname = pname;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getPcid() {
        return pcid;
    }

    public void setPcid(Integer pcid) {
        this.pcid = pcid;
    }

    public Integer getPhid() {
        return phid;
    }

    public void setPhid(Integer phid) {
        this.phid = phid;
    }

    public Integer getPstatid() {
        return pstatid;
    }

    public void setPstatid(Integer pstatid) {
        this.pstatid = pstatid;
    }

    public Timestamp getPtime() {
        return ptime;
    }

    public void setPtime(Timestamp ptime) {
        this.ptime = ptime;
    }
}
