package com.sy.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class QuotaExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QuotaExample() {
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

        public Criteria andQuotaIsNull() {
            addCriterion("quota is null");
            return (Criteria) this;
        }

        public Criteria andQuotaIsNotNull() {
            addCriterion("quota is not null");
            return (Criteria) this;
        }

        public Criteria andQuotaEqualTo(BigDecimal value) {
            addCriterion("quota =", value, "quota");
            return (Criteria) this;
        }

        public Criteria andQuotaNotEqualTo(BigDecimal value) {
            addCriterion("quota <>", value, "quota");
            return (Criteria) this;
        }

        public Criteria andQuotaGreaterThan(BigDecimal value) {
            addCriterion("quota >", value, "quota");
            return (Criteria) this;
        }

        public Criteria andQuotaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("quota >=", value, "quota");
            return (Criteria) this;
        }

        public Criteria andQuotaLessThan(BigDecimal value) {
            addCriterion("quota <", value, "quota");
            return (Criteria) this;
        }

        public Criteria andQuotaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("quota <=", value, "quota");
            return (Criteria) this;
        }

        public Criteria andQuotaIn(List<BigDecimal> values) {
            addCriterion("quota in", values, "quota");
            return (Criteria) this;
        }

        public Criteria andQuotaNotIn(List<BigDecimal> values) {
            addCriterion("quota not in", values, "quota");
            return (Criteria) this;
        }

        public Criteria andQuotaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("quota between", value1, value2, "quota");
            return (Criteria) this;
        }

        public Criteria andQuotaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("quota not between", value1, value2, "quota");
            return (Criteria) this;
        }

        public Criteria andFreezingquotaIsNull() {
            addCriterion("freezingQuota is null");
            return (Criteria) this;
        }

        public Criteria andFreezingquotaIsNotNull() {
            addCriterion("freezingQuota is not null");
            return (Criteria) this;
        }

        public Criteria andFreezingquotaEqualTo(BigDecimal value) {
            addCriterion("freezingQuota =", value, "freezingquota");
            return (Criteria) this;
        }

        public Criteria andFreezingquotaNotEqualTo(BigDecimal value) {
            addCriterion("freezingQuota <>", value, "freezingquota");
            return (Criteria) this;
        }

        public Criteria andFreezingquotaGreaterThan(BigDecimal value) {
            addCriterion("freezingQuota >", value, "freezingquota");
            return (Criteria) this;
        }

        public Criteria andFreezingquotaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("freezingQuota >=", value, "freezingquota");
            return (Criteria) this;
        }

        public Criteria andFreezingquotaLessThan(BigDecimal value) {
            addCriterion("freezingQuota <", value, "freezingquota");
            return (Criteria) this;
        }

        public Criteria andFreezingquotaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("freezingQuota <=", value, "freezingquota");
            return (Criteria) this;
        }

        public Criteria andFreezingquotaIn(List<BigDecimal> values) {
            addCriterion("freezingQuota in", values, "freezingquota");
            return (Criteria) this;
        }

        public Criteria andFreezingquotaNotIn(List<BigDecimal> values) {
            addCriterion("freezingQuota not in", values, "freezingquota");
            return (Criteria) this;
        }

        public Criteria andFreezingquotaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("freezingQuota between", value1, value2, "freezingquota");
            return (Criteria) this;
        }

        public Criteria andFreezingquotaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("freezingQuota not between", value1, value2, "freezingquota");
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