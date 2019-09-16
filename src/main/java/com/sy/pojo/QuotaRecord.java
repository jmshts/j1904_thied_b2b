package com.sy.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class QuotaRecord implements Serializable {
    private Integer id;

    private Integer uid;

    private String oprater;

    private BigDecimal quota;

    private Date time;

    private String remarks;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getOprater() {
        return oprater;
    }

    public void setOprater(String oprater) {
        this.oprater = oprater == null ? null : oprater.trim();
    }

    public BigDecimal getQuota() {
        return quota;
    }

    public void setQuota(BigDecimal quota) {
        this.quota = quota;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }
}