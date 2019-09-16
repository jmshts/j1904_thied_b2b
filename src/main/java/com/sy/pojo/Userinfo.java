package com.sy.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Userinfo implements Serializable {
    private Integer id;

    private Integer uid;

    private Integer phonenumber;

    private String email;

    private String gender;

    private Date birthday;

    private String nativeplace;

    private String maritalstatus;

    private String idnumber;

    private String realname;

    private BigDecimal monthlyincome;

    private String housing;

    private String car;

    private BigDecimal totalaccount;

    private BigDecimal availableamount;

    private BigDecimal freezingamount;

    private String paymentpassword;

    private BigDecimal paidamount;

    private BigDecimal collectedamount;

    private Integer auditstatus;

    private Date audittime;

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

    public Integer getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(Integer phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getNativeplace() {
        return nativeplace;
    }

    public void setNativeplace(String nativeplace) {
        this.nativeplace = nativeplace == null ? null : nativeplace.trim();
    }

    public String getMaritalstatus() {
        return maritalstatus;
    }

    public void setMaritalstatus(String maritalstatus) {
        this.maritalstatus = maritalstatus == null ? null : maritalstatus.trim();
    }

    public String getIdnumber() {
        return idnumber;
    }

    public void setIdnumber(String idnumber) {
        this.idnumber = idnumber == null ? null : idnumber.trim();
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    public BigDecimal getMonthlyincome() {
        return monthlyincome;
    }

    public void setMonthlyincome(BigDecimal monthlyincome) {
        this.monthlyincome = monthlyincome;
    }

    public String getHousing() {
        return housing;
    }

    public void setHousing(String housing) {
        this.housing = housing == null ? null : housing.trim();
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car == null ? null : car.trim();
    }

    public BigDecimal getTotalaccount() {
        return totalaccount;
    }

    public void setTotalaccount(BigDecimal totalaccount) {
        this.totalaccount = totalaccount;
    }

    public BigDecimal getAvailableamount() {
        return availableamount;
    }

    public void setAvailableamount(BigDecimal availableamount) {
        this.availableamount = availableamount;
    }

    public BigDecimal getFreezingamount() {
        return freezingamount;
    }

    public void setFreezingamount(BigDecimal freezingamount) {
        this.freezingamount = freezingamount;
    }

    public String getPaymentpassword() {
        return paymentpassword;
    }

    public void setPaymentpassword(String paymentpassword) {
        this.paymentpassword = paymentpassword == null ? null : paymentpassword.trim();
    }

    public BigDecimal getPaidamount() {
        return paidamount;
    }

    public void setPaidamount(BigDecimal paidamount) {
        this.paidamount = paidamount;
    }

    public BigDecimal getCollectedamount() {
        return collectedamount;
    }

    public void setCollectedamount(BigDecimal collectedamount) {
        this.collectedamount = collectedamount;
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
}