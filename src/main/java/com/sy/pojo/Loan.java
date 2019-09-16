package com.sy.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Loan implements Serializable {
    private Integer loanid;

    private Integer uid;

    private Integer ltid;

    private Integer rmid;

    private String loanname;

    private String loaninfo;

    private BigDecimal loanamount;

    private Integer loantime;

    private Integer deadline;

    private BigDecimal mininvestment;

    private BigDecimal maxinvestment;

    private Integer loadnumber;

    private BigDecimal rate;

    private Date creattime;

    private Integer firstinstance;

    private Integer finalinstance;

    private static final long serialVersionUID = 1L;

    public Integer getLoanid() {
        return loanid;
    }

    public void setLoanid(Integer loanid) {
        this.loanid = loanid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getLtid() {
        return ltid;
    }

    public void setLtid(Integer ltid) {
        this.ltid = ltid;
    }

    public Integer getRmid() {
        return rmid;
    }

    public void setRmid(Integer rmid) {
        this.rmid = rmid;
    }

    public String getLoanname() {
        return loanname;
    }

    public void setLoanname(String loanname) {
        this.loanname = loanname == null ? null : loanname.trim();
    }

    public String getLoaninfo() {
        return loaninfo;
    }

    public void setLoaninfo(String loaninfo) {
        this.loaninfo = loaninfo == null ? null : loaninfo.trim();
    }

    public BigDecimal getLoanamount() {
        return loanamount;
    }

    public void setLoanamount(BigDecimal loanamount) {
        this.loanamount = loanamount;
    }

    public Integer getLoantime() {
        return loantime;
    }

    public void setLoantime(Integer loantime) {
        this.loantime = loantime;
    }

    public Integer getDeadline() {
        return deadline;
    }

    public void setDeadline(Integer deadline) {
        this.deadline = deadline;
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

    public Integer getLoadnumber() {
        return loadnumber;
    }

    public void setLoadnumber(Integer loadnumber) {
        this.loadnumber = loadnumber;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public Date getCreattime() {
        return creattime;
    }

    public void setCreattime(Date creattime) {
        this.creattime = creattime;
    }

    public Integer getFirstinstance() {
        return firstinstance;
    }

    public void setFirstinstance(Integer firstinstance) {
        this.firstinstance = firstinstance;
    }

    public Integer getFinalinstance() {
        return finalinstance;
    }

    public void setFinalinstance(Integer finalinstance) {
        this.finalinstance = finalinstance;
    }
}