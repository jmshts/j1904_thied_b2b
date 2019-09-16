package com.sy.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class UserinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserinfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Integer value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Integer value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Integer value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Integer value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Integer value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Integer> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Integer> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Integer value1, Integer value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Integer value1, Integer value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andPhonenumberIsNull() {
            addCriterion("phoneNumber is null");
            return (Criteria) this;
        }

        public Criteria andPhonenumberIsNotNull() {
            addCriterion("phoneNumber is not null");
            return (Criteria) this;
        }

        public Criteria andPhonenumberEqualTo(Integer value) {
            addCriterion("phoneNumber =", value, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberNotEqualTo(Integer value) {
            addCriterion("phoneNumber <>", value, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberGreaterThan(Integer value) {
            addCriterion("phoneNumber >", value, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("phoneNumber >=", value, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberLessThan(Integer value) {
            addCriterion("phoneNumber <", value, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberLessThanOrEqualTo(Integer value) {
            addCriterion("phoneNumber <=", value, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberIn(List<Integer> values) {
            addCriterion("phoneNumber in", values, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberNotIn(List<Integer> values) {
            addCriterion("phoneNumber not in", values, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberBetween(Integer value1, Integer value2) {
            addCriterion("phoneNumber between", value1, value2, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberNotBetween(Integer value1, Integer value2) {
            addCriterion("phoneNumber not between", value1, value2, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(String value) {
            addCriterion("gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(String value) {
            addCriterion("gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(String value) {
            addCriterion("gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(String value) {
            addCriterion("gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(String value) {
            addCriterion("gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(String value) {
            addCriterion("gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLike(String value) {
            addCriterion("gender like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotLike(String value) {
            addCriterion("gender not like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<String> values) {
            addCriterion("gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<String> values) {
            addCriterion("gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(String value1, String value2) {
            addCriterion("gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(String value1, String value2) {
            addCriterion("gender not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andNativeplaceIsNull() {
            addCriterion("nativePlace is null");
            return (Criteria) this;
        }

        public Criteria andNativeplaceIsNotNull() {
            addCriterion("nativePlace is not null");
            return (Criteria) this;
        }

        public Criteria andNativeplaceEqualTo(String value) {
            addCriterion("nativePlace =", value, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceNotEqualTo(String value) {
            addCriterion("nativePlace <>", value, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceGreaterThan(String value) {
            addCriterion("nativePlace >", value, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceGreaterThanOrEqualTo(String value) {
            addCriterion("nativePlace >=", value, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceLessThan(String value) {
            addCriterion("nativePlace <", value, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceLessThanOrEqualTo(String value) {
            addCriterion("nativePlace <=", value, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceLike(String value) {
            addCriterion("nativePlace like", value, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceNotLike(String value) {
            addCriterion("nativePlace not like", value, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceIn(List<String> values) {
            addCriterion("nativePlace in", values, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceNotIn(List<String> values) {
            addCriterion("nativePlace not in", values, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceBetween(String value1, String value2) {
            addCriterion("nativePlace between", value1, value2, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceNotBetween(String value1, String value2) {
            addCriterion("nativePlace not between", value1, value2, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusIsNull() {
            addCriterion("maritalStatus is null");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusIsNotNull() {
            addCriterion("maritalStatus is not null");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusEqualTo(String value) {
            addCriterion("maritalStatus =", value, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusNotEqualTo(String value) {
            addCriterion("maritalStatus <>", value, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusGreaterThan(String value) {
            addCriterion("maritalStatus >", value, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusGreaterThanOrEqualTo(String value) {
            addCriterion("maritalStatus >=", value, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusLessThan(String value) {
            addCriterion("maritalStatus <", value, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusLessThanOrEqualTo(String value) {
            addCriterion("maritalStatus <=", value, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusLike(String value) {
            addCriterion("maritalStatus like", value, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusNotLike(String value) {
            addCriterion("maritalStatus not like", value, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusIn(List<String> values) {
            addCriterion("maritalStatus in", values, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusNotIn(List<String> values) {
            addCriterion("maritalStatus not in", values, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusBetween(String value1, String value2) {
            addCriterion("maritalStatus between", value1, value2, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusNotBetween(String value1, String value2) {
            addCriterion("maritalStatus not between", value1, value2, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andIdnumberIsNull() {
            addCriterion("idNumber is null");
            return (Criteria) this;
        }

        public Criteria andIdnumberIsNotNull() {
            addCriterion("idNumber is not null");
            return (Criteria) this;
        }

        public Criteria andIdnumberEqualTo(String value) {
            addCriterion("idNumber =", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberNotEqualTo(String value) {
            addCriterion("idNumber <>", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberGreaterThan(String value) {
            addCriterion("idNumber >", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberGreaterThanOrEqualTo(String value) {
            addCriterion("idNumber >=", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberLessThan(String value) {
            addCriterion("idNumber <", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberLessThanOrEqualTo(String value) {
            addCriterion("idNumber <=", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberLike(String value) {
            addCriterion("idNumber like", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberNotLike(String value) {
            addCriterion("idNumber not like", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberIn(List<String> values) {
            addCriterion("idNumber in", values, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberNotIn(List<String> values) {
            addCriterion("idNumber not in", values, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberBetween(String value1, String value2) {
            addCriterion("idNumber between", value1, value2, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberNotBetween(String value1, String value2) {
            addCriterion("idNumber not between", value1, value2, "idnumber");
            return (Criteria) this;
        }

        public Criteria andRealnameIsNull() {
            addCriterion("realName is null");
            return (Criteria) this;
        }

        public Criteria andRealnameIsNotNull() {
            addCriterion("realName is not null");
            return (Criteria) this;
        }

        public Criteria andRealnameEqualTo(String value) {
            addCriterion("realName =", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotEqualTo(String value) {
            addCriterion("realName <>", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameGreaterThan(String value) {
            addCriterion("realName >", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameGreaterThanOrEqualTo(String value) {
            addCriterion("realName >=", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLessThan(String value) {
            addCriterion("realName <", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLessThanOrEqualTo(String value) {
            addCriterion("realName <=", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLike(String value) {
            addCriterion("realName like", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotLike(String value) {
            addCriterion("realName not like", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameIn(List<String> values) {
            addCriterion("realName in", values, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotIn(List<String> values) {
            addCriterion("realName not in", values, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameBetween(String value1, String value2) {
            addCriterion("realName between", value1, value2, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotBetween(String value1, String value2) {
            addCriterion("realName not between", value1, value2, "realname");
            return (Criteria) this;
        }

        public Criteria andMonthlyincomeIsNull() {
            addCriterion("monthlyIncome is null");
            return (Criteria) this;
        }

        public Criteria andMonthlyincomeIsNotNull() {
            addCriterion("monthlyIncome is not null");
            return (Criteria) this;
        }

        public Criteria andMonthlyincomeEqualTo(BigDecimal value) {
            addCriterion("monthlyIncome =", value, "monthlyincome");
            return (Criteria) this;
        }

        public Criteria andMonthlyincomeNotEqualTo(BigDecimal value) {
            addCriterion("monthlyIncome <>", value, "monthlyincome");
            return (Criteria) this;
        }

        public Criteria andMonthlyincomeGreaterThan(BigDecimal value) {
            addCriterion("monthlyIncome >", value, "monthlyincome");
            return (Criteria) this;
        }

        public Criteria andMonthlyincomeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("monthlyIncome >=", value, "monthlyincome");
            return (Criteria) this;
        }

        public Criteria andMonthlyincomeLessThan(BigDecimal value) {
            addCriterion("monthlyIncome <", value, "monthlyincome");
            return (Criteria) this;
        }

        public Criteria andMonthlyincomeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("monthlyIncome <=", value, "monthlyincome");
            return (Criteria) this;
        }

        public Criteria andMonthlyincomeIn(List<BigDecimal> values) {
            addCriterion("monthlyIncome in", values, "monthlyincome");
            return (Criteria) this;
        }

        public Criteria andMonthlyincomeNotIn(List<BigDecimal> values) {
            addCriterion("monthlyIncome not in", values, "monthlyincome");
            return (Criteria) this;
        }

        public Criteria andMonthlyincomeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("monthlyIncome between", value1, value2, "monthlyincome");
            return (Criteria) this;
        }

        public Criteria andMonthlyincomeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("monthlyIncome not between", value1, value2, "monthlyincome");
            return (Criteria) this;
        }

        public Criteria andHousingIsNull() {
            addCriterion("housing is null");
            return (Criteria) this;
        }

        public Criteria andHousingIsNotNull() {
            addCriterion("housing is not null");
            return (Criteria) this;
        }

        public Criteria andHousingEqualTo(String value) {
            addCriterion("housing =", value, "housing");
            return (Criteria) this;
        }

        public Criteria andHousingNotEqualTo(String value) {
            addCriterion("housing <>", value, "housing");
            return (Criteria) this;
        }

        public Criteria andHousingGreaterThan(String value) {
            addCriterion("housing >", value, "housing");
            return (Criteria) this;
        }

        public Criteria andHousingGreaterThanOrEqualTo(String value) {
            addCriterion("housing >=", value, "housing");
            return (Criteria) this;
        }

        public Criteria andHousingLessThan(String value) {
            addCriterion("housing <", value, "housing");
            return (Criteria) this;
        }

        public Criteria andHousingLessThanOrEqualTo(String value) {
            addCriterion("housing <=", value, "housing");
            return (Criteria) this;
        }

        public Criteria andHousingLike(String value) {
            addCriterion("housing like", value, "housing");
            return (Criteria) this;
        }

        public Criteria andHousingNotLike(String value) {
            addCriterion("housing not like", value, "housing");
            return (Criteria) this;
        }

        public Criteria andHousingIn(List<String> values) {
            addCriterion("housing in", values, "housing");
            return (Criteria) this;
        }

        public Criteria andHousingNotIn(List<String> values) {
            addCriterion("housing not in", values, "housing");
            return (Criteria) this;
        }

        public Criteria andHousingBetween(String value1, String value2) {
            addCriterion("housing between", value1, value2, "housing");
            return (Criteria) this;
        }

        public Criteria andHousingNotBetween(String value1, String value2) {
            addCriterion("housing not between", value1, value2, "housing");
            return (Criteria) this;
        }

        public Criteria andCarIsNull() {
            addCriterion("car is null");
            return (Criteria) this;
        }

        public Criteria andCarIsNotNull() {
            addCriterion("car is not null");
            return (Criteria) this;
        }

        public Criteria andCarEqualTo(String value) {
            addCriterion("car =", value, "car");
            return (Criteria) this;
        }

        public Criteria andCarNotEqualTo(String value) {
            addCriterion("car <>", value, "car");
            return (Criteria) this;
        }

        public Criteria andCarGreaterThan(String value) {
            addCriterion("car >", value, "car");
            return (Criteria) this;
        }

        public Criteria andCarGreaterThanOrEqualTo(String value) {
            addCriterion("car >=", value, "car");
            return (Criteria) this;
        }

        public Criteria andCarLessThan(String value) {
            addCriterion("car <", value, "car");
            return (Criteria) this;
        }

        public Criteria andCarLessThanOrEqualTo(String value) {
            addCriterion("car <=", value, "car");
            return (Criteria) this;
        }

        public Criteria andCarLike(String value) {
            addCriterion("car like", value, "car");
            return (Criteria) this;
        }

        public Criteria andCarNotLike(String value) {
            addCriterion("car not like", value, "car");
            return (Criteria) this;
        }

        public Criteria andCarIn(List<String> values) {
            addCriterion("car in", values, "car");
            return (Criteria) this;
        }

        public Criteria andCarNotIn(List<String> values) {
            addCriterion("car not in", values, "car");
            return (Criteria) this;
        }

        public Criteria andCarBetween(String value1, String value2) {
            addCriterion("car between", value1, value2, "car");
            return (Criteria) this;
        }

        public Criteria andCarNotBetween(String value1, String value2) {
            addCriterion("car not between", value1, value2, "car");
            return (Criteria) this;
        }

        public Criteria andTotalaccountIsNull() {
            addCriterion("totalAccount is null");
            return (Criteria) this;
        }

        public Criteria andTotalaccountIsNotNull() {
            addCriterion("totalAccount is not null");
            return (Criteria) this;
        }

        public Criteria andTotalaccountEqualTo(BigDecimal value) {
            addCriterion("totalAccount =", value, "totalaccount");
            return (Criteria) this;
        }

        public Criteria andTotalaccountNotEqualTo(BigDecimal value) {
            addCriterion("totalAccount <>", value, "totalaccount");
            return (Criteria) this;
        }

        public Criteria andTotalaccountGreaterThan(BigDecimal value) {
            addCriterion("totalAccount >", value, "totalaccount");
            return (Criteria) this;
        }

        public Criteria andTotalaccountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("totalAccount >=", value, "totalaccount");
            return (Criteria) this;
        }

        public Criteria andTotalaccountLessThan(BigDecimal value) {
            addCriterion("totalAccount <", value, "totalaccount");
            return (Criteria) this;
        }

        public Criteria andTotalaccountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("totalAccount <=", value, "totalaccount");
            return (Criteria) this;
        }

        public Criteria andTotalaccountIn(List<BigDecimal> values) {
            addCriterion("totalAccount in", values, "totalaccount");
            return (Criteria) this;
        }

        public Criteria andTotalaccountNotIn(List<BigDecimal> values) {
            addCriterion("totalAccount not in", values, "totalaccount");
            return (Criteria) this;
        }

        public Criteria andTotalaccountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("totalAccount between", value1, value2, "totalaccount");
            return (Criteria) this;
        }

        public Criteria andTotalaccountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("totalAccount not between", value1, value2, "totalaccount");
            return (Criteria) this;
        }

        public Criteria andAvailableamountIsNull() {
            addCriterion("availableAmount is null");
            return (Criteria) this;
        }

        public Criteria andAvailableamountIsNotNull() {
            addCriterion("availableAmount is not null");
            return (Criteria) this;
        }

        public Criteria andAvailableamountEqualTo(BigDecimal value) {
            addCriterion("availableAmount =", value, "availableamount");
            return (Criteria) this;
        }

        public Criteria andAvailableamountNotEqualTo(BigDecimal value) {
            addCriterion("availableAmount <>", value, "availableamount");
            return (Criteria) this;
        }

        public Criteria andAvailableamountGreaterThan(BigDecimal value) {
            addCriterion("availableAmount >", value, "availableamount");
            return (Criteria) this;
        }

        public Criteria andAvailableamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("availableAmount >=", value, "availableamount");
            return (Criteria) this;
        }

        public Criteria andAvailableamountLessThan(BigDecimal value) {
            addCriterion("availableAmount <", value, "availableamount");
            return (Criteria) this;
        }

        public Criteria andAvailableamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("availableAmount <=", value, "availableamount");
            return (Criteria) this;
        }

        public Criteria andAvailableamountIn(List<BigDecimal> values) {
            addCriterion("availableAmount in", values, "availableamount");
            return (Criteria) this;
        }

        public Criteria andAvailableamountNotIn(List<BigDecimal> values) {
            addCriterion("availableAmount not in", values, "availableamount");
            return (Criteria) this;
        }

        public Criteria andAvailableamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("availableAmount between", value1, value2, "availableamount");
            return (Criteria) this;
        }

        public Criteria andAvailableamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("availableAmount not between", value1, value2, "availableamount");
            return (Criteria) this;
        }

        public Criteria andFreezingamountIsNull() {
            addCriterion("freezingAmount is null");
            return (Criteria) this;
        }

        public Criteria andFreezingamountIsNotNull() {
            addCriterion("freezingAmount is not null");
            return (Criteria) this;
        }

        public Criteria andFreezingamountEqualTo(BigDecimal value) {
            addCriterion("freezingAmount =", value, "freezingamount");
            return (Criteria) this;
        }

        public Criteria andFreezingamountNotEqualTo(BigDecimal value) {
            addCriterion("freezingAmount <>", value, "freezingamount");
            return (Criteria) this;
        }

        public Criteria andFreezingamountGreaterThan(BigDecimal value) {
            addCriterion("freezingAmount >", value, "freezingamount");
            return (Criteria) this;
        }

        public Criteria andFreezingamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("freezingAmount >=", value, "freezingamount");
            return (Criteria) this;
        }

        public Criteria andFreezingamountLessThan(BigDecimal value) {
            addCriterion("freezingAmount <", value, "freezingamount");
            return (Criteria) this;
        }

        public Criteria andFreezingamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("freezingAmount <=", value, "freezingamount");
            return (Criteria) this;
        }

        public Criteria andFreezingamountIn(List<BigDecimal> values) {
            addCriterion("freezingAmount in", values, "freezingamount");
            return (Criteria) this;
        }

        public Criteria andFreezingamountNotIn(List<BigDecimal> values) {
            addCriterion("freezingAmount not in", values, "freezingamount");
            return (Criteria) this;
        }

        public Criteria andFreezingamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("freezingAmount between", value1, value2, "freezingamount");
            return (Criteria) this;
        }

        public Criteria andFreezingamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("freezingAmount not between", value1, value2, "freezingamount");
            return (Criteria) this;
        }

        public Criteria andPaymentpasswordIsNull() {
            addCriterion("paymentPassword is null");
            return (Criteria) this;
        }

        public Criteria andPaymentpasswordIsNotNull() {
            addCriterion("paymentPassword is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentpasswordEqualTo(String value) {
            addCriterion("paymentPassword =", value, "paymentpassword");
            return (Criteria) this;
        }

        public Criteria andPaymentpasswordNotEqualTo(String value) {
            addCriterion("paymentPassword <>", value, "paymentpassword");
            return (Criteria) this;
        }

        public Criteria andPaymentpasswordGreaterThan(String value) {
            addCriterion("paymentPassword >", value, "paymentpassword");
            return (Criteria) this;
        }

        public Criteria andPaymentpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("paymentPassword >=", value, "paymentpassword");
            return (Criteria) this;
        }

        public Criteria andPaymentpasswordLessThan(String value) {
            addCriterion("paymentPassword <", value, "paymentpassword");
            return (Criteria) this;
        }

        public Criteria andPaymentpasswordLessThanOrEqualTo(String value) {
            addCriterion("paymentPassword <=", value, "paymentpassword");
            return (Criteria) this;
        }

        public Criteria andPaymentpasswordLike(String value) {
            addCriterion("paymentPassword like", value, "paymentpassword");
            return (Criteria) this;
        }

        public Criteria andPaymentpasswordNotLike(String value) {
            addCriterion("paymentPassword not like", value, "paymentpassword");
            return (Criteria) this;
        }

        public Criteria andPaymentpasswordIn(List<String> values) {
            addCriterion("paymentPassword in", values, "paymentpassword");
            return (Criteria) this;
        }

        public Criteria andPaymentpasswordNotIn(List<String> values) {
            addCriterion("paymentPassword not in", values, "paymentpassword");
            return (Criteria) this;
        }

        public Criteria andPaymentpasswordBetween(String value1, String value2) {
            addCriterion("paymentPassword between", value1, value2, "paymentpassword");
            return (Criteria) this;
        }

        public Criteria andPaymentpasswordNotBetween(String value1, String value2) {
            addCriterion("paymentPassword not between", value1, value2, "paymentpassword");
            return (Criteria) this;
        }

        public Criteria andPaidamountIsNull() {
            addCriterion("paidAmount is null");
            return (Criteria) this;
        }

        public Criteria andPaidamountIsNotNull() {
            addCriterion("paidAmount is not null");
            return (Criteria) this;
        }

        public Criteria andPaidamountEqualTo(BigDecimal value) {
            addCriterion("paidAmount =", value, "paidamount");
            return (Criteria) this;
        }

        public Criteria andPaidamountNotEqualTo(BigDecimal value) {
            addCriterion("paidAmount <>", value, "paidamount");
            return (Criteria) this;
        }

        public Criteria andPaidamountGreaterThan(BigDecimal value) {
            addCriterion("paidAmount >", value, "paidamount");
            return (Criteria) this;
        }

        public Criteria andPaidamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("paidAmount >=", value, "paidamount");
            return (Criteria) this;
        }

        public Criteria andPaidamountLessThan(BigDecimal value) {
            addCriterion("paidAmount <", value, "paidamount");
            return (Criteria) this;
        }

        public Criteria andPaidamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("paidAmount <=", value, "paidamount");
            return (Criteria) this;
        }

        public Criteria andPaidamountIn(List<BigDecimal> values) {
            addCriterion("paidAmount in", values, "paidamount");
            return (Criteria) this;
        }

        public Criteria andPaidamountNotIn(List<BigDecimal> values) {
            addCriterion("paidAmount not in", values, "paidamount");
            return (Criteria) this;
        }

        public Criteria andPaidamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("paidAmount between", value1, value2, "paidamount");
            return (Criteria) this;
        }

        public Criteria andPaidamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("paidAmount not between", value1, value2, "paidamount");
            return (Criteria) this;
        }

        public Criteria andCollectedamountIsNull() {
            addCriterion("collectedAmount is null");
            return (Criteria) this;
        }

        public Criteria andCollectedamountIsNotNull() {
            addCriterion("collectedAmount is not null");
            return (Criteria) this;
        }

        public Criteria andCollectedamountEqualTo(BigDecimal value) {
            addCriterion("collectedAmount =", value, "collectedamount");
            return (Criteria) this;
        }

        public Criteria andCollectedamountNotEqualTo(BigDecimal value) {
            addCriterion("collectedAmount <>", value, "collectedamount");
            return (Criteria) this;
        }

        public Criteria andCollectedamountGreaterThan(BigDecimal value) {
            addCriterion("collectedAmount >", value, "collectedamount");
            return (Criteria) this;
        }

        public Criteria andCollectedamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("collectedAmount >=", value, "collectedamount");
            return (Criteria) this;
        }

        public Criteria andCollectedamountLessThan(BigDecimal value) {
            addCriterion("collectedAmount <", value, "collectedamount");
            return (Criteria) this;
        }

        public Criteria andCollectedamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("collectedAmount <=", value, "collectedamount");
            return (Criteria) this;
        }

        public Criteria andCollectedamountIn(List<BigDecimal> values) {
            addCriterion("collectedAmount in", values, "collectedamount");
            return (Criteria) this;
        }

        public Criteria andCollectedamountNotIn(List<BigDecimal> values) {
            addCriterion("collectedAmount not in", values, "collectedamount");
            return (Criteria) this;
        }

        public Criteria andCollectedamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("collectedAmount between", value1, value2, "collectedamount");
            return (Criteria) this;
        }

        public Criteria andCollectedamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("collectedAmount not between", value1, value2, "collectedamount");
            return (Criteria) this;
        }

        public Criteria andAuditstatusIsNull() {
            addCriterion("auditStatus is null");
            return (Criteria) this;
        }

        public Criteria andAuditstatusIsNotNull() {
            addCriterion("auditStatus is not null");
            return (Criteria) this;
        }

        public Criteria andAuditstatusEqualTo(Integer value) {
            addCriterion("auditStatus =", value, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusNotEqualTo(Integer value) {
            addCriterion("auditStatus <>", value, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusGreaterThan(Integer value) {
            addCriterion("auditStatus >", value, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("auditStatus >=", value, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusLessThan(Integer value) {
            addCriterion("auditStatus <", value, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusLessThanOrEqualTo(Integer value) {
            addCriterion("auditStatus <=", value, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusIn(List<Integer> values) {
            addCriterion("auditStatus in", values, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusNotIn(List<Integer> values) {
            addCriterion("auditStatus not in", values, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusBetween(Integer value1, Integer value2) {
            addCriterion("auditStatus between", value1, value2, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("auditStatus not between", value1, value2, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAudittimeIsNull() {
            addCriterion("auditTime is null");
            return (Criteria) this;
        }

        public Criteria andAudittimeIsNotNull() {
            addCriterion("auditTime is not null");
            return (Criteria) this;
        }

        public Criteria andAudittimeEqualTo(Date value) {
            addCriterion("auditTime =", value, "audittime");
            return (Criteria) this;
        }

        public Criteria andAudittimeNotEqualTo(Date value) {
            addCriterion("auditTime <>", value, "audittime");
            return (Criteria) this;
        }

        public Criteria andAudittimeGreaterThan(Date value) {
            addCriterion("auditTime >", value, "audittime");
            return (Criteria) this;
        }

        public Criteria andAudittimeGreaterThanOrEqualTo(Date value) {
            addCriterion("auditTime >=", value, "audittime");
            return (Criteria) this;
        }

        public Criteria andAudittimeLessThan(Date value) {
            addCriterion("auditTime <", value, "audittime");
            return (Criteria) this;
        }

        public Criteria andAudittimeLessThanOrEqualTo(Date value) {
            addCriterion("auditTime <=", value, "audittime");
            return (Criteria) this;
        }

        public Criteria andAudittimeIn(List<Date> values) {
            addCriterion("auditTime in", values, "audittime");
            return (Criteria) this;
        }

        public Criteria andAudittimeNotIn(List<Date> values) {
            addCriterion("auditTime not in", values, "audittime");
            return (Criteria) this;
        }

        public Criteria andAudittimeBetween(Date value1, Date value2) {
            addCriterion("auditTime between", value1, value2, "audittime");
            return (Criteria) this;
        }

        public Criteria andAudittimeNotBetween(Date value1, Date value2) {
            addCriterion("auditTime not between", value1, value2, "audittime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}