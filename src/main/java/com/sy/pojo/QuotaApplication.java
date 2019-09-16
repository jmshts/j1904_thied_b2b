package com.sy.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class QuotaApplication implements Serializable {
    private Integer id;

    private Integer uid;

    private BigDecimal requestquota;

    private Date createtime;

    private Integer auditstatus;

    private Date audittime;

    private BigDecimal passquota;

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

    public BigDecimal getRequestquota() {
        return requestquota;
    }

    public void setRequestquota(BigDecimal requestquota) {
        this.requestquota = requestquota;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getAuditstatus() {
        return auditstatus;
    }

    public void setAuditstatus(Integer auditstatus) {
        this.auditstatus = auditstatus;
    }

    public Date getAudittime() {
        return audittime;
    }

    public void setAudittime(Date audittime) {
        this.audittime = audittime;
    }

    public BigDecimal getPassquota() {
        return passquota;
    }

    public void setPassquota(BigDecimal passquota) {
        this.passquota = passquota;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }
}