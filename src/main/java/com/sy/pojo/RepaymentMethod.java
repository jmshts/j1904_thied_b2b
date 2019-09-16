package com.sy.pojo;

import java.io.Serializable;

public class RepaymentMethod implements Serializable {
    private Integer repaymentid;

    private String repaymentname;

    private String algorithm;

    private Integer status;

    private static final long serialVersionUID = 1L;

    public Integer getRepaymentid() {
        return repaymentid;
    }

    public void setRepaymentid(Integer repaymentid) {
        this.repaymentid = repaymentid;
    }

    public String getRepaymentname() {
        return repaymentname;
    }

    public void setRepaymentname(String repaymentname) {
        this.repaymentname = repaymentname == null ? null : repaymentname.trim();
    }

    public String getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm == null ? null : algorithm.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}