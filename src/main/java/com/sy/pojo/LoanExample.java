package com.sy.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LoanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LoanExample() {
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

        public Criteria andLoanidIsNull() {
            addCriterion("loanId is null");
            return (Criteria) this;
        }

        public Criteria andLoanidIsNotNull() {
            addCriterion("loanId is not null");
            return (Criteria) this;
        }

        public Criteria andLoanidEqualTo(Integer value) {
            addCriterion("loanId =", value, "loanid");
            return (Criteria) this;
        }

        public Criteria andLoanidNotEqualTo(Integer value) {
            addCriterion("loanId <>", value, "loanid");
            return (Criteria) this;
        }

        public Criteria andLoanidGreaterThan(Integer value) {
            addCriterion("loanId >", value, "loanid");
            return (Criteria) this;
        }

        public Criteria andLoanidGreaterThanOrEqualTo(Integer value) {
            addCriterion("loanId >=", value, "loanid");
            return (Criteria) this;
        }

        public Criteria andLoanidLessThan(Integer value) {
            addCriterion("loanId <", value, "loanid");
            return (Criteria) this;
        }

        public Criteria andLoanidLessThanOrEqualTo(Integer value) {
            addCriterion("loanId <=", value, "loanid");
            return (Criteria) this;
        }

        public Criteria andLoanidIn(List<Integer> values) {
            addCriterion("loanId in", values, "loanid");
            return (Criteria) this;
        }

        public Criteria andLoanidNotIn(List<Integer> values) {
            addCriterion("loanId not in", values, "loanid");
            return (Criteria) this;
        }

        public Criteria andLoanidBetween(Integer value1, Integer value2) {
            addCriterion("loanId between", value1, value2, "loanid");
            return (Criteria) this;
        }

        public Criteria andLoanidNotBetween(Integer value1, Integer value2) {
            addCriterion("loanId not between", value1, value2, "loanid");
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

        public Criteria andLtidIsNull() {
            addCriterion("ltid is null");
            return (Criteria) this;
        }

        public Criteria andLtidIsNotNull() {
            addCriterion("ltid is not null");
            return (Criteria) this;
        }

        public Criteria andLtidEqualTo(Integer value) {
            addCriterion("ltid =", value, "ltid");
            return (Criteria) this;
        }

        public Criteria andLtidNotEqualTo(Integer value) {
            addCriterion("ltid <>", value, "ltid");
            return (Criteria) this;
        }

        public Criteria andLtidGreaterThan(Integer value) {
            addCriterion("ltid >", value, "ltid");
            return (Criteria) this;
        }

        public Criteria andLtidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ltid >=", value, "ltid");
            return (Criteria) this;
        }

        public Criteria andLtidLessThan(Integer value) {
            addCriterion("ltid <", value, "ltid");
            return (Criteria) this;
        }

        public Criteria andLtidLessThanOrEqualTo(Integer value) {
            addCriterion("ltid <=", value, "ltid");
            return (Criteria) this;
        }

        public Criteria andLtidIn(List<Integer> values) {
            addCriterion("ltid in", values, "ltid");
            return (Criteria) this;
        }

        public Criteria andLtidNotIn(List<Integer> values) {
            addCriterion("ltid not in", values, "ltid");
            return (Criteria) this;
        }

        public Criteria andLtidBetween(Integer value1, Integer value2) {
            addCriterion("ltid between", value1, value2, "ltid");
            return (Criteria) this;
        }

        public Criteria andLtidNotBetween(Integer value1, Integer value2) {
            addCriterion("ltid not between", value1, value2, "ltid");
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

        public Criteria andLoannameIsNull() {
            addCriterion("loanName is null");
            return (Criteria) this;
        }

        public Criteria andLoannameIsNotNull() {
            addCriterion("loanName is not null");
            return (Criteria) this;
        }

        public Criteria andLoannameEqualTo(String value) {
            addCriterion("loanName =", value, "loanname");
            return (Criteria) this;
        }

        public Criteria andLoannameNotEqualTo(String value) {
            addCriterion("loanName <>", value, "loanname");
            return (Criteria) this;
        }

        public Criteria andLoannameGreaterThan(String value) {
            addCriterion("loanName >", value, "loanname");
            return (Criteria) this;
        }

        public Criteria andLoannameGreaterThanOrEqualTo(String value) {
            addCriterion("loanName >=", value, "loanname");
            return (Criteria) this;
        }

        public Criteria andLoannameLessThan(String value) {
            addCriterion("loanName <", value, "loanname");
            return (Criteria) this;
        }

        public Criteria andLoannameLessThanOrEqualTo(String value) {
            addCriterion("loanName <=", value, "loanname");
            return (Criteria) this;
        }

        public Criteria andLoannameLike(String value) {
            addCriterion("loanName like", value, "loanname");
            return (Criteria) this;
        }

        public Criteria andLoannameNotLike(String value) {
            addCriterion("loanName not like", value, "loanname");
            return (Criteria) this;
        }

        public Criteria andLoannameIn(List<String> values) {
            addCriterion("loanName in", values, "loanname");
            return (Criteria) this;
        }

        public Criteria andLoannameNotIn(List<String> values) {
            addCriterion("loanName not in", values, "loanname");
            return (Criteria) this;
        }

        public Criteria andLoannameBetween(String value1, String value2) {
            addCriterion("loanName between", value1, value2, "loanname");
            return (Criteria) this;
        }

        public Criteria andLoannameNotBetween(String value1, String value2) {
            addCriterion("loanName not between", value1, value2, "loanname");
            return (Criteria) this;
        }

        public Criteria andLoaninfoIsNull() {
            addCriterion("loanInfo is null");
            return (Criteria) this;
        }

        public Criteria andLoaninfoIsNotNull() {
            addCriterion("loanInfo is not null");
            return (Criteria) this;
        }

        public Criteria andLoaninfoEqualTo(String value) {
            addCriterion("loanInfo =", value, "loaninfo");
            return (Criteria) this;
        }

        public Criteria andLoaninfoNotEqualTo(String value) {
            addCriterion("loanInfo <>", value, "loaninfo");
            return (Criteria) this;
        }

        public Criteria andLoaninfoGreaterThan(String value) {
            addCriterion("loanInfo >", value, "loaninfo");
            return (Criteria) this;
        }

        public Criteria andLoaninfoGreaterThanOrEqualTo(String value) {
            addCriterion("loanInfo >=", value, "loaninfo");
            return (Criteria) this;
        }

        public Criteria andLoaninfoLessThan(String value) {
            addCriterion("loanInfo <", value, "loaninfo");
            return (Criteria) this;
        }

        public Criteria andLoaninfoLessThanOrEqualTo(String value) {
            addCriterion("loanInfo <=", value, "loaninfo");
            return (Criteria) this;
        }

        public Criteria andLoaninfoLike(String value) {
            addCriterion("loanInfo like", value, "loaninfo");
            return (Criteria) this;
        }

        public Criteria andLoaninfoNotLike(String value) {
            addCriterion("loanInfo not like", value, "loaninfo");
            return (Criteria) this;
        }

        public Criteria andLoaninfoIn(List<String> values) {
            addCriterion("loanInfo in", values, "loaninfo");
            return (Criteria) this;
        }

        public Criteria andLoaninfoNotIn(List<String> values) {
            addCriterion("loanInfo not in", values, "loaninfo");
            return (Criteria) this;
        }

        public Criteria andLoaninfoBetween(String value1, String value2) {
            addCriterion("loanInfo between", value1, value2, "loaninfo");
            return (Criteria) this;
        }

        public Criteria andLoaninfoNotBetween(String value1, String value2) {
            addCriterion("loanInfo not between", value1, value2, "loaninfo");
            return (Criteria) this;
        }

        public Criteria andLoanamountIsNull() {
            addCriterion("loanAmount is null");
            return (Criteria) this;
        }

        public Criteria andLoanamountIsNotNull() {
            addCriterion("loanAmount is not null");
            return (Criteria) this;
        }

        public Criteria andLoanamountEqualTo(BigDecimal value) {
            addCriterion("loanAmount =", value, "loanamount");
            return (Criteria) this;
        }

        public Criteria andLoanamountNotEqualTo(BigDecimal value) {
            addCriterion("loanAmount <>", value, "loanamount");
            return (Criteria) this;
        }

        public Criteria andLoanamountGreaterThan(BigDecimal value) {
            addCriterion("loanAmount >", value, "loanamount");
            return (Criteria) this;
        }

        public Criteria andLoanamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("loanAmount >=", value, "loanamount");
            return (Criteria) this;
        }

        public Criteria andLoanamountLessThan(BigDecimal value) {
            addCriterion("loanAmount <", value, "loanamount");
            return (Criteria) this;
        }

        public Criteria andLoanamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("loanAmount <=", value, "loanamount");
            return (Criteria) this;
        }

        public Criteria andLoanamountIn(List<BigDecimal> values) {
            addCriterion("loanAmount in", values, "loanamount");
            return (Criteria) this;
        }

        public Criteria andLoanamountNotIn(List<BigDecimal> values) {
            addCriterion("loanAmount not in", values, "loanamount");
            return (Criteria) this;
        }

        public Criteria andLoanamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("loanAmount between", value1, value2, "loanamount");
            return (Criteria) this;
        }

        public Criteria andLoanamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("loanAmount not between", value1, value2, "loanamount");
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

        public Criteria andDeadlineIsNull() {
            addCriterion("deadline is null");
            return (Criteria) this;
        }

        public Criteria andDeadlineIsNotNull() {
            addCriterion("deadline is not null");
            return (Criteria) this;
        }

        public Criteria andDeadlineEqualTo(Integer value) {
            addCriterion("deadline =", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineNotEqualTo(Integer value) {
            addCriterion("deadline <>", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineGreaterThan(Integer value) {
            addCriterion("deadline >", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineGreaterThanOrEqualTo(Integer value) {
            addCriterion("deadline >=", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineLessThan(Integer value) {
            addCriterion("deadline <", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineLessThanOrEqualTo(Integer value) {
            addCriterion("deadline <=", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineIn(List<Integer> values) {
            addCriterion("deadline in", values, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineNotIn(List<Integer> values) {
            addCriterion("deadline not in", values, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineBetween(Integer value1, Integer value2) {
            addCriterion("deadline between", value1, value2, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineNotBetween(Integer value1, Integer value2) {
            addCriterion("deadline not between", value1, value2, "deadline");
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

        public Criteria andLoadnumberIsNull() {
            addCriterion("loadNumber is null");
            return (Criteria) this;
        }

        public Criteria andLoadnumberIsNotNull() {
            addCriterion("loadNumber is not null");
            return (Criteria) this;
        }

        public Criteria andLoadnumberEqualTo(Integer value) {
            addCriterion("loadNumber =", value, "loadnumber");
            return (Criteria) this;
        }

        public Criteria andLoadnumberNotEqualTo(Integer value) {
            addCriterion("loadNumber <>", value, "loadnumber");
            return (Criteria) this;
        }

        public Criteria andLoadnumberGreaterThan(Integer value) {
            addCriterion("loadNumber >", value, "loadnumber");
            return (Criteria) this;
        }

        public Criteria andLoadnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("loadNumber >=", value, "loadnumber");
            return (Criteria) this;
        }

        public Criteria andLoadnumberLessThan(Integer value) {
            addCriterion("loadNumber <", value, "loadnumber");
            return (Criteria) this;
        }

        public Criteria andLoadnumberLessThanOrEqualTo(Integer value) {
            addCriterion("loadNumber <=", value, "loadnumber");
            return (Criteria) this;
        }

        public Criteria andLoadnumberIn(List<Integer> values) {
            addCriterion("loadNumber in", values, "loadnumber");
            return (Criteria) this;
        }

        public Criteria andLoadnumberNotIn(List<Integer> values) {
            addCriterion("loadNumber not in", values, "loadnumber");
            return (Criteria) this;
        }

        public Criteria andLoadnumberBetween(Integer value1, Integer value2) {
            addCriterion("loadNumber between", value1, value2, "loadnumber");
            return (Criteria) this;
        }

        public Criteria andLoadnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("loadNumber not between", value1, value2, "loadnumber");
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

        public Criteria andCreattimeIsNull() {
            addCriterion("creatTime is null");
            return (Criteria) this;
        }

        public Criteria andCreattimeIsNotNull() {
            addCriterion("creatTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreattimeEqualTo(Date value) {
            addCriterion("creatTime =", value, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeNotEqualTo(Date value) {
            addCriterion("creatTime <>", value, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeGreaterThan(Date value) {
            addCriterion("creatTime >", value, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeGreaterThanOrEqualTo(Date value) {
            addCriterion("creatTime >=", value, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeLessThan(Date value) {
            addCriterion("creatTime <", value, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeLessThanOrEqualTo(Date value) {
            addCriterion("creatTime <=", value, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeIn(List<Date> values) {
            addCriterion("creatTime in", values, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeNotIn(List<Date> values) {
            addCriterion("creatTime not in", values, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeBetween(Date value1, Date value2) {
            addCriterion("creatTime between", value1, value2, "creattime");
            return (Criteria) this;
        }

        public Criteria andCreattimeNotBetween(Date value1, Date value2) {
            addCriterion("creatTime not between", value1, value2, "creattime");
            return (Criteria) this;
        }

        public Criteria andFirstinstanceIsNull() {
            addCriterion("firstInstance is null");
            return (Criteria) this;
        }

        public Criteria andFirstinstanceIsNotNull() {
            addCriterion("firstInstance is not null");
            return (Criteria) this;
        }

        public Criteria andFirstinstanceEqualTo(Integer value) {
            addCriterion("firstInstance =", value, "firstinstance");
            return (Criteria) this;
        }

        public Criteria andFirstinstanceNotEqualTo(Integer value) {
            addCriterion("firstInstance <>", value, "firstinstance");
            return (Criteria) this;
        }

        public Criteria andFirstinstanceGreaterThan(Integer value) {
            addCriterion("firstInstance >", value, "firstinstance");
            return (Criteria) this;
        }

        public Criteria andFirstinstanceGreaterThanOrEqualTo(Integer value) {
            addCriterion("firstInstance >=", value, "firstinstance");
            return (Criteria) this;
        }

        public Criteria andFirstinstanceLessThan(Integer value) {
            addCriterion("firstInstance <", value, "firstinstance");
            return (Criteria) this;
        }

        public Criteria andFirstinstanceLessThanOrEqualTo(Integer value) {
            addCriterion("firstInstance <=", value, "firstinstance");
            return (Criteria) this;
        }

        public Criteria andFirstinstanceIn(List<Integer> values) {
            addCriterion("firstInstance in", values, "firstinstance");
            return (Criteria) this;
        }

        public Criteria andFirstinstanceNotIn(List<Integer> values) {
            addCriterion("firstInstance not in", values, "firstinstance");
            return (Criteria) this;
        }

        public Criteria andFirstinstanceBetween(Integer value1, Integer value2) {
            addCriterion("firstInstance between", value1, value2, "firstinstance");
            return (Criteria) this;
        }

        public Criteria andFirstinstanceNotBetween(Integer value1, Integer value2) {
            addCriterion("firstInstance not between", value1, value2, "firstinstance");
            return (Criteria) this;
        }

        public Criteria andFinalinstanceIsNull() {
            addCriterion("finalInstance is null");
            return (Criteria) this;
        }

        public Criteria andFinalinstanceIsNotNull() {
            addCriterion("finalInstance is not null");
            return (Criteria) this;
        }

        public Criteria andFinalinstanceEqualTo(Integer value) {
            addCriterion("finalInstance =", value, "finalinstance");
            return (Criteria) this;
        }

        public Criteria andFinalinstanceNotEqualTo(Integer value) {
            addCriterion("finalInstance <>", value, "finalinstance");
            return (Criteria) this;
        }

        public Criteria andFinalinstanceGreaterThan(Integer value) {
            addCriterion("finalInstance >", value, "finalinstance");
            return (Criteria) this;
        }

        public Criteria andFinalinstanceGreaterThanOrEqualTo(Integer value) {
            addCriterion("finalInstance >=", value, "finalinstance");
            return (Criteria) this;
        }

        public Criteria andFinalinstanceLessThan(Integer value) {
            addCriterion("finalInstance <", value, "finalinstance");
            return (Criteria) this;
        }

        public Criteria andFinalinstanceLessThanOrEqualTo(Integer value) {
            addCriterion("finalInstance <=", value, "finalinstance");
            return (Criteria) this;
        }

        public Criteria andFinalinstanceIn(List<Integer> values) {
            addCriterion("finalInstance in", values, "finalinstance");
            return (Criteria) this;
        }

        public Criteria andFinalinstanceNotIn(List<Integer> values) {
            addCriterion("finalInstance not in", values, "finalinstance");
            return (Criteria) this;
        }

        public Criteria andFinalinstanceBetween(Integer value1, Integer value2) {
            addCriterion("finalInstance between", value1, value2, "finalinstance");
            return (Criteria) this;
        }

        public Criteria andFinalinstanceNotBetween(Integer value1, Integer value2) {
            addCriterion("finalInstance not between", value1, value2, "finalinstance");
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