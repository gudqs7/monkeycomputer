package com.guddqs.monkeycomputer.user.entity;

import java.util.ArrayList;
import java.util.List;

public class LoginExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LoginExample() {
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

        public Criteria andLoginidIsNull() {
            addCriterion("LOGINID is null");
            return (Criteria) this;
        }

        public Criteria andLoginidIsNotNull() {
            addCriterion("LOGINID is not null");
            return (Criteria) this;
        }

        public Criteria andLoginidEqualTo(Integer value) {
            addCriterion("LOGINID =", value, "loginid");
            return (Criteria) this;
        }

        public Criteria andLoginidNotEqualTo(Integer value) {
            addCriterion("LOGINID <>", value, "loginid");
            return (Criteria) this;
        }

        public Criteria andLoginidGreaterThan(Integer value) {
            addCriterion("LOGINID >", value, "loginid");
            return (Criteria) this;
        }

        public Criteria andLoginidGreaterThanOrEqualTo(Integer value) {
            addCriterion("LOGINID >=", value, "loginid");
            return (Criteria) this;
        }

        public Criteria andLoginidLessThan(Integer value) {
            addCriterion("LOGINID <", value, "loginid");
            return (Criteria) this;
        }

        public Criteria andLoginidLessThanOrEqualTo(Integer value) {
            addCriterion("LOGINID <=", value, "loginid");
            return (Criteria) this;
        }

        public Criteria andLoginidIn(List<Integer> values) {
            addCriterion("LOGINID in", values, "loginid");
            return (Criteria) this;
        }

        public Criteria andLoginidNotIn(List<Integer> values) {
            addCriterion("LOGINID not in", values, "loginid");
            return (Criteria) this;
        }

        public Criteria andLoginidBetween(Integer value1, Integer value2) {
            addCriterion("LOGINID between", value1, value2, "loginid");
            return (Criteria) this;
        }

        public Criteria andLoginidNotBetween(Integer value1, Integer value2) {
            addCriterion("LOGINID not between", value1, value2, "loginid");
            return (Criteria) this;
        }

        public Criteria andLoginnameIsNull() {
            addCriterion("LOGINNAME is null");
            return (Criteria) this;
        }

        public Criteria andLoginnameIsNotNull() {
            addCriterion("LOGINNAME is not null");
            return (Criteria) this;
        }

        public Criteria andLoginnameEqualTo(String value) {
            addCriterion("LOGINNAME =", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameNotEqualTo(String value) {
            addCriterion("LOGINNAME <>", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameGreaterThan(String value) {
            addCriterion("LOGINNAME >", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameGreaterThanOrEqualTo(String value) {
            addCriterion("LOGINNAME >=", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameLessThan(String value) {
            addCriterion("LOGINNAME <", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameLessThanOrEqualTo(String value) {
            addCriterion("LOGINNAME <=", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameLike(String value) {
            addCriterion("LOGINNAME like", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameNotLike(String value) {
            addCriterion("LOGINNAME not like", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameIn(List<String> values) {
            addCriterion("LOGINNAME in", values, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameNotIn(List<String> values) {
            addCriterion("LOGINNAME not in", values, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameBetween(String value1, String value2) {
            addCriterion("LOGINNAME between", value1, value2, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameNotBetween(String value1, String value2) {
            addCriterion("LOGINNAME not between", value1, value2, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginpwdIsNull() {
            addCriterion("LOGINPWD is null");
            return (Criteria) this;
        }

        public Criteria andLoginpwdIsNotNull() {
            addCriterion("LOGINPWD is not null");
            return (Criteria) this;
        }

        public Criteria andLoginpwdEqualTo(String value) {
            addCriterion("LOGINPWD =", value, "loginpwd");
            return (Criteria) this;
        }

        public Criteria andLoginpwdNotEqualTo(String value) {
            addCriterion("LOGINPWD <>", value, "loginpwd");
            return (Criteria) this;
        }

        public Criteria andLoginpwdGreaterThan(String value) {
            addCriterion("LOGINPWD >", value, "loginpwd");
            return (Criteria) this;
        }

        public Criteria andLoginpwdGreaterThanOrEqualTo(String value) {
            addCriterion("LOGINPWD >=", value, "loginpwd");
            return (Criteria) this;
        }

        public Criteria andLoginpwdLessThan(String value) {
            addCriterion("LOGINPWD <", value, "loginpwd");
            return (Criteria) this;
        }

        public Criteria andLoginpwdLessThanOrEqualTo(String value) {
            addCriterion("LOGINPWD <=", value, "loginpwd");
            return (Criteria) this;
        }

        public Criteria andLoginpwdLike(String value) {
            addCriterion("LOGINPWD like", value, "loginpwd");
            return (Criteria) this;
        }

        public Criteria andLoginpwdNotLike(String value) {
            addCriterion("LOGINPWD not like", value, "loginpwd");
            return (Criteria) this;
        }

        public Criteria andLoginpwdIn(List<String> values) {
            addCriterion("LOGINPWD in", values, "loginpwd");
            return (Criteria) this;
        }

        public Criteria andLoginpwdNotIn(List<String> values) {
            addCriterion("LOGINPWD not in", values, "loginpwd");
            return (Criteria) this;
        }

        public Criteria andLoginpwdBetween(String value1, String value2) {
            addCriterion("LOGINPWD between", value1, value2, "loginpwd");
            return (Criteria) this;
        }

        public Criteria andLoginpwdNotBetween(String value1, String value2) {
            addCriterion("LOGINPWD not between", value1, value2, "loginpwd");
            return (Criteria) this;
        }

        public Criteria andIsadminIsNull() {
            addCriterion("ISADMIN is null");
            return (Criteria) this;
        }

        public Criteria andIsadminIsNotNull() {
            addCriterion("ISADMIN is not null");
            return (Criteria) this;
        }

        public Criteria andIsadminEqualTo(Short value) {
            addCriterion("ISADMIN =", value, "isadmin");
            return (Criteria) this;
        }

        public Criteria andIsadminNotEqualTo(Short value) {
            addCriterion("ISADMIN <>", value, "isadmin");
            return (Criteria) this;
        }

        public Criteria andIsadminGreaterThan(Short value) {
            addCriterion("ISADMIN >", value, "isadmin");
            return (Criteria) this;
        }

        public Criteria andIsadminGreaterThanOrEqualTo(Short value) {
            addCriterion("ISADMIN >=", value, "isadmin");
            return (Criteria) this;
        }

        public Criteria andIsadminLessThan(Short value) {
            addCriterion("ISADMIN <", value, "isadmin");
            return (Criteria) this;
        }

        public Criteria andIsadminLessThanOrEqualTo(Short value) {
            addCriterion("ISADMIN <=", value, "isadmin");
            return (Criteria) this;
        }

        public Criteria andIsadminIn(List<Short> values) {
            addCriterion("ISADMIN in", values, "isadmin");
            return (Criteria) this;
        }

        public Criteria andIsadminNotIn(List<Short> values) {
            addCriterion("ISADMIN not in", values, "isadmin");
            return (Criteria) this;
        }

        public Criteria andIsadminBetween(Short value1, Short value2) {
            addCriterion("ISADMIN between", value1, value2, "isadmin");
            return (Criteria) this;
        }

        public Criteria andIsadminNotBetween(Short value1, Short value2) {
            addCriterion("ISADMIN not between", value1, value2, "isadmin");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("STATE is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("STATE is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("STATE =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("STATE <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("STATE >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("STATE >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("STATE <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("STATE <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("STATE in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("STATE not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("STATE between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("STATE not between", value1, value2, "state");
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