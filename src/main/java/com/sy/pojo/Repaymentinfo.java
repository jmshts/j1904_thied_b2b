package com.sy.pojo;

import java.io.Serializable;

public class Repaymentinfo implements Serializable {
    private Integer repaymentinfoid;

    private Integer rmid;

    private Integer lid;

    private Long repayment;

    private Long hasrepayment;

    private static final long serialVersionUID = 1L;

    public Integer getRepaymentinfoid() {
        return repaymentinfoid;
    }

    public void setRepaymentinfoid(Integer repaymentinfoid) {
        this.repaymentinfoid = repaymentinfoid;
    }

    public Integer getRmid() {
        return rmid;
    }

    public void setRmid(Integer rmid) {
        this.rmid = rmid;
    }

    public Integer getLid() {
        return lid;
    }

    public void setLid(Integer lid) {
        this.lid = lid;
    }

    public Long getRepayment() {
        return repayment;
    }

    public void setRepayment(Long repayment) {
        this.repayment = repayment;
    }

    public Long getHasrepayment() {
        return hasrepayment;
    }

    public void setHasrepayment(Long hasrepayment) {
        this.hasrepayment = hasrepayment;
    }
}