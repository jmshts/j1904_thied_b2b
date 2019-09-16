package com.sy.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

public class Quota implements Serializable {
    private Integer id;

    private Integer uid;

    private BigDecimal quota;

    private BigDecimal freezingquota;

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

    public BigDecimal getQuota() {
        return quota;
    }

    public void setQuota(BigDecimal quota) {
        this.quota = quota;
    }

    public BigDecimal getFreezingquota() {
        return freezingquota;
    }

    public void setFreezingquota(BigDecimal freezingquota) {
        this.freezingquota = freezingquota;
    }
}