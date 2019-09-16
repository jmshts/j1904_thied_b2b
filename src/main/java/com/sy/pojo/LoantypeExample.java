package com.sy.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class LoantypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LoantypeExample() {
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

        public Criteria andLoantypeidIsNull() {
            addCriterion("loanTypeId is null");
            return (Criteria) this;
        }

        public Criteria andLoantypeidIsNotNull() {
            addCriterion("loanTypeId is not null");
            return (Criteria) this;
        }

        public Criteria andLoantypeidEqualTo(Integer value) {
            addCriterion("loanTypeId =", value, "loantypeid");
            return (Criteria) this;
        }

        public Criteria andLoantypeidNotEqualTo(Integer value) {
            addCriterion("loanTypeId <>", value, "loantypeid");
            return (Criteria) this;
        }

        public Criteria andLoantypeidGreaterThan(Integer value) {
            addCriterion("loanTypeId >", value, "loantypeid");
            return (Criteria) this;
        }

        public Criteria andLoantypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("loanTypeId >=", value, "loantypeid");
            return (Criteria) this;
        }

        public Criteria andLoantypeidLessThan(Integer value) {
            addCriterion("loanTypeId <", value, "loantypeid");
            return (Criteria) this;
        }

        public Criteria andLoantypeidLessThanOrEqualTo(Integer value) {
            addCriterion("loanTypeId <=", value, "loantypeid");
            return (Criteria) this;
        }

        public Criteria andLoantypeidIn(List<Integer> values) {
            addCriterion("loanTypeId in", values, "loantypeid");
            return (Criteria) this;
        }

        public Criteria andLoantypeidNotIn(List<Integer> values) {
            addCriterion("loanTypeId not in", values, "loantypeid");
            return (Criteria) this;
        }

        public Criteria andLoantypeidBetween(Integer value1, Integer value2) {
            addCriterion("loanTypeId between", value1, value2, "loantypeid");
            return (Criteria) this;
        }

        public Criteria andLoantypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("loanTypeId not between", value1, value2, "loantypeid");
            return (Criteria) this;
        }

        public Criteria andLoadtypenameIsNull() {
            addCriterion("loadTypeName is null");
            return (Criteria) this;
        }

        public Criteria andLoadtypenameIsNotNull() {
            addCriterion("loadTypeName is not null");
            return (Criteria) this;
        }

        public Criteria andLoadtypenameEqualTo(String value) {
            addCriterion("loadTypeName =", value, "loadtypename");
            return (Criteria) this;
        }

        public Criteria andLoadtypenameNotEqualTo(String value) {
            addCriterion("loadTypeName <>", value, "loadtypename");
            return (Criteria) this;
        }

        public Criteria andLoadtypenameGreaterThan(String value) {
            addCriterion("loadTypeName >", value, "loadtypename");
            return (Criteria) this;
        }

        public Criteria andLoadtypenameGreaterThanOrEqualTo(String value) {
            addCriterion("loadTypeName >=", value, "loadtypename");
            return (Criteria) this;
        }

        public Criteria andLoadtypenameLessThan(String value) {
            addCriterion("loadTypeName <", value, "loadtypename");
            return (Criteria) this;
        }

        public Criteria andLoadtypenameLessThanOrEqualTo(String value) {
            addCriterion("loadTypeName <=", value, "loadtypename");
            return (Criteria) this;
        }

        public Criteria andLoadtypenameLike(String value) {
            addCriterion("loadTypeName like", value, "loadtypename");
            return (Criteria) this;
        }

        public Criteria andLoadtypenameNotLike(String value) {
            addCriterion("loadTypeName not like", value, "loadtypename");
            return (Criteria) this;
        }

        public Criteria andLoadtypenameIn(List<String> values) {
            addCriterion("loadTypeName in", values, "loadtypename");
            return (Criteria) this;
        }

        public Criteria andLoadtypenameNotIn(List<String> values) {
            addCriterion("loadTypeName not in", values, "loadtypename");
            return (Criteria) this;
        }

        public Criteria andLoadtypenameBetween(String value1, String value2) {
            addCriterion("loadTypeName between", value1, value2, "loadtypename");
            return (Criteria) this;
        }

        public Criteria andLoadtypenameNotBetween(String value1, String value2) {
            addCriterion("loadTypeName not between", value1, value2, "loadtypename");
            return (Criteria) this;
        }

        public Criteria andRateIsNull() {
            addCriterion("rate is null");
            return (Criteria) this;
        }

        public Criteria andRateIsNotNull() {
            addCriterion("rate is not null");
            return (Criteria) this;
        }

        public Criteria andRateEqualTo(BigDecimal value) {
            addCriterion("rate =", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotEqualTo(BigDecimal value) {
            addCriterion("rate <>", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThan(BigDecimal value) {
            addCriterion("rate >", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("rate >=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThan(BigDecimal value) {
            addCriterion("rate <", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("rate <=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateIn(List<BigDecimal> values) {
            addCriterion("rate in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotIn(List<BigDecimal> values) {
            addCriterion("rate not in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rate between", value1, value2, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rate not between", value1, value2, "rate");
            return (Criteria) this;
        }

        public Criteria andLoantimeIsNull() {
            addCriterion("loanTime is null");
            return (Criteria) this;
        }

        public Criteria andLoantimeIsNotNull() {
            addCriterion("loanTime is not null");
            return (Criteria) this;
        }

        public Criteria andLoantimeEqualTo(Integer value) {
            addCriterion("loanTime =", value, "loantime");
            return (Criteria) this;
        }

        public Criteria andLoantimeNotEqualTo(Integer value) {
            addCriterion("loanTime <>", value, "loantime");
            return (Criteria) this;
        }

        public Criteria andLoantimeGreaterThan(Integer value) {
            addCriterion("loanTime >", value, "loantime");
            return (Criteria) this;
        }

        public Criteria andLoantimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("loanTime >=", value, "loantime");
            return (Criteria) this;
        }

        public Criteria andLoantimeLessThan(Integer value) {
            addCriterion("loanTime <", value, "loantime");
            return (Criteria) this;
        }

        public Criteria andLoantimeLessThanOrEqualTo(Integer value) {
            addCriterion("loanTime <=", value, "loantime");
            return (Criteria) this;
        }

        public Criteria andLoantimeIn(List<Integer> values) {
            addCriterion("loanTime in", values, "loantime");
            return (Criteria) this;
        }

        public Criteria andLoantimeNotIn(List<Integer> values) {
            addCriterion("loanTime not in", values, "loantime");
            return (Criteria) this;
        }

        public Criteria andLoantimeBetween(Integer value1, Integer value2) {
            addCriterion("loanTime between", value1, value2, "loantime");
            return (Criteria) this;
        }

        public Criteria andLoantimeNotBetween(Integer value1, Integer value2) {
            addCriterion("loanTime not between", value1, value2, "loantime");
            return (Criteria) this;
        }

        public Criteria andMininvestmentIsNull() {
            addCriterion("minInvestment is null");
            return (Criteria) this;
        }

        public Criteria andMininvestmentIsNotNull() {
            addCriterion("minInvestment is not null");
            return (Criteria) this;
        }

        public Criteria andMininvestmentEqualTo(BigDecimal value) {
            addCriterion("minInvestment =", value, "mininvestment");
            return (Criteria) this;
        }

        public Criteria andMininvestmentNotEqualTo(BigDecimal value) {
            addCriterion("minInvestment <>", value, "mininvestment");
            return (Criteria) this;
        }

        public Criteria andMininvestmentGreaterThan(BigDecimal value) {
            addCriterion("minInvestment >", value, "mininvestment");
            return (Criteria) this;
        }

        public Criteria andMininvestmentGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("minInvestment >=", value, "mininvestment");
            return (Criteria) this;
        }

        public Criteria andMininvestmentLessThan(BigDecimal value) {
            addCriterion("minInvestment <", value, "mininvestment");
            return (Criteria) this;
        }

        public Criteria andMininvestmentLessThanOrEqualTo(BigDecimal value) {
            addCriterion("minInvestment <=", value, "mininvestment");
            return (Criteria) this;
        }

        public Criteria andMininvestmentIn(List<BigDecimal> values) {
            addCriterion("minInvestment in", values, "mininvestment");
            return (Criteria) this;
        }

        public Criteria andMininvestmentNotIn(List<BigDecimal> values) {
            addCriterion("minInvestment not in", values, "mininvestment");
            return (Criteria) this;
        }

        public Criteria andMininvestmentBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("minInvestment between", value1, value2, "mininvestment");
            return (Criteria) this;
        }

        public Criteria andMininvestmentNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("minInvestment not between", value1, value2, "mininvestment");
            return (Criteria) this;
        }

        public Criteria andMaxinvestmentIsNull() {
            addCriterion("maxInvestment is null");
            return (Criteria) this;
        }

        public Criteria andMaxinvestmentIsNotNull() {
            addCriterion("maxInvestment is not null");
            return (Criteria) this;
        }

        public Criteria andMaxinvestmentEqualTo(BigDecimal value) {
            addCriterion("maxInvestment =", value, "maxinvestment");
            return (Criteria) this;
        }

        public Criteria andMaxinvestmentNotEqualTo(BigDecimal value) {
            addCriterion("maxInvestment <>", value, "maxinvestment");
            return (Criteria) this;
        }

        public Criteria andMaxinvestmentGreaterThan(BigDecimal value) {
            addCriterion("maxInvestment >", value, "maxinvestment");
            return (Criteria) this;
        }

        public Criteria andMaxinvestmentGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("maxInvestment >=", value, "maxinvestment");
            return (Criteria) this;
        }

        public Criteria andMaxinvestmentLessThan(BigDecimal value) {
            addCriterion("maxInvestment <", value, "maxinvestment");
            return (Criteria) this;
        }

        public Criteria andMaxinvestmentLessThanOrEqualTo(BigDecimal value) {
            addCriterion("maxInvestment <=", value, "maxinvestment");
            return (Criteria) this;
        }

        public Criteria andMaxinvestmentIn(List<BigDecimal> values) {
            addCriterion("maxInvestment in", values, "maxinvestment");
            return (Criteria) this;
        }

        public Criteria andMaxinvestmentNotIn(List<BigDecimal> values) {
            addCriterion("maxInvestment not in", values, "maxinvestment");
            return (Criteria) this;
        }

        public Criteria andMaxinvestmentBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("maxInvestment between", value1, value2, "maxinvestment");
            return (Criteria) this;
        }

        public Criteria andMaxinvestmentNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("maxInvestment not between", value1, value2, "maxinvestment");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
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