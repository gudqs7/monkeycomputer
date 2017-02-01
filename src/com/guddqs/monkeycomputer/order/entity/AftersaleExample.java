package com.guddqs.monkeycomputer.order.entity;

import java.util.ArrayList;
import java.util.List;

public class AftersaleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AftersaleExample() {
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

        public Criteria andOrderidIsNull() {
            addCriterion("ORDERID is null");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNotNull() {
            addCriterion("ORDERID is not null");
            return (Criteria) this;
        }

        public Criteria andOrderidEqualTo(Integer value) {
            addCriterion("ORDERID =", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotEqualTo(Integer value) {
            addCriterion("ORDERID <>", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThan(Integer value) {
            addCriterion("ORDERID >", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ORDERID >=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThan(Integer value) {
            addCriterion("ORDERID <", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThanOrEqualTo(Integer value) {
            addCriterion("ORDERID <=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidIn(List<Integer> values) {
            addCriterion("ORDERID in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotIn(List<Integer> values) {
            addCriterion("ORDERID not in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidBetween(Integer value1, Integer value2) {
            addCriterion("ORDERID between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotBetween(Integer value1, Integer value2) {
            addCriterion("ORDERID not between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andProductidIsNull() {
            addCriterion("PRODUCTID is null");
            return (Criteria) this;
        }

        public Criteria andProductidIsNotNull() {
            addCriterion("PRODUCTID is not null");
            return (Criteria) this;
        }

        public Criteria andProductidEqualTo(Integer value) {
            addCriterion("PRODUCTID =", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotEqualTo(Integer value) {
            addCriterion("PRODUCTID <>", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidGreaterThan(Integer value) {
            addCriterion("PRODUCTID >", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidGreaterThanOrEqualTo(Integer value) {
            addCriterion("PRODUCTID >=", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidLessThan(Integer value) {
            addCriterion("PRODUCTID <", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidLessThanOrEqualTo(Integer value) {
            addCriterion("PRODUCTID <=", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidIn(List<Integer> values) {
            addCriterion("PRODUCTID in", values, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotIn(List<Integer> values) {
            addCriterion("PRODUCTID not in", values, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidBetween(Integer value1, Integer value2) {
            addCriterion("PRODUCTID between", value1, value2, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotBetween(Integer value1, Integer value2) {
            addCriterion("PRODUCTID not between", value1, value2, "productid");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("TYPE =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("TYPE <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("TYPE >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("TYPE >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("TYPE <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("TYPE <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("TYPE in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("TYPE not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("TYPE between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("TYPE not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andRefundpriceIsNull() {
            addCriterion("REFUNDPRICE is null");
            return (Criteria) this;
        }

        public Criteria andRefundpriceIsNotNull() {
            addCriterion("REFUNDPRICE is not null");
            return (Criteria) this;
        }

        public Criteria andRefundpriceEqualTo(Double value) {
            addCriterion("REFUNDPRICE =", value, "refundprice");
            return (Criteria) this;
        }

        public Criteria andRefundpriceNotEqualTo(Double value) {
            addCriterion("REFUNDPRICE <>", value, "refundprice");
            return (Criteria) this;
        }

        public Criteria andRefundpriceGreaterThan(Double value) {
            addCriterion("REFUNDPRICE >", value, "refundprice");
            return (Criteria) this;
        }

        public Criteria andRefundpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("REFUNDPRICE >=", value, "refundprice");
            return (Criteria) this;
        }

        public Criteria andRefundpriceLessThan(Double value) {
            addCriterion("REFUNDPRICE <", value, "refundprice");
            return (Criteria) this;
        }

        public Criteria andRefundpriceLessThanOrEqualTo(Double value) {
            addCriterion("REFUNDPRICE <=", value, "refundprice");
            return (Criteria) this;
        }

        public Criteria andRefundpriceIn(List<Double> values) {
            addCriterion("REFUNDPRICE in", values, "refundprice");
            return (Criteria) this;
        }

        public Criteria andRefundpriceNotIn(List<Double> values) {
            addCriterion("REFUNDPRICE not in", values, "refundprice");
            return (Criteria) this;
        }

        public Criteria andRefundpriceBetween(Double value1, Double value2) {
            addCriterion("REFUNDPRICE between", value1, value2, "refundprice");
            return (Criteria) this;
        }

        public Criteria andRefundpriceNotBetween(Double value1, Double value2) {
            addCriterion("REFUNDPRICE not between", value1, value2, "refundprice");
            return (Criteria) this;
        }

        public Criteria andCopyIsNull() {
            addCriterion("COPY is null");
            return (Criteria) this;
        }

        public Criteria andCopyIsNotNull() {
            addCriterion("COPY is not null");
            return (Criteria) this;
        }

        public Criteria andCopyEqualTo(String value) {
            addCriterion("COPY =", value, "copy");
            return (Criteria) this;
        }

        public Criteria andCopyNotEqualTo(String value) {
            addCriterion("COPY <>", value, "copy");
            return (Criteria) this;
        }

        public Criteria andCopyGreaterThan(String value) {
            addCriterion("COPY >", value, "copy");
            return (Criteria) this;
        }

        public Criteria andCopyGreaterThanOrEqualTo(String value) {
            addCriterion("COPY >=", value, "copy");
            return (Criteria) this;
        }

        public Criteria andCopyLessThan(String value) {
            addCriterion("COPY <", value, "copy");
            return (Criteria) this;
        }

        public Criteria andCopyLessThanOrEqualTo(String value) {
            addCriterion("COPY <=", value, "copy");
            return (Criteria) this;
        }

        public Criteria andCopyLike(String value) {
            addCriterion("COPY like", value, "copy");
            return (Criteria) this;
        }

        public Criteria andCopyNotLike(String value) {
            addCriterion("COPY not like", value, "copy");
            return (Criteria) this;
        }

        public Criteria andCopyIn(List<String> values) {
            addCriterion("COPY in", values, "copy");
            return (Criteria) this;
        }

        public Criteria andCopyNotIn(List<String> values) {
            addCriterion("COPY not in", values, "copy");
            return (Criteria) this;
        }

        public Criteria andCopyBetween(String value1, String value2) {
            addCriterion("COPY between", value1, value2, "copy");
            return (Criteria) this;
        }

        public Criteria andCopyNotBetween(String value1, String value2) {
            addCriterion("COPY not between", value1, value2, "copy");
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

        public Criteria andLogisticidIsNull() {
            addCriterion("LOGISTICID is null");
            return (Criteria) this;
        }

        public Criteria andLogisticidIsNotNull() {
            addCriterion("LOGISTICID is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticidEqualTo(Integer value) {
            addCriterion("LOGISTICID =", value, "logisticid");
            return (Criteria) this;
        }

        public Criteria andLogisticidNotEqualTo(Integer value) {
            addCriterion("LOGISTICID <>", value, "logisticid");
            return (Criteria) this;
        }

        public Criteria andLogisticidGreaterThan(Integer value) {
            addCriterion("LOGISTICID >", value, "logisticid");
            return (Criteria) this;
        }

        public Criteria andLogisticidGreaterThanOrEqualTo(Integer value) {
            addCriterion("LOGISTICID >=", value, "logisticid");
            return (Criteria) this;
        }

        public Criteria andLogisticidLessThan(Integer value) {
            addCriterion("LOGISTICID <", value, "logisticid");
            return (Criteria) this;
        }

        public Criteria andLogisticidLessThanOrEqualTo(Integer value) {
            addCriterion("LOGISTICID <=", value, "logisticid");
            return (Criteria) this;
        }

        public Criteria andLogisticidIn(List<Integer> values) {
            addCriterion("LOGISTICID in", values, "logisticid");
            return (Criteria) this;
        }

        public Criteria andLogisticidNotIn(List<Integer> values) {
            addCriterion("LOGISTICID not in", values, "logisticid");
            return (Criteria) this;
        }

        public Criteria andLogisticidBetween(Integer value1, Integer value2) {
            addCriterion("LOGISTICID between", value1, value2, "logisticid");
            return (Criteria) this;
        }

        public Criteria andLogisticidNotBetween(Integer value1, Integer value2) {
            addCriterion("LOGISTICID not between", value1, value2, "logisticid");
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