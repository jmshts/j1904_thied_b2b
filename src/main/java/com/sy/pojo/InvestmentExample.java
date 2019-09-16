package com.sy.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InvestmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InvestmentExample() {
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

        public Criteria andInvestmentidIsNull() {
            addCriterion("investmentId is null");
            return (Criteria) this;
        }

        public Criteria andInvestmentidIsNotNull() {
            addCriterion("investmentId is not null");
            return (Criteria) this;
        }

        public Criteria andInvestmentidEqualTo(Integer value) {
            addCriterion("investmentId =", value, "investmentid");
            return (Criteria) this;
        }

        public Criteria andInvestmentidNotEqualTo(Integer value) {
            addCriterion("investmentId <>", value, "investmentid");
            return (Criteria) this;
        }

        public Criteria andInvestmentidGreaterThan(Integer value) {
            addCriterion("investmentId >", value, "investmentid");
            return (Criteria) this;
        }

        public Criteria andInvestmentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("investmentId >=", value, "investmentid");
            return (Criteria) this;
        }

        public Criteria andInvestmentidLessThan(Integer value) {
            addCriterion("investmentId <", value, "investmentid");
            return (Criteria) this;
        }

        public Criteria andInvestmentidLessThanOrEqualTo(Integer value) {
            addCriterion("investmentId <=", value, "investmentid");
            return (Criteria) this;
        }

        public Criteria andInvestmentidIn(List<Integer> values) {
            addCriterion("investmentId in", values, "investmentid");
            return (Criteria) this;
        }

        public Criteria andInvestmentidNotIn(List<Integer> values) {
            addCriterion("investmentId not in", values, "investmentid");
            return (Criteria) this;
        }

        public Criteria andInvestmentidBetween(Integer value1, Integer value2) {
            addCriterion("investmentId between", value1, value2, "investmentid");
            return (Criteria) this;
        }

        public Criteria andInvestmentidNotBetween(Integer value1, Integer value2) {
            addCriterion("investmentId not between", value1, value2, "investmentid");
            return (Criteria) this;
        }

        public Criteria andLidIsNull() {
            addCriterion("lid is null");
            return (Criteria) this;
        }

        public Criteria andLidIsNotNull() {
            addCriterion("lid is not null");
            return (Criteria) this;
        }

        public Criteria andLidEqualTo(Integer value) {
            addCriterion("lid =", value, "lid");
            return (Criteria) this;
        }

        public Criteria andLidNotEqualTo(Integer value) {
            addCriterion("lid <>", value, "lid");
            return (Criteria) this;
        }

        public Criteria andLidGreaterThan(Integer value) {
            addCriterion("lid >", value, "lid");
            return (Criteria) this;
        }

        public Criteria andLidGreaterThanOrEqualTo(Integer value) {
            addCriterion("lid >=", value, "lid");
            return (Criteria) this;
        }

        public Criteria andLidLessThan(Integer value) {
            addCriterion("lid <", value, "lid");
            return (Criteria) this;
        }

        public Criteria andLidLessThanOrEqualTo(Integer value) {
            addCriterion("lid <=", value, "lid");
            return (Criteria) this;
        }

        public Criteria andLidIn(List<Integer> values) {
            addCriterion("lid in", values, "lid");
            return (Criteria) this;
        }

        public Criteria andLidNotIn(List<Integer> values) {
            addCriterion("lid not in", values, "lid");
            return (Criteria) this;
        }

        public Criteria andLidBetween(Integer value1, Integer value2) {
            addCriterion("lid between", value1, value2, "lid");
            return (Criteria) this;
        }

        public Criteria andLidNotBetween(Integer value1, Integer value2) {
            addCriterion("lid not between", value1, value2, "lid");
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

        public Criteria andInvestmentamountIsNull() {
            addCriterion("investmentAmount is null");
            return (Criteria) this;
        }

        public Criteria andInvestmentamountIsNotNull() {
            addCriterion("investmentAmount is not null");
            return (Criteria) this;
        }

        public Criteria andInvestmentamountEqualTo(BigDecimal value) {
            addCriterion("investmentAmount =", value, "investmentamount");
            return (Criteria) this;
        }

        public Criteria andInvestmentamountNotEqualTo(BigDecimal value) {
            addCriterion("investmentAmount <>", value, "investmentamount");
            return (Criteria) this;
        }

        public Criteria andInvestmentamountGreaterThan(BigDecimal value) {
            addCriterion("investmentAmount >", value, "investmentamount");
            return (Criteria) this;
        }

        public Criteria andInvestmentamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("investmentAmount >=", value, "investmentamount");
            return (Criteria) this;
        }

        public Criteria andInvestmentamountLessThan(BigDecimal value) {
            addCriterion("investmentAmount <", value, "investmentamount");
            return (Criteria) this;
        }

        public Criteria andInvestmentamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("investmentAmount <=", value, "investmentamount");
            return (Criteria) this;
        }

        public Criteria andInvestmentamountIn(List<BigDecimal> values) {
            addCriterion("investmentAmount in", values, "investmentamount");
            return (Criteria) this;
        }

        public Criteria andInvestmentamountNotIn(List<BigDecimal> values) {
            addCriterion("investmentAmount not in", values, "investmentamount");
            return (Criteria) this;
        }

        public Criteria andInvestmentamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("investmentAmount between", value1, value2, "investmentamount");
            return (Criteria) this;
        }

        public Criteria andInvestmentamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("investmentAmount not between", value1, value2, "investmentamount");
            return (Criteria) this;
        }

        public Criteria andInvestmenttimeIsNull() {
            addCriterion("investmentTime is null");
            return (Criteria) this;
        }

        public Criteria andInvestmenttimeIsNotNull() {
            addCriterion("investmentTime is not null");
            return (Criteria) this;
        }

        public Criteria andInvestmenttimeEqualTo(Date value) {
            addCriterion("investmentTime =", value, "investmenttime");
            return (Criteria) this;
        }

        public Criteria andInvestmenttimeNotEqualTo(Date value) {
            addCriterion("investmentTime <>", value, "investmenttime");
            return (Criteria) this;
        }

        public Criteria andInvestmenttimeGreaterThan(Date value) {
            addCriterion("investmentTime >", value, "investmenttime");
            return (Criteria) this;
        }

        public Criteria andInvestmenttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("investmentTime >=", value, "investmenttime");
            return (Criteria) this;
        }

        public Criteria andInvestmenttimeLessThan(Date value) {
            addCriterion("investmentTime <", value, "investmenttime");
            return (Criteria) this;
        }

        public Criteria andInvestmenttimeLessThanOrEqualTo(Date value) {
            addCriterion("investmentTime <=", value, "investmenttime");
            return (Criteria) this;
        }

        public Criteria andInvestmenttimeIn(List<Date> values) {
            addCriterion("investmentTime in", values, "investmenttime");
            return (Criteria) this;
        }

        public Criteria andInvestmenttimeNotIn(List<Date> values) {
            addCriterion("investmentTime not in", values, "investmenttime");
            return (Criteria) this;
        }

        public Criteria andInvestmenttimeBetween(Date value1, Date value2) {
            addCriterion("investmentTime between", value1, value2, "investmenttime");
            return (Criteria) this;
        }

        public Criteria andInvestmenttimeNotBetween(Date value1, Date value2) {
            addCriterion("investmentTime not between", value1, value2, "investmenttime");
            return (Criteria) this;
        }

        public Criteria andIfmakeoverIsNull() {
            addCriterion("ifMakeOver is null");
            return (Criteria) this;
        }

        public Criteria andIfmakeoverIsNotNull() {
            addCriterion("ifMakeOver is not null");
            return (Criteria) this;
        }

        public Criteria andIfmakeoverEqualTo(Boolean value) {
            addCriterion("ifMakeOver =", value, "ifmakeover");
            return (Criteria) this;
        }

        public Criteria andIfmakeoverNotEqualTo(Boolean value) {
            addCriterion("ifMakeOver <>", value, "ifmakeover");
            return (Criteria) this;
        }

        public Criteria andIfmakeoverGreaterThan(Boolean value) {
            addCriterion("ifMakeOver >", value, "ifmakeover");
            return (Criteria) this;
        }

        public Criteria andIfmakeoverGreaterThanOrEqualTo(Boolean value) {
            addCriterion("ifMakeOver >=", value, "ifmakeover");
            return (Criteria) this;
        }

        public Criteria andIfmakeoverLessThan(Boolean value) {
            addCriterion("ifMakeOver <", value, "ifmakeover");
            return (Criteria) this;
        }

        public Criteria andIfmakeoverLessThanOrEqualTo(Boolean value) {
            addCriterion("ifMakeOver <=", value, "ifmakeover");
            return (Criteria) this;
        }

        public Criteria andIfmakeoverIn(List<Boolean> values) {
            addCriterion("ifMakeOver in", values, "ifmakeover");
            return (Criteria) this;
        }

        public Criteria andIfmakeoverNotIn(List<Boolean> values) {
            addCriterion("ifMakeOver not in", values, "ifmakeover");
            return (Criteria) this;
        }

        public Criteria andIfmakeoverBetween(Boolean value1, Boolean value2) {
            addCriterion("ifMakeOver between", value1, value2, "ifmakeover");
            return (Criteria) this;
        }

        public Criteria andIfmakeoverNotBetween(Boolean value1, Boolean value2) {
            addCriterion("ifMakeOver not between", value1, value2, "ifmakeover");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("remarks is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("remarks =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("remarks <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("remarks >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("remarks >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("remarks <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("remarks <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("remarks like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("remarks not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("remarks in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("remarks not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("remarks between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("remarks not between", value1, value2, "remarks");
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