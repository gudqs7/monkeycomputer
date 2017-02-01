package com.guddqs.monkeycomputer.order.entity;

import java.util.ArrayList;
import java.util.List;

public class EvaluationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EvaluationExample() {
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

        public Criteria andDescriptionIsNull() {
            addCriterion("DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("DESCRIPTION =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("DESCRIPTION <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("DESCRIPTION >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("DESCRIPTION <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("DESCRIPTION like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("DESCRIPTION not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("DESCRIPTION in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("DESCRIPTION not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("DESCRIPTION between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("DESCRIPTION not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andPicsIsNull() {
            addCriterion("PICS is null");
            return (Criteria) this;
        }

        public Criteria andPicsIsNotNull() {
            addCriterion("PICS is not null");
            return (Criteria) this;
        }

        public Criteria andPicsEqualTo(String value) {
            addCriterion("PICS =", value, "pics");
            return (Criteria) this;
        }

        public Criteria andPicsNotEqualTo(String value) {
            addCriterion("PICS <>", value, "pics");
            return (Criteria) this;
        }

        public Criteria andPicsGreaterThan(String value) {
            addCriterion("PICS >", value, "pics");
            return (Criteria) this;
        }

        public Criteria andPicsGreaterThanOrEqualTo(String value) {
            addCriterion("PICS >=", value, "pics");
            return (Criteria) this;
        }

        public Criteria andPicsLessThan(String value) {
            addCriterion("PICS <", value, "pics");
            return (Criteria) this;
        }

        public Criteria andPicsLessThanOrEqualTo(String value) {
            addCriterion("PICS <=", value, "pics");
            return (Criteria) this;
        }

        public Criteria andPicsLike(String value) {
            addCriterion("PICS like", value, "pics");
            return (Criteria) this;
        }

        public Criteria andPicsNotLike(String value) {
            addCriterion("PICS not like", value, "pics");
            return (Criteria) this;
        }

        public Criteria andPicsIn(List<String> values) {
            addCriterion("PICS in", values, "pics");
            return (Criteria) this;
        }

        public Criteria andPicsNotIn(List<String> values) {
            addCriterion("PICS not in", values, "pics");
            return (Criteria) this;
        }

        public Criteria andPicsBetween(String value1, String value2) {
            addCriterion("PICS between", value1, value2, "pics");
            return (Criteria) this;
        }

        public Criteria andPicsNotBetween(String value1, String value2) {
            addCriterion("PICS not between", value1, value2, "pics");
            return (Criteria) this;
        }

        public Criteria andProductlevelIsNull() {
            addCriterion("PRODUCTLEVEL is null");
            return (Criteria) this;
        }

        public Criteria andProductlevelIsNotNull() {
            addCriterion("PRODUCTLEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andProductlevelEqualTo(Integer value) {
            addCriterion("PRODUCTLEVEL =", value, "productlevel");
            return (Criteria) this;
        }

        public Criteria andProductlevelNotEqualTo(Integer value) {
            addCriterion("PRODUCTLEVEL <>", value, "productlevel");
            return (Criteria) this;
        }

        public Criteria andProductlevelGreaterThan(Integer value) {
            addCriterion("PRODUCTLEVEL >", value, "productlevel");
            return (Criteria) this;
        }

        public Criteria andProductlevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("PRODUCTLEVEL >=", value, "productlevel");
            return (Criteria) this;
        }

        public Criteria andProductlevelLessThan(Integer value) {
            addCriterion("PRODUCTLEVEL <", value, "productlevel");
            return (Criteria) this;
        }

        public Criteria andProductlevelLessThanOrEqualTo(Integer value) {
            addCriterion("PRODUCTLEVEL <=", value, "productlevel");
            return (Criteria) this;
        }

        public Criteria andProductlevelIn(List<Integer> values) {
            addCriterion("PRODUCTLEVEL in", values, "productlevel");
            return (Criteria) this;
        }

        public Criteria andProductlevelNotIn(List<Integer> values) {
            addCriterion("PRODUCTLEVEL not in", values, "productlevel");
            return (Criteria) this;
        }

        public Criteria andProductlevelBetween(Integer value1, Integer value2) {
            addCriterion("PRODUCTLEVEL between", value1, value2, "productlevel");
            return (Criteria) this;
        }

        public Criteria andProductlevelNotBetween(Integer value1, Integer value2) {
            addCriterion("PRODUCTLEVEL not between", value1, value2, "productlevel");
            return (Criteria) this;
        }

        public Criteria andSendlevelIsNull() {
            addCriterion("SENDLEVEL is null");
            return (Criteria) this;
        }

        public Criteria andSendlevelIsNotNull() {
            addCriterion("SENDLEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andSendlevelEqualTo(Integer value) {
            addCriterion("SENDLEVEL =", value, "sendlevel");
            return (Criteria) this;
        }

        public Criteria andSendlevelNotEqualTo(Integer value) {
            addCriterion("SENDLEVEL <>", value, "sendlevel");
            return (Criteria) this;
        }

        public Criteria andSendlevelGreaterThan(Integer value) {
            addCriterion("SENDLEVEL >", value, "sendlevel");
            return (Criteria) this;
        }

        public Criteria andSendlevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("SENDLEVEL >=", value, "sendlevel");
            return (Criteria) this;
        }

        public Criteria andSendlevelLessThan(Integer value) {
            addCriterion("SENDLEVEL <", value, "sendlevel");
            return (Criteria) this;
        }

        public Criteria andSendlevelLessThanOrEqualTo(Integer value) {
            addCriterion("SENDLEVEL <=", value, "sendlevel");
            return (Criteria) this;
        }

        public Criteria andSendlevelIn(List<Integer> values) {
            addCriterion("SENDLEVEL in", values, "sendlevel");
            return (Criteria) this;
        }

        public Criteria andSendlevelNotIn(List<Integer> values) {
            addCriterion("SENDLEVEL not in", values, "sendlevel");
            return (Criteria) this;
        }

        public Criteria andSendlevelBetween(Integer value1, Integer value2) {
            addCriterion("SENDLEVEL between", value1, value2, "sendlevel");
            return (Criteria) this;
        }

        public Criteria andSendlevelNotBetween(Integer value1, Integer value2) {
            addCriterion("SENDLEVEL not between", value1, value2, "sendlevel");
            return (Criteria) this;
        }

        public Criteria andLogisticslevelIsNull() {
            addCriterion("LOGISTICSLEVEL is null");
            return (Criteria) this;
        }

        public Criteria andLogisticslevelIsNotNull() {
            addCriterion("LOGISTICSLEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticslevelEqualTo(Integer value) {
            addCriterion("LOGISTICSLEVEL =", value, "logisticslevel");
            return (Criteria) this;
        }

        public Criteria andLogisticslevelNotEqualTo(Integer value) {
            addCriterion("LOGISTICSLEVEL <>", value, "logisticslevel");
            return (Criteria) this;
        }

        public Criteria andLogisticslevelGreaterThan(Integer value) {
            addCriterion("LOGISTICSLEVEL >", value, "logisticslevel");
            return (Criteria) this;
        }

        public Criteria andLogisticslevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("LOGISTICSLEVEL >=", value, "logisticslevel");
            return (Criteria) this;
        }

        public Criteria andLogisticslevelLessThan(Integer value) {
            addCriterion("LOGISTICSLEVEL <", value, "logisticslevel");
            return (Criteria) this;
        }

        public Criteria andLogisticslevelLessThanOrEqualTo(Integer value) {
            addCriterion("LOGISTICSLEVEL <=", value, "logisticslevel");
            return (Criteria) this;
        }

        public Criteria andLogisticslevelIn(List<Integer> values) {
            addCriterion("LOGISTICSLEVEL in", values, "logisticslevel");
            return (Criteria) this;
        }

        public Criteria andLogisticslevelNotIn(List<Integer> values) {
            addCriterion("LOGISTICSLEVEL not in", values, "logisticslevel");
            return (Criteria) this;
        }

        public Criteria andLogisticslevelBetween(Integer value1, Integer value2) {
            addCriterion("LOGISTICSLEVEL between", value1, value2, "logisticslevel");
            return (Criteria) this;
        }

        public Criteria andLogisticslevelNotBetween(Integer value1, Integer value2) {
            addCriterion("LOGISTICSLEVEL not between", value1, value2, "logisticslevel");
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