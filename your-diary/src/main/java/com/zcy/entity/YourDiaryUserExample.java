package com.zcy.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class YourDiaryUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public YourDiaryUserExample() {
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

        public Criteria andYdUserIdIsNull() {
            addCriterion("yd_user_id is null");
            return (Criteria) this;
        }

        public Criteria andYdUserIdIsNotNull() {
            addCriterion("yd_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andYdUserIdEqualTo(Long value) {
            addCriterion("yd_user_id =", value, "ydUserId");
            return (Criteria) this;
        }

        public Criteria andYdUserIdNotEqualTo(Long value) {
            addCriterion("yd_user_id <>", value, "ydUserId");
            return (Criteria) this;
        }

        public Criteria andYdUserIdGreaterThan(Long value) {
            addCriterion("yd_user_id >", value, "ydUserId");
            return (Criteria) this;
        }

        public Criteria andYdUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("yd_user_id >=", value, "ydUserId");
            return (Criteria) this;
        }

        public Criteria andYdUserIdLessThan(Long value) {
            addCriterion("yd_user_id <", value, "ydUserId");
            return (Criteria) this;
        }

        public Criteria andYdUserIdLessThanOrEqualTo(Long value) {
            addCriterion("yd_user_id <=", value, "ydUserId");
            return (Criteria) this;
        }

        public Criteria andYdUserIdIn(List<Long> values) {
            addCriterion("yd_user_id in", values, "ydUserId");
            return (Criteria) this;
        }

        public Criteria andYdUserIdNotIn(List<Long> values) {
            addCriterion("yd_user_id not in", values, "ydUserId");
            return (Criteria) this;
        }

        public Criteria andYdUserIdBetween(Long value1, Long value2) {
            addCriterion("yd_user_id between", value1, value2, "ydUserId");
            return (Criteria) this;
        }

        public Criteria andYdUserIdNotBetween(Long value1, Long value2) {
            addCriterion("yd_user_id not between", value1, value2, "ydUserId");
            return (Criteria) this;
        }

        public Criteria andYdUsernameIsNull() {
            addCriterion("yd_username is null");
            return (Criteria) this;
        }

        public Criteria andYdUsernameIsNotNull() {
            addCriterion("yd_username is not null");
            return (Criteria) this;
        }

        public Criteria andYdUsernameEqualTo(String value) {
            addCriterion("yd_username =", value, "ydUsername");
            return (Criteria) this;
        }

        public Criteria andYdUsernameNotEqualTo(String value) {
            addCriterion("yd_username <>", value, "ydUsername");
            return (Criteria) this;
        }

        public Criteria andYdUsernameGreaterThan(String value) {
            addCriterion("yd_username >", value, "ydUsername");
            return (Criteria) this;
        }

        public Criteria andYdUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("yd_username >=", value, "ydUsername");
            return (Criteria) this;
        }

        public Criteria andYdUsernameLessThan(String value) {
            addCriterion("yd_username <", value, "ydUsername");
            return (Criteria) this;
        }

        public Criteria andYdUsernameLessThanOrEqualTo(String value) {
            addCriterion("yd_username <=", value, "ydUsername");
            return (Criteria) this;
        }

        public Criteria andYdUsernameLike(String value) {
            addCriterion("yd_username like", value, "ydUsername");
            return (Criteria) this;
        }

        public Criteria andYdUsernameNotLike(String value) {
            addCriterion("yd_username not like", value, "ydUsername");
            return (Criteria) this;
        }

        public Criteria andYdUsernameIn(List<String> values) {
            addCriterion("yd_username in", values, "ydUsername");
            return (Criteria) this;
        }

        public Criteria andYdUsernameNotIn(List<String> values) {
            addCriterion("yd_username not in", values, "ydUsername");
            return (Criteria) this;
        }

        public Criteria andYdUsernameBetween(String value1, String value2) {
            addCriterion("yd_username between", value1, value2, "ydUsername");
            return (Criteria) this;
        }

        public Criteria andYdUsernameNotBetween(String value1, String value2) {
            addCriterion("yd_username not between", value1, value2, "ydUsername");
            return (Criteria) this;
        }

        public Criteria andYdPasswordIsNull() {
            addCriterion("yd_password is null");
            return (Criteria) this;
        }

        public Criteria andYdPasswordIsNotNull() {
            addCriterion("yd_password is not null");
            return (Criteria) this;
        }

        public Criteria andYdPasswordEqualTo(String value) {
            addCriterion("yd_password =", value, "ydPassword");
            return (Criteria) this;
        }

        public Criteria andYdPasswordNotEqualTo(String value) {
            addCriterion("yd_password <>", value, "ydPassword");
            return (Criteria) this;
        }

        public Criteria andYdPasswordGreaterThan(String value) {
            addCriterion("yd_password >", value, "ydPassword");
            return (Criteria) this;
        }

        public Criteria andYdPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("yd_password >=", value, "ydPassword");
            return (Criteria) this;
        }

        public Criteria andYdPasswordLessThan(String value) {
            addCriterion("yd_password <", value, "ydPassword");
            return (Criteria) this;
        }

        public Criteria andYdPasswordLessThanOrEqualTo(String value) {
            addCriterion("yd_password <=", value, "ydPassword");
            return (Criteria) this;
        }

        public Criteria andYdPasswordLike(String value) {
            addCriterion("yd_password like", value, "ydPassword");
            return (Criteria) this;
        }

        public Criteria andYdPasswordNotLike(String value) {
            addCriterion("yd_password not like", value, "ydPassword");
            return (Criteria) this;
        }

        public Criteria andYdPasswordIn(List<String> values) {
            addCriterion("yd_password in", values, "ydPassword");
            return (Criteria) this;
        }

        public Criteria andYdPasswordNotIn(List<String> values) {
            addCriterion("yd_password not in", values, "ydPassword");
            return (Criteria) this;
        }

        public Criteria andYdPasswordBetween(String value1, String value2) {
            addCriterion("yd_password between", value1, value2, "ydPassword");
            return (Criteria) this;
        }

        public Criteria andYdPasswordNotBetween(String value1, String value2) {
            addCriterion("yd_password not between", value1, value2, "ydPassword");
            return (Criteria) this;
        }

        public Criteria andYdSaltIsNull() {
            addCriterion("yd_salt is null");
            return (Criteria) this;
        }

        public Criteria andYdSaltIsNotNull() {
            addCriterion("yd_salt is not null");
            return (Criteria) this;
        }

        public Criteria andYdSaltEqualTo(String value) {
            addCriterion("yd_salt =", value, "ydSalt");
            return (Criteria) this;
        }

        public Criteria andYdSaltNotEqualTo(String value) {
            addCriterion("yd_salt <>", value, "ydSalt");
            return (Criteria) this;
        }

        public Criteria andYdSaltGreaterThan(String value) {
            addCriterion("yd_salt >", value, "ydSalt");
            return (Criteria) this;
        }

        public Criteria andYdSaltGreaterThanOrEqualTo(String value) {
            addCriterion("yd_salt >=", value, "ydSalt");
            return (Criteria) this;
        }

        public Criteria andYdSaltLessThan(String value) {
            addCriterion("yd_salt <", value, "ydSalt");
            return (Criteria) this;
        }

        public Criteria andYdSaltLessThanOrEqualTo(String value) {
            addCriterion("yd_salt <=", value, "ydSalt");
            return (Criteria) this;
        }

        public Criteria andYdSaltLike(String value) {
            addCriterion("yd_salt like", value, "ydSalt");
            return (Criteria) this;
        }

        public Criteria andYdSaltNotLike(String value) {
            addCriterion("yd_salt not like", value, "ydSalt");
            return (Criteria) this;
        }

        public Criteria andYdSaltIn(List<String> values) {
            addCriterion("yd_salt in", values, "ydSalt");
            return (Criteria) this;
        }

        public Criteria andYdSaltNotIn(List<String> values) {
            addCriterion("yd_salt not in", values, "ydSalt");
            return (Criteria) this;
        }

        public Criteria andYdSaltBetween(String value1, String value2) {
            addCriterion("yd_salt between", value1, value2, "ydSalt");
            return (Criteria) this;
        }

        public Criteria andYdSaltNotBetween(String value1, String value2) {
            addCriterion("yd_salt not between", value1, value2, "ydSalt");
            return (Criteria) this;
        }

        public Criteria andYdStatusIsNull() {
            addCriterion("yd_status is null");
            return (Criteria) this;
        }

        public Criteria andYdStatusIsNotNull() {
            addCriterion("yd_status is not null");
            return (Criteria) this;
        }

        public Criteria andYdStatusEqualTo(String value) {
            addCriterion("yd_status =", value, "ydStatus");
            return (Criteria) this;
        }

        public Criteria andYdStatusNotEqualTo(String value) {
            addCriterion("yd_status <>", value, "ydStatus");
            return (Criteria) this;
        }

        public Criteria andYdStatusGreaterThan(String value) {
            addCriterion("yd_status >", value, "ydStatus");
            return (Criteria) this;
        }

        public Criteria andYdStatusGreaterThanOrEqualTo(String value) {
            addCriterion("yd_status >=", value, "ydStatus");
            return (Criteria) this;
        }

        public Criteria andYdStatusLessThan(String value) {
            addCriterion("yd_status <", value, "ydStatus");
            return (Criteria) this;
        }

        public Criteria andYdStatusLessThanOrEqualTo(String value) {
            addCriterion("yd_status <=", value, "ydStatus");
            return (Criteria) this;
        }

        public Criteria andYdStatusLike(String value) {
            addCriterion("yd_status like", value, "ydStatus");
            return (Criteria) this;
        }

        public Criteria andYdStatusNotLike(String value) {
            addCriterion("yd_status not like", value, "ydStatus");
            return (Criteria) this;
        }

        public Criteria andYdStatusIn(List<String> values) {
            addCriterion("yd_status in", values, "ydStatus");
            return (Criteria) this;
        }

        public Criteria andYdStatusNotIn(List<String> values) {
            addCriterion("yd_status not in", values, "ydStatus");
            return (Criteria) this;
        }

        public Criteria andYdStatusBetween(String value1, String value2) {
            addCriterion("yd_status between", value1, value2, "ydStatus");
            return (Criteria) this;
        }

        public Criteria andYdStatusNotBetween(String value1, String value2) {
            addCriterion("yd_status not between", value1, value2, "ydStatus");
            return (Criteria) this;
        }

        public Criteria andYdCreatePersonIsNull() {
            addCriterion("yd_create_person is null");
            return (Criteria) this;
        }

        public Criteria andYdCreatePersonIsNotNull() {
            addCriterion("yd_create_person is not null");
            return (Criteria) this;
        }

        public Criteria andYdCreatePersonEqualTo(String value) {
            addCriterion("yd_create_person =", value, "ydCreatePerson");
            return (Criteria) this;
        }

        public Criteria andYdCreatePersonNotEqualTo(String value) {
            addCriterion("yd_create_person <>", value, "ydCreatePerson");
            return (Criteria) this;
        }

        public Criteria andYdCreatePersonGreaterThan(String value) {
            addCriterion("yd_create_person >", value, "ydCreatePerson");
            return (Criteria) this;
        }

        public Criteria andYdCreatePersonGreaterThanOrEqualTo(String value) {
            addCriterion("yd_create_person >=", value, "ydCreatePerson");
            return (Criteria) this;
        }

        public Criteria andYdCreatePersonLessThan(String value) {
            addCriterion("yd_create_person <", value, "ydCreatePerson");
            return (Criteria) this;
        }

        public Criteria andYdCreatePersonLessThanOrEqualTo(String value) {
            addCriterion("yd_create_person <=", value, "ydCreatePerson");
            return (Criteria) this;
        }

        public Criteria andYdCreatePersonLike(String value) {
            addCriterion("yd_create_person like", value, "ydCreatePerson");
            return (Criteria) this;
        }

        public Criteria andYdCreatePersonNotLike(String value) {
            addCriterion("yd_create_person not like", value, "ydCreatePerson");
            return (Criteria) this;
        }

        public Criteria andYdCreatePersonIn(List<String> values) {
            addCriterion("yd_create_person in", values, "ydCreatePerson");
            return (Criteria) this;
        }

        public Criteria andYdCreatePersonNotIn(List<String> values) {
            addCriterion("yd_create_person not in", values, "ydCreatePerson");
            return (Criteria) this;
        }

        public Criteria andYdCreatePersonBetween(String value1, String value2) {
            addCriterion("yd_create_person between", value1, value2, "ydCreatePerson");
            return (Criteria) this;
        }

        public Criteria andYdCreatePersonNotBetween(String value1, String value2) {
            addCriterion("yd_create_person not between", value1, value2, "ydCreatePerson");
            return (Criteria) this;
        }

        public Criteria andYdCreateTimeIsNull() {
            addCriterion("yd_create_time is null");
            return (Criteria) this;
        }

        public Criteria andYdCreateTimeIsNotNull() {
            addCriterion("yd_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andYdCreateTimeEqualTo(Date value) {
            addCriterion("yd_create_time =", value, "ydCreateTime");
            return (Criteria) this;
        }

        public Criteria andYdCreateTimeNotEqualTo(Date value) {
            addCriterion("yd_create_time <>", value, "ydCreateTime");
            return (Criteria) this;
        }

        public Criteria andYdCreateTimeGreaterThan(Date value) {
            addCriterion("yd_create_time >", value, "ydCreateTime");
            return (Criteria) this;
        }

        public Criteria andYdCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("yd_create_time >=", value, "ydCreateTime");
            return (Criteria) this;
        }

        public Criteria andYdCreateTimeLessThan(Date value) {
            addCriterion("yd_create_time <", value, "ydCreateTime");
            return (Criteria) this;
        }

        public Criteria andYdCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("yd_create_time <=", value, "ydCreateTime");
            return (Criteria) this;
        }

        public Criteria andYdCreateTimeIn(List<Date> values) {
            addCriterion("yd_create_time in", values, "ydCreateTime");
            return (Criteria) this;
        }

        public Criteria andYdCreateTimeNotIn(List<Date> values) {
            addCriterion("yd_create_time not in", values, "ydCreateTime");
            return (Criteria) this;
        }

        public Criteria andYdCreateTimeBetween(Date value1, Date value2) {
            addCriterion("yd_create_time between", value1, value2, "ydCreateTime");
            return (Criteria) this;
        }

        public Criteria andYdCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("yd_create_time not between", value1, value2, "ydCreateTime");
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