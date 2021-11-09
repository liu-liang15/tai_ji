package com.wupai.taiji.vo;

/**
 * @author 杨思
 * @date 2021年 11月07日11:08
 */
public class TypezVo {
    /**
     * 类别编号
     */
    private Integer tid;

    /**
     * 类别名字
     */
    private String tname;

    /**
     * 父级编号
     */
    private String tcid;


    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public String getTcid() {
        return tcid;
    }

    public void setTcid(String tcid) {
        this.tcid = tcid;
    }

    public TypezVo() {
    }

    public TypezVo(Integer tid, String tname, String tcid) {
        this.tid = tid;
        this.tname = tname;
        this.tcid = tcid;
    }
}
