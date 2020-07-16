package com.zcy.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class YourDiaryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public YourDiaryExample() {
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

        public Criteria andDiaryIdIsNull() {
            addCriterion("diary_id is null");
            return (Criteria) this;
        }

        public Criteria andDiaryIdIsNotNull() {
            addCriterion("diary_id is not null");
            return (Criteria) this;
        }

        public Criteria andDiaryIdEqualTo(Long value) {
            addCriterion("diary_id =", value, "diaryId");
            return (Criteria) this;
        }

        public Criteria andDiaryIdNotEqualTo(Long value) {
            addCriterion("diary_id <>", value, "diaryId");
            return (Criteria) this;
        }

        public Criteria andDiaryIdGreaterThan(Long value) {
            addCriterion("diary_id >", value, "diaryId");
            return (Criteria) this;
        }

        public Criteria andDiaryIdGreaterThanOrEqualTo(Long value) {
            addCriterion("diary_id >=", value, "diaryId");
            return (Criteria) this;
        }

        public Criteria andDiaryIdLessThan(Long value) {
            addCriterion("diary_id <", value, "diaryId");
            return (Criteria) this;
        }

        public Criteria andDiaryIdLessThanOrEqualTo(Long value) {
            addCriterion("diary_id <=", value, "diaryId");
            return (Criteria) this;
        }

        public Criteria andDiaryIdIn(List<Long> values) {
            addCriterion("diary_id in", values, "diaryId");
            return (Criteria) this;
        }

        public Criteria andDiaryIdNotIn(List<Long> values) {
            addCriterion("diary_id not in", values, "diaryId");
            return (Criteria) this;
        }

        public Criteria andDiaryIdBetween(Long value1, Long value2) {
            addCriterion("diary_id between", value1, value2, "diaryId");
            return (Criteria) this;
        }

        public Criteria andDiaryIdNotBetween(Long value1, Long value2) {
            addCriterion("diary_id not between", value1, value2, "diaryId");
            return (Criteria) this;
        }

        public Criteria andDiaryUserIdIsNull() {
            addCriterion("diary_user_id is null");
            return (Criteria) this;
        }

        public Criteria andDiaryUserIdIsNotNull() {
            addCriterion("diary_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andDiaryUserIdEqualTo(Long value) {
            addCriterion("diary_user_id =", value, "diaryUserId");
            return (Criteria) this;
        }

        public Criteria andDiaryUserIdNotEqualTo(Long value) {
            addCriterion("diary_user_id <>", value, "diaryUserId");
            return (Criteria) this;
        }

        public Criteria andDiaryUserIdGreaterThan(Long value) {
            addCriterion("diary_user_id >", value, "diaryUserId");
            return (Criteria) this;
        }

        public Criteria andDiaryUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("diary_user_id >=", value, "diaryUserId");
            return (Criteria) this;
        }

        public Criteria andDiaryUserIdLessThan(Long value) {
            addCriterion("diary_user_id <", value, "diaryUserId");
            return (Criteria) this;
        }

        public Criteria andDiaryUserIdLessThanOrEqualTo(Long value) {
            addCriterion("diary_user_id <=", value, "diaryUserId");
            return (Criteria) this;
        }

        public Criteria andDiaryUserIdIn(List<Long> values) {
            addCriterion("diary_user_id in", values, "diaryUserId");
            return (Criteria) this;
        }

        public Criteria andDiaryUserIdNotIn(List<Long> values) {
            addCriterion("diary_user_id not in", values, "diaryUserId");
            return (Criteria) this;
        }

        public Criteria andDiaryUserIdBetween(Long value1, Long value2) {
            addCriterion("diary_user_id between", value1, value2, "diaryUserId");
            return (Criteria) this;
        }

        public Criteria andDiaryUserIdNotBetween(Long value1, Long value2) {
            addCriterion("diary_user_id not between", value1, value2, "diaryUserId");
            return (Criteria) this;
        }

        public Criteria andDiaryCreateTimeIsNull() {
            addCriterion("diary_create_time is null");
            return (Criteria) this;
        }

        public Criteria andDiaryCreateTimeIsNotNull() {
            addCriterion("diary_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andDiaryCreateTimeEqualTo(Date value) {
            addCriterion("diary_create_time =", value, "diaryCreateTime");
            return (Criteria) this;
        }

        public Criteria andDiaryCreateTimeNotEqualTo(Date value) {
            addCriterion("diary_create_time <>", value, "diaryCreateTime");
            return (Criteria) this;
        }

        public Criteria andDiaryCreateTimeGreaterThan(Date value) {
            addCriterion("diary_create_time >", value, "diaryCreateTime");
            return (Criteria) this;
        }

        public Criteria andDiaryCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("diary_create_time >=", value, "diaryCreateTime");
            return (Criteria) this;
        }

        public Criteria andDiaryCreateTimeLessThan(Date value) {
            addCriterion("diary_create_time <", value, "diaryCreateTime");
            return (Criteria) this;
        }

        public Criteria andDiaryCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("diary_create_time <=", value, "diaryCreateTime");
            return (Criteria) this;
        }

        public Criteria andDiaryCreateTimeIn(List<Date> values) {
            addCriterion("diary_create_time in", values, "diaryCreateTime");
            return (Criteria) this;
        }

        public Criteria andDiaryCreateTimeNotIn(List<Date> values) {
            addCriterion("diary_create_time not in", values, "diaryCreateTime");
            return (Criteria) this;
        }

        public Criteria andDiaryCreateTimeBetween(Date value1, Date value2) {
            addCriterion("diary_create_time between", value1, value2, "diaryCreateTime");
            return (Criteria) this;
        }

        public Criteria andDiaryCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("diary_create_time not between", value1, value2, "diaryCreateTime");
            return (Criteria) this;
        }

        public Criteria andDiaryStatusIsNull() {
            addCriterion("diary_status is null");
            return (Criteria) this;
        }

        public Criteria andDiaryStatusIsNotNull() {
            addCriterion("diary_status is not null");
            return (Criteria) this;
        }

        public Criteria andDiaryStatusEqualTo(String value) {
            addCriterion("diary_status =", value, "diaryStatus");
            return (Criteria) this;
        }

        public Criteria andDiaryStatusNotEqualTo(String value) {
            addCriterion("diary_status <>", value, "diaryStatus");
            return (Criteria) this;
        }

        public Criteria andDiaryStatusGreaterThan(String value) {
            addCriterion("diary_status >", value, "diaryStatus");
            return (Criteria) this;
        }

        public Criteria andDiaryStatusGreaterThanOrEqualTo(String value) {
            addCriterion("diary_status >=", value, "diaryStatus");
            return (Criteria) this;
        }

        public Criteria andDiaryStatusLessThan(String value) {
            addCriterion("diary_status <", value, "diaryStatus");
            return (Criteria) this;
        }

        public Criteria andDiaryStatusLessThanOrEqualTo(String value) {
            addCriterion("diary_status <=", value, "diaryStatus");
            return (Criteria) this;
        }

        public Criteria andDiaryStatusLike(String value) {
            addCriterion("diary_status like", value, "diaryStatus");
            return (Criteria) this;
        }

        public Criteria andDiaryStatusNotLike(String value) {
            addCriterion("diary_status not like", value, "diaryStatus");
            return (Criteria) this;
        }

        public Criteria andDiaryStatusIn(List<String> values) {
            addCriterion("diary_status in", values, "diaryStatus");
            return (Criteria) this;
        }

        public Criteria andDiaryStatusNotIn(List<String> values) {
            addCriterion("diary_status not in", values, "diaryStatus");
            return (Criteria) this;
        }

        public Criteria andDiaryStatusBetween(String value1, String value2) {
            addCriterion("diary_status between", value1, value2, "diaryStatus");
            return (Criteria) this;
        }

        public Criteria andDiaryStatusNotBetween(String value1, String value2) {
            addCriterion("diary_status not between", value1, value2, "diaryStatus");
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