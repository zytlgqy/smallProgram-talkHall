package com.liu.smallProgram.talkHall.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DepartmentBelongsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DepartmentBelongsExample() {
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

        public Criteria andDepartmentBelongsIdIsNull() {
            addCriterion("department_belongs_id is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentBelongsIdIsNotNull() {
            addCriterion("department_belongs_id is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentBelongsIdEqualTo(Integer value) {
            addCriterion("department_belongs_id =", value, "departmentBelongsId");
            return (Criteria) this;
        }

        public Criteria andDepartmentBelongsIdNotEqualTo(Integer value) {
            addCriterion("department_belongs_id <>", value, "departmentBelongsId");
            return (Criteria) this;
        }

        public Criteria andDepartmentBelongsIdGreaterThan(Integer value) {
            addCriterion("department_belongs_id >", value, "departmentBelongsId");
            return (Criteria) this;
        }

        public Criteria andDepartmentBelongsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("department_belongs_id >=", value, "departmentBelongsId");
            return (Criteria) this;
        }

        public Criteria andDepartmentBelongsIdLessThan(Integer value) {
            addCriterion("department_belongs_id <", value, "departmentBelongsId");
            return (Criteria) this;
        }

        public Criteria andDepartmentBelongsIdLessThanOrEqualTo(Integer value) {
            addCriterion("department_belongs_id <=", value, "departmentBelongsId");
            return (Criteria) this;
        }

        public Criteria andDepartmentBelongsIdIn(List<Integer> values) {
            addCriterion("department_belongs_id in", values, "departmentBelongsId");
            return (Criteria) this;
        }

        public Criteria andDepartmentBelongsIdNotIn(List<Integer> values) {
            addCriterion("department_belongs_id not in", values, "departmentBelongsId");
            return (Criteria) this;
        }

        public Criteria andDepartmentBelongsIdBetween(Integer value1, Integer value2) {
            addCriterion("department_belongs_id between", value1, value2, "departmentBelongsId");
            return (Criteria) this;
        }

        public Criteria andDepartmentBelongsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("department_belongs_id not between", value1, value2, "departmentBelongsId");
            return (Criteria) this;
        }

        public Criteria andDepartmentTitleIsNull() {
            addCriterion("department_title is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentTitleIsNotNull() {
            addCriterion("department_title is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentTitleEqualTo(String value) {
            addCriterion("department_title =", value, "departmentTitle");
            return (Criteria) this;
        }

        public Criteria andDepartmentTitleNotEqualTo(String value) {
            addCriterion("department_title <>", value, "departmentTitle");
            return (Criteria) this;
        }

        public Criteria andDepartmentTitleGreaterThan(String value) {
            addCriterion("department_title >", value, "departmentTitle");
            return (Criteria) this;
        }

        public Criteria andDepartmentTitleGreaterThanOrEqualTo(String value) {
            addCriterion("department_title >=", value, "departmentTitle");
            return (Criteria) this;
        }

        public Criteria andDepartmentTitleLessThan(String value) {
            addCriterion("department_title <", value, "departmentTitle");
            return (Criteria) this;
        }

        public Criteria andDepartmentTitleLessThanOrEqualTo(String value) {
            addCriterion("department_title <=", value, "departmentTitle");
            return (Criteria) this;
        }

        public Criteria andDepartmentTitleLike(String value) {
            addCriterion("department_title like", value, "departmentTitle");
            return (Criteria) this;
        }

        public Criteria andDepartmentTitleNotLike(String value) {
            addCriterion("department_title not like", value, "departmentTitle");
            return (Criteria) this;
        }

        public Criteria andDepartmentTitleIn(List<String> values) {
            addCriterion("department_title in", values, "departmentTitle");
            return (Criteria) this;
        }

        public Criteria andDepartmentTitleNotIn(List<String> values) {
            addCriterion("department_title not in", values, "departmentTitle");
            return (Criteria) this;
        }

        public Criteria andDepartmentTitleBetween(String value1, String value2) {
            addCriterion("department_title between", value1, value2, "departmentTitle");
            return (Criteria) this;
        }

        public Criteria andDepartmentTitleNotBetween(String value1, String value2) {
            addCriterion("department_title not between", value1, value2, "departmentTitle");
            return (Criteria) this;
        }

        public Criteria andDepartmentStateIsNull() {
            addCriterion("department_state is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentStateIsNotNull() {
            addCriterion("department_state is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentStateEqualTo(Integer value) {
            addCriterion("department_state =", value, "departmentState");
            return (Criteria) this;
        }

        public Criteria andDepartmentStateNotEqualTo(Integer value) {
            addCriterion("department_state <>", value, "departmentState");
            return (Criteria) this;
        }

        public Criteria andDepartmentStateGreaterThan(Integer value) {
            addCriterion("department_state >", value, "departmentState");
            return (Criteria) this;
        }

        public Criteria andDepartmentStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("department_state >=", value, "departmentState");
            return (Criteria) this;
        }

        public Criteria andDepartmentStateLessThan(Integer value) {
            addCriterion("department_state <", value, "departmentState");
            return (Criteria) this;
        }

        public Criteria andDepartmentStateLessThanOrEqualTo(Integer value) {
            addCriterion("department_state <=", value, "departmentState");
            return (Criteria) this;
        }

        public Criteria andDepartmentStateIn(List<Integer> values) {
            addCriterion("department_state in", values, "departmentState");
            return (Criteria) this;
        }

        public Criteria andDepartmentStateNotIn(List<Integer> values) {
            addCriterion("department_state not in", values, "departmentState");
            return (Criteria) this;
        }

        public Criteria andDepartmentStateBetween(Integer value1, Integer value2) {
            addCriterion("department_state between", value1, value2, "departmentState");
            return (Criteria) this;
        }

        public Criteria andDepartmentStateNotBetween(Integer value1, Integer value2) {
            addCriterion("department_state not between", value1, value2, "departmentState");
            return (Criteria) this;
        }

        public Criteria andDepartmentPriorityIsNull() {
            addCriterion("department_priority is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentPriorityIsNotNull() {
            addCriterion("department_priority is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentPriorityEqualTo(Integer value) {
            addCriterion("department_priority =", value, "departmentPriority");
            return (Criteria) this;
        }

        public Criteria andDepartmentPriorityNotEqualTo(Integer value) {
            addCriterion("department_priority <>", value, "departmentPriority");
            return (Criteria) this;
        }

        public Criteria andDepartmentPriorityGreaterThan(Integer value) {
            addCriterion("department_priority >", value, "departmentPriority");
            return (Criteria) this;
        }

        public Criteria andDepartmentPriorityGreaterThanOrEqualTo(Integer value) {
            addCriterion("department_priority >=", value, "departmentPriority");
            return (Criteria) this;
        }

        public Criteria andDepartmentPriorityLessThan(Integer value) {
            addCriterion("department_priority <", value, "departmentPriority");
            return (Criteria) this;
        }

        public Criteria andDepartmentPriorityLessThanOrEqualTo(Integer value) {
            addCriterion("department_priority <=", value, "departmentPriority");
            return (Criteria) this;
        }

        public Criteria andDepartmentPriorityIn(List<Integer> values) {
            addCriterion("department_priority in", values, "departmentPriority");
            return (Criteria) this;
        }

        public Criteria andDepartmentPriorityNotIn(List<Integer> values) {
            addCriterion("department_priority not in", values, "departmentPriority");
            return (Criteria) this;
        }

        public Criteria andDepartmentPriorityBetween(Integer value1, Integer value2) {
            addCriterion("department_priority between", value1, value2, "departmentPriority");
            return (Criteria) this;
        }

        public Criteria andDepartmentPriorityNotBetween(Integer value1, Integer value2) {
            addCriterion("department_priority not between", value1, value2, "departmentPriority");
            return (Criteria) this;
        }

        public Criteria andDepartmentNumberIsNull() {
            addCriterion("department_number is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentNumberIsNotNull() {
            addCriterion("department_number is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentNumberEqualTo(Integer value) {
            addCriterion("department_number =", value, "departmentNumber");
            return (Criteria) this;
        }

        public Criteria andDepartmentNumberNotEqualTo(Integer value) {
            addCriterion("department_number <>", value, "departmentNumber");
            return (Criteria) this;
        }

        public Criteria andDepartmentNumberGreaterThan(Integer value) {
            addCriterion("department_number >", value, "departmentNumber");
            return (Criteria) this;
        }

        public Criteria andDepartmentNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("department_number >=", value, "departmentNumber");
            return (Criteria) this;
        }

        public Criteria andDepartmentNumberLessThan(Integer value) {
            addCriterion("department_number <", value, "departmentNumber");
            return (Criteria) this;
        }

        public Criteria andDepartmentNumberLessThanOrEqualTo(Integer value) {
            addCriterion("department_number <=", value, "departmentNumber");
            return (Criteria) this;
        }

        public Criteria andDepartmentNumberIn(List<Integer> values) {
            addCriterion("department_number in", values, "departmentNumber");
            return (Criteria) this;
        }

        public Criteria andDepartmentNumberNotIn(List<Integer> values) {
            addCriterion("department_number not in", values, "departmentNumber");
            return (Criteria) this;
        }

        public Criteria andDepartmentNumberBetween(Integer value1, Integer value2) {
            addCriterion("department_number between", value1, value2, "departmentNumber");
            return (Criteria) this;
        }

        public Criteria andDepartmentNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("department_number not between", value1, value2, "departmentNumber");
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

        public Criteria andLastUpdateTimeIsNull() {
            addCriterion("last_update_time is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeIsNotNull() {
            addCriterion("last_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeEqualTo(Date value) {
            addCriterion("last_update_time =", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotEqualTo(Date value) {
            addCriterion("last_update_time <>", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeGreaterThan(Date value) {
            addCriterion("last_update_time >", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_update_time >=", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeLessThan(Date value) {
            addCriterion("last_update_time <", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_update_time <=", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeIn(List<Date> values) {
            addCriterion("last_update_time in", values, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotIn(List<Date> values) {
            addCriterion("last_update_time not in", values, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("last_update_time between", value1, value2, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_update_time not between", value1, value2, "lastUpdateTime");
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