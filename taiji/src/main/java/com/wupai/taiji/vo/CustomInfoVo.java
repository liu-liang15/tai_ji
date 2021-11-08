package com.wupai.taiji.vo;

/**
 *
 * @author 杨思
 * @date 2021年 11月07日8:40
 */
public class CustomInfoVo {
    /**
     * 客户名字
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

    /**
     * 来源类型编号
     */
    private Integer cTypeid;
    private Integer pageNo;
    private Integer pageSize;

    public CustomInfoVo() {
    }

    public CustomInfoVo(String cname, String ctel, String cardnum, Integer csex, Integer cTypeid, Integer pageNo, Integer pageSize) {
        this.cname = cname;
        this.ctel = ctel;
        this.cardnum = cardnum;
        this.csex = csex;
        this.cTypeid = cTypeid;
        this.pageNo = pageNo;
        this.pageSize = pageSize;
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

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCtel() {
        return ctel;
    }

    public void setCtel(String ctel) {
        this.ctel = ctel;
    }

    public String getCardnum() {
        return cardnum;
    }

    public void setCardnum(String cardnum) {
        this.cardnum = cardnum;
    }

    public Integer getCsex() {
        return csex;
    }

    public void setCsex(Integer csex) {
        this.csex = csex;
    }

    public Integer getcTypeid() {
        return cTypeid;
    }

    public void setcTypeid(Integer cTypeid) {
        this.cTypeid = cTypeid;
    }
}
