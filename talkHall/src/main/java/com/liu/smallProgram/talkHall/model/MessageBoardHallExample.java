package com.liu.smallProgram.talkHall.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MessageBoardHallExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MessageBoardHallExample() {
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

        public Criteria andMessageIdIsNull() {
            addCriterion("message_id is null");
            return (Criteria) this;
        }

        public Criteria andMessageIdIsNotNull() {
            addCriterion("message_id is not null");
            return (Criteria) this;
        }

        public Criteria andMessageIdEqualTo(Integer value) {
            addCriterion("message_id =", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdNotEqualTo(Integer value) {
            addCriterion("message_id <>", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdGreaterThan(Integer value) {
            addCriterion("message_id >", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("message_id >=", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdLessThan(Integer value) {
            addCriterion("message_id <", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdLessThanOrEqualTo(Integer value) {
            addCriterion("message_id <=", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdIn(List<Integer> values) {
            addCriterion("message_id in", values, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdNotIn(List<Integer> values) {
            addCriterion("message_id not in", values, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdBetween(Integer value1, Integer value2) {
            addCriterion("message_id between", value1, value2, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdNotBetween(Integer value1, Integer value2) {
            addCriterion("message_id not between", value1, value2, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageSpeakerIdIsNull() {
            addCriterion("message_speaker_id is null");
            return (Criteria) this;
        }

        public Criteria andMessageSpeakerIdIsNotNull() {
            addCriterion("message_speaker_id is not null");
            return (Criteria) this;
        }

        public Criteria andMessageSpeakerIdEqualTo(Integer value) {
            addCriterion("message_speaker_id =", value, "messageSpeakerId");
            return (Criteria) this;
        }

        public Criteria andMessageSpeakerIdNotEqualTo(Integer value) {
            addCriterion("message_speaker_id <>", value, "messageSpeakerId");
            return (Criteria) this;
        }

        public Criteria andMessageSpeakerIdGreaterThan(Integer value) {
            addCriterion("message_speaker_id >", value, "messageSpeakerId");
            return (Criteria) this;
        }

        public Criteria andMessageSpeakerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("message_speaker_id >=", value, "messageSpeakerId");
            return (Criteria) this;
        }

        public Criteria andMessageSpeakerIdLessThan(Integer value) {
            addCriterion("message_speaker_id <", value, "messageSpeakerId");
            return (Criteria) this;
        }

        public Criteria andMessageSpeakerIdLessThanOrEqualTo(Integer value) {
            addCriterion("message_speaker_id <=", value, "messageSpeakerId");
            return (Criteria) this;
        }

        public Criteria andMessageSpeakerIdIn(List<Integer> values) {
            addCriterion("message_speaker_id in", values, "messageSpeakerId");
            return (Criteria) this;
        }

        public Criteria andMessageSpeakerIdNotIn(List<Integer> values) {
            addCriterion("message_speaker_id not in", values, "messageSpeakerId");
            return (Criteria) this;
        }

        public Criteria andMessageSpeakerIdBetween(Integer value1, Integer value2) {
            addCriterion("message_speaker_id between", value1, value2, "messageSpeakerId");
            return (Criteria) this;
        }

        public Criteria andMessageSpeakerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("message_speaker_id not between", value1, value2, "messageSpeakerId");
            return (Criteria) this;
        }

        public Criteria andMessageImagesSrcIsNull() {
            addCriterion("message_images_src is null");
            return (Criteria) this;
        }

        public Criteria andMessageImagesSrcIsNotNull() {
            addCriterion("message_images_src is not null");
            return (Criteria) this;
        }

        public Criteria andMessageImagesSrcEqualTo(String value) {
            addCriterion("message_images_src =", value, "messageImagesSrc");
            return (Criteria) this;
        }

        public Criteria andMessageImagesSrcNotEqualTo(String value) {
            addCriterion("message_images_src <>", value, "messageImagesSrc");
            return (Criteria) this;
        }

        public Criteria andMessageImagesSrcGreaterThan(String value) {
            addCriterion("message_images_src >", value, "messageImagesSrc");
            return (Criteria) this;
        }

        public Criteria andMessageImagesSrcGreaterThanOrEqualTo(String value) {
            addCriterion("message_images_src >=", value, "messageImagesSrc");
            return (Criteria) this;
        }

        public Criteria andMessageImagesSrcLessThan(String value) {
            addCriterion("message_images_src <", value, "messageImagesSrc");
            return (Criteria) this;
        }

        public Criteria andMessageImagesSrcLessThanOrEqualTo(String value) {
            addCriterion("message_images_src <=", value, "messageImagesSrc");
            return (Criteria) this;
        }

        public Criteria andMessageImagesSrcLike(String value) {
            addCriterion("message_images_src like", value, "messageImagesSrc");
            return (Criteria) this;
        }

        public Criteria andMessageImagesSrcNotLike(String value) {
            addCriterion("message_images_src not like", value, "messageImagesSrc");
            return (Criteria) this;
        }

        public Criteria andMessageImagesSrcIn(List<String> values) {
            addCriterion("message_images_src in", values, "messageImagesSrc");
            return (Criteria) this;
        }

        public Criteria andMessageImagesSrcNotIn(List<String> values) {
            addCriterion("message_images_src not in", values, "messageImagesSrc");
            return (Criteria) this;
        }

        public Criteria andMessageImagesSrcBetween(String value1, String value2) {
            addCriterion("message_images_src between", value1, value2, "messageImagesSrc");
            return (Criteria) this;
        }

        public Criteria andMessageImagesSrcNotBetween(String value1, String value2) {
            addCriterion("message_images_src not between", value1, value2, "messageImagesSrc");
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

        public Criteria andMessageDepartmentIdIsNull() {
            addCriterion("message_department_id is null");
            return (Criteria) this;
        }

        public Criteria andMessageDepartmentIdIsNotNull() {
            addCriterion("message_department_id is not null");
            return (Criteria) this;
        }

        public Criteria andMessageDepartmentIdEqualTo(Integer value) {
            addCriterion("message_department_id =", value, "messageDepartmentId");
            return (Criteria) this;
        }

        public Criteria andMessageDepartmentIdNotEqualTo(Integer value) {
            addCriterion("message_department_id <>", value, "messageDepartmentId");
            return (Criteria) this;
        }

        public Criteria andMessageDepartmentIdGreaterThan(Integer value) {
            addCriterion("message_department_id >", value, "messageDepartmentId");
            return (Criteria) this;
        }

        public Criteria andMessageDepartmentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("message_department_id >=", value, "messageDepartmentId");
            return (Criteria) this;
        }

        public Criteria andMessageDepartmentIdLessThan(Integer value) {
            addCriterion("message_department_id <", value, "messageDepartmentId");
            return (Criteria) this;
        }

        public Criteria andMessageDepartmentIdLessThanOrEqualTo(Integer value) {
            addCriterion("message_department_id <=", value, "messageDepartmentId");
            return (Criteria) this;
        }

        public Criteria andMessageDepartmentIdIn(List<Integer> values) {
            addCriterion("message_department_id in", values, "messageDepartmentId");
            return (Criteria) this;
        }

        public Criteria andMessageDepartmentIdNotIn(List<Integer> values) {
            addCriterion("message_department_id not in", values, "messageDepartmentId");
            return (Criteria) this;
        }

        public Criteria andMessageDepartmentIdBetween(Integer value1, Integer value2) {
            addCriterion("message_department_id between", value1, value2, "messageDepartmentId");
            return (Criteria) this;
        }

        public Criteria andMessageDepartmentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("message_department_id not between", value1, value2, "messageDepartmentId");
            return (Criteria) this;
        }

        public Criteria andMessageTitleIsNull() {
            addCriterion("message_title is null");
            return (Criteria) this;
        }

        public Criteria andMessageTitleIsNotNull() {
            addCriterion("message_title is not null");
            return (Criteria) this;
        }

        public Criteria andMessageTitleEqualTo(String value) {
            addCriterion("message_title =", value, "messageTitle");
            return (Criteria) this;
        }

        public Criteria andMessageTitleNotEqualTo(String value) {
            addCriterion("message_title <>", value, "messageTitle");
            return (Criteria) this;
        }

        public Criteria andMessageTitleGreaterThan(String value) {
            addCriterion("message_title >", value, "messageTitle");
            return (Criteria) this;
        }

        public Criteria andMessageTitleGreaterThanOrEqualTo(String value) {
            addCriterion("message_title >=", value, "messageTitle");
            return (Criteria) this;
        }

        public Criteria andMessageTitleLessThan(String value) {
            addCriterion("message_title <", value, "messageTitle");
            return (Criteria) this;
        }

        public Criteria andMessageTitleLessThanOrEqualTo(String value) {
            addCriterion("message_title <=", value, "messageTitle");
            return (Criteria) this;
        }

        public Criteria andMessageTitleLike(String value) {
            addCriterion("message_title like", value, "messageTitle");
            return (Criteria) this;
        }

        public Criteria andMessageTitleNotLike(String value) {
            addCriterion("message_title not like", value, "messageTitle");
            return (Criteria) this;
        }

        public Criteria andMessageTitleIn(List<String> values) {
            addCriterion("message_title in", values, "messageTitle");
            return (Criteria) this;
        }

        public Criteria andMessageTitleNotIn(List<String> values) {
            addCriterion("message_title not in", values, "messageTitle");
            return (Criteria) this;
        }

        public Criteria andMessageTitleBetween(String value1, String value2) {
            addCriterion("message_title between", value1, value2, "messageTitle");
            return (Criteria) this;
        }

        public Criteria andMessageTitleNotBetween(String value1, String value2) {
            addCriterion("message_title not between", value1, value2, "messageTitle");
            return (Criteria) this;
        }

        public Criteria andMessageLableIsNull() {
            addCriterion("message_lable is null");
            return (Criteria) this;
        }

        public Criteria andMessageLableIsNotNull() {
            addCriterion("message_lable is not null");
            return (Criteria) this;
        }

        public Criteria andMessageLableEqualTo(String value) {
            addCriterion("message_lable =", value, "messageLable");
            return (Criteria) this;
        }

        public Criteria andMessageLableNotEqualTo(String value) {
            addCriterion("message_lable <>", value, "messageLable");
            return (Criteria) this;
        }

        public Criteria andMessageLableGreaterThan(String value) {
            addCriterion("message_lable >", value, "messageLable");
            return (Criteria) this;
        }

        public Criteria andMessageLableGreaterThanOrEqualTo(String value) {
            addCriterion("message_lable >=", value, "messageLable");
            return (Criteria) this;
        }

        public Criteria andMessageLableLessThan(String value) {
            addCriterion("message_lable <", value, "messageLable");
            return (Criteria) this;
        }

        public Criteria andMessageLableLessThanOrEqualTo(String value) {
            addCriterion("message_lable <=", value, "messageLable");
            return (Criteria) this;
        }

        public Criteria andMessageLableLike(String value) {
            addCriterion("message_lable like", value, "messageLable");
            return (Criteria) this;
        }

        public Criteria andMessageLableNotLike(String value) {
            addCriterion("message_lable not like", value, "messageLable");
            return (Criteria) this;
        }

        public Criteria andMessageLableIn(List<String> values) {
            addCriterion("message_lable in", values, "messageLable");
            return (Criteria) this;
        }

        public Criteria andMessageLableNotIn(List<String> values) {
            addCriterion("message_lable not in", values, "messageLable");
            return (Criteria) this;
        }

        public Criteria andMessageLableBetween(String value1, String value2) {
            addCriterion("message_lable between", value1, value2, "messageLable");
            return (Criteria) this;
        }

        public Criteria andMessageLableNotBetween(String value1, String value2) {
            addCriterion("message_lable not between", value1, value2, "messageLable");
            return (Criteria) this;
        }

        public Criteria andMessageStateIsNull() {
            addCriterion("message_state is null");
            return (Criteria) this;
        }

        public Criteria andMessageStateIsNotNull() {
            addCriterion("message_state is not null");
            return (Criteria) this;
        }

        public Criteria andMessageStateEqualTo(Integer value) {
            addCriterion("message_state =", value, "messageState");
            return (Criteria) this;
        }

        public Criteria andMessageStateNotEqualTo(Integer value) {
            addCriterion("message_state <>", value, "messageState");
            return (Criteria) this;
        }

        public Criteria andMessageStateGreaterThan(Integer value) {
            addCriterion("message_state >", value, "messageState");
            return (Criteria) this;
        }

        public Criteria andMessageStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("message_state >=", value, "messageState");
            return (Criteria) this;
        }

        public Criteria andMessageStateLessThan(Integer value) {
            addCriterion("message_state <", value, "messageState");
            return (Criteria) this;
        }

        public Criteria andMessageStateLessThanOrEqualTo(Integer value) {
            addCriterion("message_state <=", value, "messageState");
            return (Criteria) this;
        }

        public Criteria andMessageStateIn(List<Integer> values) {
            addCriterion("message_state in", values, "messageState");
            return (Criteria) this;
        }

        public Criteria andMessageStateNotIn(List<Integer> values) {
            addCriterion("message_state not in", values, "messageState");
            return (Criteria) this;
        }

        public Criteria andMessageStateBetween(Integer value1, Integer value2) {
            addCriterion("message_state between", value1, value2, "messageState");
            return (Criteria) this;
        }

        public Criteria andMessageStateNotBetween(Integer value1, Integer value2) {
            addCriterion("message_state not between", value1, value2, "messageState");
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