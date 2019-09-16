package com.sy.pojo;

import java.util.ArrayList;
import java.util.List;

public class RepaymentinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RepaymentinfoExample() {
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

        public Criteria andRepaymentinfoidIsNull() {
            addCriterion("repaymentinfoId is null");
            return (Criteria) this;
        }

        public Criteria andRepaymentinfoidIsNotNull() {
            addCriterion("repaymentinfoId is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymentinfoidEqualTo(Integer value) {
            addCriterion("repaymentinfoId =", value, "repaymentinfoid");
            return (Criteria) this;
        }

        public Criteria andRepaymentinfoidNotEqualTo(Integer value) {
            addCriterion("repaymentinfoId <>", value, "repaymentinfoid");
            return (Criteria) this;
        }

        public Criteria andRepaymentinfoidGreaterThan(Integer value) {
            addCriterion("repaymentinfoId >", value, "repaymentinfoid");
            return (Criteria) this;
        }

        public Criteria andRepaymentinfoidGreaterThanOrEqualTo(Integer value) {
            addCriterion("repaymentinfoId >=", value, "repaymentinfoid");
            return (Criteria) this;
        }

        public Criteria andRepaymentinfoidLessThan(Integer value) {
            addCriterion("repaymentinfoId <", value, "repaymentinfoid");
            return (Criteria) this;
        }

        public Criteria andRepaymentinfoidLessThanOrEqualTo(Integer value) {
            addCriterion("repaymentinfoId <=", value, "repaymentinfoid");
            return (Criteria) this;
        }

        public Criteria andRepaymentinfoidIn(List<Integer> values) {
            addCriterion("repaymentinfoId in", values, "repaymentinfoid");
            return (Criteria) this;
        }

        public Criteria andRepaymentinfoidNotIn(List<Integer> values) {
            addCriterion("repaymentinfoId not in", values, "repaymentinfoid");
            return (Criteria) this;
        }

        public Criteria andRepaymentinfoidBetween(Integer value1, Integer value2) {
            addCriterion("repaymentinfoId between", value1, value2, "repaymentinfoid");
            return (Criteria) this;
        }

        public Criteria andRepaymentinfoidNotBetween(Integer value1, Integer value2) {
            addCriterion("repaymentinfoId not between", value1, value2, "repaymentinfoid");
            return (Criteria) this;
        }

        public Criteria andRmidIsNull() {
            addCriterion("rmid is null");
            return (Criteria) this;
        }

        public Criteria andRmidIsNotNull() {
            addCriterion("rmid is not null");
            return (Criteria) this;
        }

        public Criteria andRmidEqualTo(Integer value) {
            addCriterion("rmid =", value, "rmid");
            return (Criteria) this;
        }

        public Criteria andRmidNotEqualTo(Integer value) {
            addCriterion("rmid <>", value, "rmid");
            return (Criteria) this;
        }

        public Criteria andRmidGreaterThan(Integer value) {
            addCriterion("rmid >", value, "rmid");
            return (Criteria) this;
        }

        public Criteria andRmidGreaterThanOrEqualTo(Integer value) {
            addCriterion("rmid >=", value, "rmid");
            return (Criteria) this;
        }

        public Criteria andRmidLessThan(Integer value) {
            addCriterion("rmid <", value, "rmid");
            return (Criteria) this;
        }

        public Criteria andRmidLessThanOrEqualTo(Integer value) {
            addCriterion("rmid <=", value, "rmid");
            return (Criteria) this;
        }

        public Criteria andRmidIn(List<Integer> values) {
            addCriterion("rmid in", values, "rmid");
            return (Criteria) this;
        }

        public Criteria andRmidNotIn(List<Integer> values) {
            addCriterion("rmid not in", values, "rmid");
            return (Criteria) this;
        }

        public Criteria andRmidBetween(Integer value1, Integer value2) {
            addCriterion("rmid between", value1, value2, "rmid");
            return (Criteria) this;
        }

        public Criteria andRmidNotBetween(Integer value1, Integer value2) {
            addCriterion("rmid not between", value1, value2, "rmid");
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

        public Criteria andRepaymentIsNull() {
            addCriterion("repayment is null");
            return (Criteria) this;
        }

        public Criteria andRepaymentIsNotNull() {
            addCriterion("repayment is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymentEqualTo(Long value) {
            addCriterion("repayment =", value, "repayment");
            return (Criteria) this;
        }

        public Criteria andRepaymentNotEqualTo(Long value) {
            addCriterion("repayment <>", value, "repayment");
            return (Criteria) this;
        }

        public Criteria andRepaymentGreaterThan(Long value) {
            addCriterion("repayment >", value, "repayment");
            return (Criteria) this;
        }

        public Criteria andRepaymentGreaterThanOrEqualTo(Long value) {
            addCriterion("repayment >=", value, "repayment");
            return (Criteria) this;
        }

        public Criteria andRepaymentLessThan(Long value) {
            addCriterion("repayment <", value, "repayment");
            return (Criteria) this;
        }

        public Criteria andRepaymentLessThanOrEqualTo(Long value) {
            addCriterion("repayment <=", value, "repayment");
            return (Criteria) this;
        }

        public Criteria andRepaymentIn(List<Long> values) {
            addCriterion("repayment in", values, "repayment");
            return (Criteria) this;
        }

        public Criteria andRepaymentNotIn(List<Long> values) {
            addCriterion("repayment not in", values, "repayment");
            return (Criteria) this;
        }

        public Criteria andRepaymentBetween(Long value1, Long value2) {
            addCriterion("repayment between", value1, value2, "repayment");
            return (Criteria) this;
        }

        public Criteria andRepaymentNotBetween(Long value1, Long value2) {
            addCriterion("repayment not between", value1, value2, "repayment");
            return (Criteria) this;
        }

        public Criteria andHasrepaymentIsNull() {
            addCriterion("hasRepayment is null");
            return (Criteria) this;
        }

        public Criteria andHasrepaymentIsNotNull() {
            addCriterion("hasRepayment is not null");
            return (Criteria) this;
        }

        public Criteria andHasrepaymentEqualTo(Long value) {
            addCriterion("hasRepayment =", value, "hasrepayment");
            return (Criteria) this;
        }

        public Criteria andHasrepaymentNotEqualTo(Long value) {
            addCriterion("hasRepayment <>", value, "hasrepayment");
            return (Criteria) this;
        }

        public Criteria andHasrepaymentGreaterThan(Long value) {
            addCriterion("hasRepayment >", value, "hasrepayment");
            return (Criteria) this;
        }

        public Criteria andHasrepaymentGreaterThanOrEqualTo(Long value) {
            addCriterion("hasRepayment >=", value, "hasrepayment");
            return (Criteria) this;
        }

        public Criteria andHasrepaymentLessThan(Long value) {
            addCriterion("hasRepayment <", value, "hasrepayment");
            return (Criteria) this;
        }

        public Criteria andHasrepaymentLessThanOrEqualTo(Long value) {
            addCriterion("hasRepayment <=", value, "hasrepayment");
            return (Criteria) this;
        }

        public Criteria andHasrepaymentIn(List<Long> values) {
            addCriterion("hasRepayment in", values, "hasrepayment");
            return (Criteria) this;
        }

        public Criteria andHasrepaymentNotIn(List<Long> values) {
            addCriterion("hasRepayment not in", values, "hasrepayment");
            return (Criteria) this;
        }

        public Criteria andHasrepaymentBetween(Long value1, Long value2) {
            addCriterion("hasRepayment between", value1, value2, "hasrepayment");
            return (Criteria) this;
        }

        public Criteria andHasrepaymentNotBetween(Long value1, Long value2) {
            addCriterion("hasRepayment not between", value1, value2, "hasrepayment");
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