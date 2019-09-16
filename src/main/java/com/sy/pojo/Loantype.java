package com.sy.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

public class Loantype implements Serializable {
    private Integer loantypeid;

    private String loadtypename;

    private BigDecimal rate;

    private Integer loantime;

    private BigDecimal mininvestment;

    private BigDecimal maxinvestment;

    private Integer status;

    private static final long serialVersionUID = 1L;

    public Integer getLoantypeid() {
        return loantypeid;
    }

    public void setLoantypeid(Integer loantypeid) {
        this.loantypeid = loantypeid;
    }

    public String getLoadtypename() {
        return loadtypename;
    }

    public void setLoadtypename(String loadtypename) {
        this.loadtypename = loadtypename == null ? null : loadtypename.trim();
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public Integer getLoantime() {
        return loantime;
    }

    public void setLoantime(Integer loantime) {
        this.loantime = loantime;
    }

    public BigDecimal getMininvestment() {
        return mininvestment;
    }

    public void setMininvestment(BigDecimal mininvestment) {
        this.mininvestment = mininvestment;
    }

    public BigDecimal getMaxinvestment() {
        return maxinvestment;
    }

    public void setMaxinvestment(BigDecimal maxinvestment) {
        this.maxinvestment = maxinvestment;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}