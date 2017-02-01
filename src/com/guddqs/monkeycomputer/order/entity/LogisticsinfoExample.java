package com.guddqs.monkeycomputer.order.entity;

import java.util.ArrayList;
import java.util.List;

public class LogisticsinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LogisticsinfoExample() {
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

        public Criteria andNoIsNull() {
            addCriterion("NO is null");
            return (Criteria) this;
        }

        public Criteria andNoIsNotNull() {
            addCriterion("NO is not null");
            return (Criteria) this;
        }

        public Criteria andNoEqualTo(String value) {
            addCriterion("NO =", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotEqualTo(String value) {
            addCriterion("NO <>", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoGreaterThan(String value) {
            addCriterion("NO >", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoGreaterThanOrEqualTo(String value) {
            addCriterion("NO >=", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoLessThan(String value) {
            addCriterion("NO <", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoLessThanOrEqualTo(String value) {
            addCriterion("NO <=", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoLike(String value) {
            addCriterion("NO like", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotLike(String value) {
            addCriterion("NO not like", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoIn(List<String> values) {
            addCriterion("NO in", values, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotIn(List<String> values) {
            addCriterion("NO not in", values, "no");
            return (Criteria) this;
        }

        public Criteria andNoBetween(String value1, String value2) {
            addCriterion("NO between", value1, value2, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotBetween(String value1, String value2) {
            addCriterion("NO not between", value1, value2, "no");
            return (Criteria) this;
        }

        public Criteria andLogisticpriceIsNull() {
            addCriterion("LOGISTICPRICE is null");
            return (Criteria) this;
        }

        public Criteria andLogisticpriceIsNotNull() {
            addCriterion("LOGISTICPRICE is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticpriceEqualTo(Double value) {
            addCriterion("LOGISTICPRICE =", value, "logisticprice");
            return (Criteria) this;
        }

        public Criteria andLogisticpriceNotEqualTo(Double value) {
            addCriterion("LOGISTICPRICE <>", value, "logisticprice");
            return (Criteria) this;
        }

        public Criteria andLogisticpriceGreaterThan(Double value) {
            addCriterion("LOGISTICPRICE >", value, "logisticprice");
            return (Criteria) this;
        }

        public Criteria andLogisticpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("LOGISTICPRICE >=", value, "logisticprice");
            return (Criteria) this;
        }

        public Criteria andLogisticpriceLessThan(Double value) {
            addCriterion("LOGISTICPRICE <", value, "logisticprice");
            return (Criteria) this;
        }

        public Criteria andLogisticpriceLessThanOrEqualTo(Double value) {
            addCriterion("LOGISTICPRICE <=", value, "logisticprice");
            return (Criteria) this;
        }

        public Criteria andLogisticpriceIn(List<Double> values) {
            addCriterion("LOGISTICPRICE in", values, "logisticprice");
            return (Criteria) this;
        }

        public Criteria andLogisticpriceNotIn(List<Double> values) {
            addCriterion("LOGISTICPRICE not in", values, "logisticprice");
            return (Criteria) this;
        }

        public Criteria andLogisticpriceBetween(Double value1, Double value2) {
            addCriterion("LOGISTICPRICE between", value1, value2, "logisticprice");
            return (Criteria) this;
        }

        public Criteria andLogisticpriceNotBetween(Double value1, Double value2) {
            addCriterion("LOGISTICPRICE not between", value1, value2, "logisticprice");
            return (Criteria) this;
        }

        public Criteria andLogisticbrandIsNull() {
            addCriterion("LOGISTICBRAND is null");
            return (Criteria) this;
        }

        public Criteria andLogisticbrandIsNotNull() {
            addCriterion("LOGISTICBRAND is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticbrandEqualTo(String value) {
            addCriterion("LOGISTICBRAND =", value, "logisticbrand");
            return (Criteria) this;
        }

        public Criteria andLogisticbrandNotEqualTo(String value) {
            addCriterion("LOGISTICBRAND <>", value, "logisticbrand");
            return (Criteria) this;
        }

        public Criteria andLogisticbrandGreaterThan(String value) {
            addCriterion("LOGISTICBRAND >", value, "logisticbrand");
            return (Criteria) this;
        }

        public Criteria andLogisticbrandGreaterThanOrEqualTo(String value) {
            addCriterion("LOGISTICBRAND >=", value, "logisticbrand");
            return (Criteria) this;
        }

        public Criteria andLogisticbrandLessThan(String value) {
            addCriterion("LOGISTICBRAND <", value, "logisticbrand");
            return (Criteria) this;
        }

        public Criteria andLogisticbrandLessThanOrEqualTo(String value) {
            addCriterion("LOGISTICBRAND <=", value, "logisticbrand");
            return (Criteria) this;
        }

        public Criteria andLogisticbrandLike(String value) {
            addCriterion("LOGISTICBRAND like", value, "logisticbrand");
            return (Criteria) this;
        }

        public Criteria andLogisticbrandNotLike(String value) {
            addCriterion("LOGISTICBRAND not like", value, "logisticbrand");
            return (Criteria) this;
        }

        public Criteria andLogisticbrandIn(List<String> values) {
            addCriterion("LOGISTICBRAND in", values, "logisticbrand");
            return (Criteria) this;
        }

        public Criteria andLogisticbrandNotIn(List<String> values) {
            addCriterion("LOGISTICBRAND not in", values, "logisticbrand");
            return (Criteria) this;
        }

        public Criteria andLogisticbrandBetween(String value1, String value2) {
            addCriterion("LOGISTICBRAND between", value1, value2, "logisticbrand");
            return (Criteria) this;
        }

        public Criteria andLogisticbrandNotBetween(String value1, String value2) {
            addCriterion("LOGISTICBRAND not between", value1, value2, "logisticbrand");
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