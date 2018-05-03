package com.dpzain.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PerblogCommentsBackExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public PerblogCommentsBackExample() {
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

        public Criteria andBackIdIsNull() {
            addCriterion("back_id is null");
            return (Criteria) this;
        }

        public Criteria andBackIdIsNotNull() {
            addCriterion("back_id is not null");
            return (Criteria) this;
        }

        public Criteria andBackIdEqualTo(String value) {
            addCriterion("back_id =", value, "backId");
            return (Criteria) this;
        }

        public Criteria andBackIdNotEqualTo(String value) {
            addCriterion("back_id <>", value, "backId");
            return (Criteria) this;
        }

        public Criteria andBackIdGreaterThan(String value) {
            addCriterion("back_id >", value, "backId");
            return (Criteria) this;
        }

        public Criteria andBackIdGreaterThanOrEqualTo(String value) {
            addCriterion("back_id >=", value, "backId");
            return (Criteria) this;
        }

        public Criteria andBackIdLessThan(String value) {
            addCriterion("back_id <", value, "backId");
            return (Criteria) this;
        }

        public Criteria andBackIdLessThanOrEqualTo(String value) {
            addCriterion("back_id <=", value, "backId");
            return (Criteria) this;
        }

        public Criteria andBackIdLike(String value) {
            addCriterion("back_id like", value, "backId");
            return (Criteria) this;
        }

        public Criteria andBackIdNotLike(String value) {
            addCriterion("back_id not like", value, "backId");
            return (Criteria) this;
        }

        public Criteria andBackIdIn(List<String> values) {
            addCriterion("back_id in", values, "backId");
            return (Criteria) this;
        }

        public Criteria andBackIdNotIn(List<String> values) {
            addCriterion("back_id not in", values, "backId");
            return (Criteria) this;
        }

        public Criteria andBackIdBetween(String value1, String value2) {
            addCriterion("back_id between", value1, value2, "backId");
            return (Criteria) this;
        }

        public Criteria andBackIdNotBetween(String value1, String value2) {
            addCriterion("back_id not between", value1, value2, "backId");
            return (Criteria) this;
        }

        public Criteria andBackUserIdByIsNull() {
            addCriterion("back_user_id_by is null");
            return (Criteria) this;
        }

        public Criteria andBackUserIdByIsNotNull() {
            addCriterion("back_user_id_by is not null");
            return (Criteria) this;
        }

        public Criteria andBackUserIdByEqualTo(String value) {
            addCriterion("back_user_id_by =", value, "backUserIdBy");
            return (Criteria) this;
        }

        public Criteria andBackUserIdByNotEqualTo(String value) {
            addCriterion("back_user_id_by <>", value, "backUserIdBy");
            return (Criteria) this;
        }

        public Criteria andBackUserIdByGreaterThan(String value) {
            addCriterion("back_user_id_by >", value, "backUserIdBy");
            return (Criteria) this;
        }

        public Criteria andBackUserIdByGreaterThanOrEqualTo(String value) {
            addCriterion("back_user_id_by >=", value, "backUserIdBy");
            return (Criteria) this;
        }

        public Criteria andBackUserIdByLessThan(String value) {
            addCriterion("back_user_id_by <", value, "backUserIdBy");
            return (Criteria) this;
        }

        public Criteria andBackUserIdByLessThanOrEqualTo(String value) {
            addCriterion("back_user_id_by <=", value, "backUserIdBy");
            return (Criteria) this;
        }

        public Criteria andBackUserIdByLike(String value) {
            addCriterion("back_user_id_by like", value, "backUserIdBy");
            return (Criteria) this;
        }

        public Criteria andBackUserIdByNotLike(String value) {
            addCriterion("back_user_id_by not like", value, "backUserIdBy");
            return (Criteria) this;
        }

        public Criteria andBackUserIdByIn(List<String> values) {
            addCriterion("back_user_id_by in", values, "backUserIdBy");
            return (Criteria) this;
        }

        public Criteria andBackUserIdByNotIn(List<String> values) {
            addCriterion("back_user_id_by not in", values, "backUserIdBy");
            return (Criteria) this;
        }

        public Criteria andBackUserIdByBetween(String value1, String value2) {
            addCriterion("back_user_id_by between", value1, value2, "backUserIdBy");
            return (Criteria) this;
        }

        public Criteria andBackUserIdByNotBetween(String value1, String value2) {
            addCriterion("back_user_id_by not between", value1, value2, "backUserIdBy");
            return (Criteria) this;
        }

        public Criteria andCommentsIdIsNull() {
            addCriterion("comments_id is null");
            return (Criteria) this;
        }

        public Criteria andCommentsIdIsNotNull() {
            addCriterion("comments_id is not null");
            return (Criteria) this;
        }

        public Criteria andCommentsIdEqualTo(String value) {
            addCriterion("comments_id =", value, "commentsId");
            return (Criteria) this;
        }

        public Criteria andCommentsIdNotEqualTo(String value) {
            addCriterion("comments_id <>", value, "commentsId");
            return (Criteria) this;
        }

        public Criteria andCommentsIdGreaterThan(String value) {
            addCriterion("comments_id >", value, "commentsId");
            return (Criteria) this;
        }

        public Criteria andCommentsIdGreaterThanOrEqualTo(String value) {
            addCriterion("comments_id >=", value, "commentsId");
            return (Criteria) this;
        }

        public Criteria andCommentsIdLessThan(String value) {
            addCriterion("comments_id <", value, "commentsId");
            return (Criteria) this;
        }

        public Criteria andCommentsIdLessThanOrEqualTo(String value) {
            addCriterion("comments_id <=", value, "commentsId");
            return (Criteria) this;
        }

        public Criteria andCommentsIdLike(String value) {
            addCriterion("comments_id like", value, "commentsId");
            return (Criteria) this;
        }

        public Criteria andCommentsIdNotLike(String value) {
            addCriterion("comments_id not like", value, "commentsId");
            return (Criteria) this;
        }

        public Criteria andCommentsIdIn(List<String> values) {
            addCriterion("comments_id in", values, "commentsId");
            return (Criteria) this;
        }

        public Criteria andCommentsIdNotIn(List<String> values) {
            addCriterion("comments_id not in", values, "commentsId");
            return (Criteria) this;
        }

        public Criteria andCommentsIdBetween(String value1, String value2) {
            addCriterion("comments_id between", value1, value2, "commentsId");
            return (Criteria) this;
        }

        public Criteria andCommentsIdNotBetween(String value1, String value2) {
            addCriterion("comments_id not between", value1, value2, "commentsId");
            return (Criteria) this;
        }

        public Criteria andBackUserIdToIsNull() {
            addCriterion("back_user_id_to is null");
            return (Criteria) this;
        }

        public Criteria andBackUserIdToIsNotNull() {
            addCriterion("back_user_id_to is not null");
            return (Criteria) this;
        }

        public Criteria andBackUserIdToEqualTo(String value) {
            addCriterion("back_user_id_to =", value, "backUserIdTo");
            return (Criteria) this;
        }

        public Criteria andBackUserIdToNotEqualTo(String value) {
            addCriterion("back_user_id_to <>", value, "backUserIdTo");
            return (Criteria) this;
        }

        public Criteria andBackUserIdToGreaterThan(String value) {
            addCriterion("back_user_id_to >", value, "backUserIdTo");
            return (Criteria) this;
        }

        public Criteria andBackUserIdToGreaterThanOrEqualTo(String value) {
            addCriterion("back_user_id_to >=", value, "backUserIdTo");
            return (Criteria) this;
        }

        public Criteria andBackUserIdToLessThan(String value) {
            addCriterion("back_user_id_to <", value, "backUserIdTo");
            return (Criteria) this;
        }

        public Criteria andBackUserIdToLessThanOrEqualTo(String value) {
            addCriterion("back_user_id_to <=", value, "backUserIdTo");
            return (Criteria) this;
        }

        public Criteria andBackUserIdToLike(String value) {
            addCriterion("back_user_id_to like", value, "backUserIdTo");
            return (Criteria) this;
        }

        public Criteria andBackUserIdToNotLike(String value) {
            addCriterion("back_user_id_to not like", value, "backUserIdTo");
            return (Criteria) this;
        }

        public Criteria andBackUserIdToIn(List<String> values) {
            addCriterion("back_user_id_to in", values, "backUserIdTo");
            return (Criteria) this;
        }

        public Criteria andBackUserIdToNotIn(List<String> values) {
            addCriterion("back_user_id_to not in", values, "backUserIdTo");
            return (Criteria) this;
        }

        public Criteria andBackUserIdToBetween(String value1, String value2) {
            addCriterion("back_user_id_to between", value1, value2, "backUserIdTo");
            return (Criteria) this;
        }

        public Criteria andBackUserIdToNotBetween(String value1, String value2) {
            addCriterion("back_user_id_to not between", value1, value2, "backUserIdTo");
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