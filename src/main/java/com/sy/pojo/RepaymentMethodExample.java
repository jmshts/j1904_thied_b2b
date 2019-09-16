package com.sy.pojo;

import java.util.ArrayList;
import java.util.List;

public class RepaymentMethodExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RepaymentMethodExample() {
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

        public Criteria andRepaymentidIsNull() {
            addCriterion("repaymentId is null");
            return (Criteria) this;
        }

        public Criteria andRepaymentidIsNotNull() {
            addCriterion("repaymentId is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymentidEqualTo(Integer value) {
            addCriterion("repaymentId =", value, "repaymentid");
            return (Criteria) this;
        }

        public Criteria andRepaymentidNotEqualTo(Integer value) {
            addCriterion("repaymentId <>", value, "repaymentid");
            return (Criteria) this;
        }

        public Criteria andRepaymentidGreaterThan(Integer value) {
            addCriterion("repaymentId >", value, "repaymentid");
            return (Criteria) this;
        }

        public Criteria andRepaymentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("repaymentId >=", value, "repaymentid");
            return (Criteria) this;
        }

        public Criteria andRepaymentidLessThan(Integer value) {
            addCriterion("repaymentId <", value, "repaymentid");
            return (Criteria) this;
        }

        public Criteria andRepaymentidLessThanOrEqualTo(Integer value) {
            addCriterion("repaymentId <=", value, "repaymentid");
            return (Criteria) this;
        }

        public Criteria andRepaymentidIn(List<Integer> values) {
            addCriterion("repaymentId in", values, "repaymentid");
            return (Criteria) this;
        }

        public Criteria andRepaymentidNotIn(List<Integer> values) {
            addCriterion("repaymentId not in", values, "repaymentid");
            return (Criteria) this;
        }

        public Criteria andRepaymentidBetween(Integer value1, Integer value2) {
            addCriterion("repaymentId between", value1, value2, "repaymentid");
            return (Criteria) this;
        }

        public Criteria andRepaymentidNotBetween(Integer value1, Integer value2) {
            addCriterion("repaymentId not between", value1, value2, "repaymentid");
            return (Criteria) this;
        }

        public Criteria andRepaymentnameIsNull() {
            addCriterion("repaymentName is null");
            return (Criteria) this;
        }

        public Criteria andRepaymentnameIsNotNull() {
            addCriterion("repaymentName is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymentnameEqualTo(String value) {
            addCriterion("repaymentName =", value, "repaymentname");
            return (Criteria) this;
        }

        public Criteria andRepaymentnameNotEqualTo(String value) {
            addCriterion("repaymentName <>", value, "repaymentname");
            return (Criteria) this;
        }

        public Criteria andRepaymentnameGreaterThan(String value) {
            addCriterion("repaymentName >", value, "repaymentname");
            return (Criteria) this;
        }

        public Criteria andRepaymentnameGreaterThanOrEqualTo(String value) {
            addCriterion("repaymentName >=", value, "repaymentname");
            return (Criteria) this;
        }

        public Criteria andRepaymentnameLessThan(String value) {
            addCriterion("repaymentName <", value, "repaymentname");
            return (Criteria) this;
        }

        public Criteria andRepaymentnameLessThanOrEqualTo(String value) {
            addCriterion("repaymentName <=", value, "repaymentname");
            return (Criteria) this;
        }

        public Criteria andRepaymentnameLike(String value) {
            addCriterion("repaymentName like", value, "repaymentname");
            return (Criteria) this;
        }

        public Criteria andRepaymentnameNotLike(String value) {
            addCriterion("repaymentName not like", value, "repaymentname");
            return (Criteria) this;
        }

        public Criteria andRepaymentnameIn(List<String> values) {
            addCriterion("repaymentName in", values, "repaymentname");
            return (Criteria) this;
        }

        public Criteria andRepaymentnameNotIn(List<String> values) {
            addCriterion("repaymentName not in", values, "repaymentname");
            return (Criteria) this;
        }

        public Criteria andRepaymentnameBetween(String value1, String value2) {
            addCriterion("repaymentName between", value1, value2, "repaymentname");
            return (Criteria) this;
        }

        public Criteria andRepaymentnameNotBetween(String value1, String value2) {
            addCriterion("repaymentName not between", value1, value2, "repaymentname");
            return (Criteria) this;
        }

        public Criteria andAlgorithmIsNull() {
            addCriterion("algorithm is null");
            return (Criteria) this;
        }

        public Criteria andAlgorithmIsNotNull() {
            addCriterion("algorithm is not null");
            return (Criteria) this;
        }

        public Criteria andAlgorithmEqualTo(String value) {
            addCriterion("algorithm =", value, "algorithm");
            return (Criteria) this;
        }

        public Criteria andAlgorithmNotEqualTo(String value) {
            addCriterion("algorithm <>", value, "algorithm");
            return (Criteria) this;
        }

        public Criteria andAlgorithmGreaterThan(String value) {
            addCriterion("algorithm >", value, "algorithm");
            return (Criteria) this;
        }

        public Criteria andAlgorithmGreaterThanOrEqualTo(String value) {
            addCriterion("algorithm >=", value, "algorithm");
            return (Criteria) this;
        }

        public Criteria andAlgorithmLessThan(String value) {
            addCriterion("algorithm <", value, "algorithm");
            return (Criteria) this;
        }

        public Criteria andAlgorithmLessThanOrEqualTo(String value) {
            addCriterion("algorithm <=", value, "algorithm");
            return (Criteria) this;
        }

        public Criteria andAlgorithmLike(String value) {
            addCriterion("algorithm like", value, "algorithm");
            return (Criteria) this;
        }

        public Criteria andAlgorithmNotLike(String value) {
            addCriterion("algorithm not like", value, "algorithm");
            return (Criteria) this;
        }

        public Criteria andAlgorithmIn(List<String> values) {
            addCriterion("algorithm in", values, "algorithm");
            return (Criteria) this;
        }

        public Criteria andAlgorithmNotIn(List<String> values) {
            addCriterion("algorithm not in", values, "algorithm");
            return (Criteria) this;
        }

        public Criteria andAlgorithmBetween(String value1, String value2) {
            addCriterion("algorithm between", value1, value2, "algorithm");
            return (Criteria) this;
        }

        public Criteria andAlgorithmNotBetween(String value1, String value2) {
            addCriterion("algorithm not between", value1, value2, "algorithm");
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