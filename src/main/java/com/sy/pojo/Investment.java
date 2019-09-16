package com.sy.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Investment implements Serializable {
    private Integer investmentid;

    private Integer lid;

    private Integer uid;

    private BigDecimal investmentamount;

    private Date investmenttime;

    private Boolean ifmakeover;

    private String remarks;

    private static final long serialVersionUID = 1L;

    public Integer getInvestmentid() {
        return investmentid;
    }

    public void setInvestmentid(Integer investmentid) {
        this.investmentid = investmentid;
    }

    public Integer getLid() {
        return lid;
    }

    public void setLid(Integer lid) {
        this.lid = lid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public BigDecimal getInvestmentamount() {
        return investmentamount;
    }

    public void setInvestmentamount(BigDecimal investmentamount) {
        this.investmentamount = investmentamount;
    }

    public Date getInvestmenttime() {
        return investmenttime;
    }

    public void setInvestmenttime(Date investmenttime) {
        this.investmenttime = investmenttime;
    }

    public Boolean getIfmakeover() {
        return ifmakeover;
    }

    public void setIfmakeover(Boolean ifmakeover) {
        this.ifmakeover = ifmakeover;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }
}