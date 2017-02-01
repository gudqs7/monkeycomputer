package com.guddqs.monkeycomputer.other.entity;

import java.util.ArrayList;
import java.util.List;

public class ComputerknowledgeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ComputerknowledgeExample() {
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("TITLE is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("TITLE =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("TITLE <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("TITLE >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("TITLE >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("TITLE <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("TITLE <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("TITLE like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("TITLE not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("TITLE in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("TITLE not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("TITLE between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("TITLE not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andDetailIsNull() {
            addCriterion("DETAIL is null");
            return (Criteria) this;
        }

        public Criteria andDetailIsNotNull() {
            addCriterion("DETAIL is not null");
            return (Criteria) this;
        }

        public Criteria andDetailEqualTo(String value) {
            addCriterion("DETAIL =", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotEqualTo(String value) {
            addCriterion("DETAIL <>", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailGreaterThan(String value) {
            addCriterion("DETAIL >", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailGreaterThanOrEqualTo(String value) {
            addCriterion("DETAIL >=", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailLessThan(String value) {
            addCriterion("DETAIL <", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailLessThanOrEqualTo(String value) {
            addCriterion("DETAIL <=", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailLike(String value) {
            addCriterion("DETAIL like", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotLike(String value) {
            addCriterion("DETAIL not like", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailIn(List<String> values) {
            addCriterion("DETAIL in", values, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotIn(List<String> values) {
            addCriterion("DETAIL not in", values, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailBetween(String value1, String value2) {
            addCriterion("DETAIL between", value1, value2, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotBetween(String value1, String value2) {
            addCriterion("DETAIL not between", value1, value2, "detail");
            return (Criteria) this;
        }

        public Criteria andNeedfulIsNull() {
            addCriterion("NEEDFUL is null");
            return (Criteria) this;
        }

        public Criteria andNeedfulIsNotNull() {
            addCriterion("NEEDFUL is not null");
            return (Criteria) this;
        }

        public Criteria andNeedfulEqualTo(Integer value) {
            addCriterion("NEEDFUL =", value, "needful");
            return (Criteria) this;
        }

        public Criteria andNeedfulNotEqualTo(Integer value) {
            addCriterion("NEEDFUL <>", value, "needful");
            return (Criteria) this;
        }

        public Criteria andNeedfulGreaterThan(Integer value) {
            addCriterion("NEEDFUL >", value, "needful");
            return (Criteria) this;
        }

        public Criteria andNeedfulGreaterThanOrEqualTo(Integer value) {
            addCriterion("NEEDFUL >=", value, "needful");
            return (Criteria) this;
        }

        public Criteria andNeedfulLessThan(Integer value) {
            addCriterion("NEEDFUL <", value, "needful");
            return (Criteria) this;
        }

        public Criteria andNeedfulLessThanOrEqualTo(Integer value) {
            addCriterion("NEEDFUL <=", value, "needful");
            return (Criteria) this;
        }

        public Criteria andNeedfulIn(List<Integer> values) {
            addCriterion("NEEDFUL in", values, "needful");
            return (Criteria) this;
        }

        public Criteria andNeedfulNotIn(List<Integer> values) {
            addCriterion("NEEDFUL not in", values, "needful");
            return (Criteria) this;
        }

        public Criteria andNeedfulBetween(Integer value1, Integer value2) {
            addCriterion("NEEDFUL between", value1, value2, "needful");
            return (Criteria) this;
        }

        public Criteria andNeedfulNotBetween(Integer value1, Integer value2) {
            addCriterion("NEEDFUL not between", value1, value2, "needful");
            return (Criteria) this;
        }

        public Criteria andBadfulIsNull() {
            addCriterion("BADFUL is null");
            return (Criteria) this;
        }

        public Criteria andBadfulIsNotNull() {
            addCriterion("BADFUL is not null");
            return (Criteria) this;
        }

        public Criteria andBadfulEqualTo(Integer value) {
            addCriterion("BADFUL =", value, "badful");
            return (Criteria) this;
        }

        public Criteria andBadfulNotEqualTo(Integer value) {
            addCriterion("BADFUL <>", value, "badful");
            return (Criteria) this;
        }

        public Criteria andBadfulGreaterThan(Integer value) {
            addCriterion("BADFUL >", value, "badful");
            return (Criteria) this;
        }

        public Criteria andBadfulGreaterThanOrEqualTo(Integer value) {
            addCriterion("BADFUL >=", value, "badful");
            return (Criteria) this;
        }

        public Criteria andBadfulLessThan(Integer value) {
            addCriterion("BADFUL <", value, "badful");
            return (Criteria) this;
        }

        public Criteria andBadfulLessThanOrEqualTo(Integer value) {
            addCriterion("BADFUL <=", value, "badful");
            return (Criteria) this;
        }

        public Criteria andBadfulIn(List<Integer> values) {
            addCriterion("BADFUL in", values, "badful");
            return (Criteria) this;
        }

        public Criteria andBadfulNotIn(List<Integer> values) {
            addCriterion("BADFUL not in", values, "badful");
            return (Criteria) this;
        }

        public Criteria andBadfulBetween(Integer value1, Integer value2) {
            addCriterion("BADFUL between", value1, value2, "badful");
            return (Criteria) this;
        }

        public Criteria andBadfulNotBetween(Integer value1, Integer value2) {
            addCriterion("BADFUL not between", value1, value2, "badful");
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