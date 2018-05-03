package com.dpzain.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PerblogWordsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public PerblogWordsExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andWordsIdIsNull() {
            addCriterion("words_id is null");
            return (Criteria) this;
        }

        public Criteria andWordsIdIsNotNull() {
            addCriterion("words_id is not null");
            return (Criteria) this;
        }

        public Criteria andWordsIdEqualTo(String value) {
            addCriterion("words_id =", value, "wordsId");
            return (Criteria) this;
        }

        public Criteria andWordsIdNotEqualTo(String value) {
            addCriterion("words_id <>", value, "wordsId");
            return (Criteria) this;
        }

        public Criteria andWordsIdGreaterThan(String value) {
            addCriterion("words_id >", value, "wordsId");
            return (Criteria) this;
        }

        public Criteria andWordsIdGreaterThanOrEqualTo(String value) {
            addCriterion("words_id >=", value, "wordsId");
            return (Criteria) this;
        }

        public Criteria andWordsIdLessThan(String value) {
            addCriterion("words_id <", value, "wordsId");
            return (Criteria) this;
        }

        public Criteria andWordsIdLessThanOrEqualTo(String value) {
            addCriterion("words_id <=", value, "wordsId");
            return (Criteria) this;
        }

        public Criteria andWordsIdLike(String value) {
            addCriterion("words_id like", value, "wordsId");
            return (Criteria) this;
        }

        public Criteria andWordsIdNotLike(String value) {
            addCriterion("words_id not like", value, "wordsId");
            return (Criteria) this;
        }

        public Criteria andWordsIdIn(List<String> values) {
            addCriterion("words_id in", values, "wordsId");
            return (Criteria) this;
        }

        public Criteria andWordsIdNotIn(List<String> values) {
            addCriterion("words_id not in", values, "wordsId");
            return (Criteria) this;
        }

        public Criteria andWordsIdBetween(String value1, String value2) {
            addCriterion("words_id between", value1, value2, "wordsId");
            return (Criteria) this;
        }

        public Criteria andWordsIdNotBetween(String value1, String value2) {
            addCriterion("words_id not between", value1, value2, "wordsId");
            return (Criteria) this;
        }

        public Criteria andWordsUserIdIsNull() {
            addCriterion("words_user_id is null");
            return (Criteria) this;
        }

        public Criteria andWordsUserIdIsNotNull() {
            addCriterion("words_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andWordsUserIdEqualTo(String value) {
            addCriterion("words_user_id =", value, "wordsUserId");
            return (Criteria) this;
        }

        public Criteria andWordsUserIdNotEqualTo(String value) {
            addCriterion("words_user_id <>", value, "wordsUserId");
            return (Criteria) this;
        }

        public Criteria andWordsUserIdGreaterThan(String value) {
            addCriterion("words_user_id >", value, "wordsUserId");
            return (Criteria) this;
        }

        public Criteria andWordsUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("words_user_id >=", value, "wordsUserId");
            return (Criteria) this;
        }

        public Criteria andWordsUserIdLessThan(String value) {
            addCriterion("words_user_id <", value, "wordsUserId");
            return (Criteria) this;
        }

        public Criteria andWordsUserIdLessThanOrEqualTo(String value) {
            addCriterion("words_user_id <=", value, "wordsUserId");
            return (Criteria) this;
        }

        public Criteria andWordsUserIdLike(String value) {
            addCriterion("words_user_id like", value, "wordsUserId");
            return (Criteria) this;
        }

        public Criteria andWordsUserIdNotLike(String value) {
            addCriterion("words_user_id not like", value, "wordsUserId");
            return (Criteria) this;
        }

        public Criteria andWordsUserIdIn(List<String> values) {
            addCriterion("words_user_id in", values, "wordsUserId");
            return (Criteria) this;
        }

        public Criteria andWordsUserIdNotIn(List<String> values) {
            addCriterion("words_user_id not in", values, "wordsUserId");
            return (Criteria) this;
        }

        public Criteria andWordsUserIdBetween(String value1, String value2) {
            addCriterion("words_user_id between", value1, value2, "wordsUserId");
            return (Criteria) this;
        }

        public Criteria andWordsUserIdNotBetween(String value1, String value2) {
            addCriterion("words_user_id not between", value1, value2, "wordsUserId");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }
    }

    /**
     */
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