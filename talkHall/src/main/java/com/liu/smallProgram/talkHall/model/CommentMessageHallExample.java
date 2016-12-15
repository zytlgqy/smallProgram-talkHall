package com.liu.smallProgram.talkHall.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CommentMessageHallExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommentMessageHallExample() {
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

        public Criteria andCommentIdIsNull() {
            addCriterion("comment_id is null");
            return (Criteria) this;
        }

        public Criteria andCommentIdIsNotNull() {
            addCriterion("comment_id is not null");
            return (Criteria) this;
        }

        public Criteria andCommentIdEqualTo(Integer value) {
            addCriterion("comment_id =", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotEqualTo(Integer value) {
            addCriterion("comment_id <>", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdGreaterThan(Integer value) {
            addCriterion("comment_id >", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_id >=", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdLessThan(Integer value) {
            addCriterion("comment_id <", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdLessThanOrEqualTo(Integer value) {
            addCriterion("comment_id <=", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdIn(List<Integer> values) {
            addCriterion("comment_id in", values, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotIn(List<Integer> values) {
            addCriterion("comment_id not in", values, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdBetween(Integer value1, Integer value2) {
            addCriterion("comment_id between", value1, value2, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_id not between", value1, value2, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentSpeakerIdIsNull() {
            addCriterion("comment_speaker_id is null");
            return (Criteria) this;
        }

        public Criteria andCommentSpeakerIdIsNotNull() {
            addCriterion("comment_speaker_id is not null");
            return (Criteria) this;
        }

        public Criteria andCommentSpeakerIdEqualTo(Integer value) {
            addCriterion("comment_speaker_id =", value, "commentSpeakerId");
            return (Criteria) this;
        }

        public Criteria andCommentSpeakerIdNotEqualTo(Integer value) {
            addCriterion("comment_speaker_id <>", value, "commentSpeakerId");
            return (Criteria) this;
        }

        public Criteria andCommentSpeakerIdGreaterThan(Integer value) {
            addCriterion("comment_speaker_id >", value, "commentSpeakerId");
            return (Criteria) this;
        }

        public Criteria andCommentSpeakerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_speaker_id >=", value, "commentSpeakerId");
            return (Criteria) this;
        }

        public Criteria andCommentSpeakerIdLessThan(Integer value) {
            addCriterion("comment_speaker_id <", value, "commentSpeakerId");
            return (Criteria) this;
        }

        public Criteria andCommentSpeakerIdLessThanOrEqualTo(Integer value) {
            addCriterion("comment_speaker_id <=", value, "commentSpeakerId");
            return (Criteria) this;
        }

        public Criteria andCommentSpeakerIdIn(List<Integer> values) {
            addCriterion("comment_speaker_id in", values, "commentSpeakerId");
            return (Criteria) this;
        }

        public Criteria andCommentSpeakerIdNotIn(List<Integer> values) {
            addCriterion("comment_speaker_id not in", values, "commentSpeakerId");
            return (Criteria) this;
        }

        public Criteria andCommentSpeakerIdBetween(Integer value1, Integer value2) {
            addCriterion("comment_speaker_id between", value1, value2, "commentSpeakerId");
            return (Criteria) this;
        }

        public Criteria andCommentSpeakerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_speaker_id not between", value1, value2, "commentSpeakerId");
            return (Criteria) this;
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

        public Criteria andCommentStateIsNull() {
            addCriterion("comment_state is null");
            return (Criteria) this;
        }

        public Criteria andCommentStateIsNotNull() {
            addCriterion("comment_state is not null");
            return (Criteria) this;
        }

        public Criteria andCommentStateEqualTo(Integer value) {
            addCriterion("comment_state =", value, "commentState");
            return (Criteria) this;
        }

        public Criteria andCommentStateNotEqualTo(Integer value) {
            addCriterion("comment_state <>", value, "commentState");
            return (Criteria) this;
        }

        public Criteria andCommentStateGreaterThan(Integer value) {
            addCriterion("comment_state >", value, "commentState");
            return (Criteria) this;
        }

        public Criteria andCommentStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_state >=", value, "commentState");
            return (Criteria) this;
        }

        public Criteria andCommentStateLessThan(Integer value) {
            addCriterion("comment_state <", value, "commentState");
            return (Criteria) this;
        }

        public Criteria andCommentStateLessThanOrEqualTo(Integer value) {
            addCriterion("comment_state <=", value, "commentState");
            return (Criteria) this;
        }

        public Criteria andCommentStateIn(List<Integer> values) {
            addCriterion("comment_state in", values, "commentState");
            return (Criteria) this;
        }

        public Criteria andCommentStateNotIn(List<Integer> values) {
            addCriterion("comment_state not in", values, "commentState");
            return (Criteria) this;
        }

        public Criteria andCommentStateBetween(Integer value1, Integer value2) {
            addCriterion("comment_state between", value1, value2, "commentState");
            return (Criteria) this;
        }

        public Criteria andCommentStateNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_state not between", value1, value2, "commentState");
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

        public Criteria andCommentImagesSrcIsNull() {
            addCriterion("comment_images_src is null");
            return (Criteria) this;
        }

        public Criteria andCommentImagesSrcIsNotNull() {
            addCriterion("comment_images_src is not null");
            return (Criteria) this;
        }

        public Criteria andCommentImagesSrcEqualTo(String value) {
            addCriterion("comment_images_src =", value, "commentImagesSrc");
            return (Criteria) this;
        }

        public Criteria andCommentImagesSrcNotEqualTo(String value) {
            addCriterion("comment_images_src <>", value, "commentImagesSrc");
            return (Criteria) this;
        }

        public Criteria andCommentImagesSrcGreaterThan(String value) {
            addCriterion("comment_images_src >", value, "commentImagesSrc");
            return (Criteria) this;
        }

        public Criteria andCommentImagesSrcGreaterThanOrEqualTo(String value) {
            addCriterion("comment_images_src >=", value, "commentImagesSrc");
            return (Criteria) this;
        }

        public Criteria andCommentImagesSrcLessThan(String value) {
            addCriterion("comment_images_src <", value, "commentImagesSrc");
            return (Criteria) this;
        }

        public Criteria andCommentImagesSrcLessThanOrEqualTo(String value) {
            addCriterion("comment_images_src <=", value, "commentImagesSrc");
            return (Criteria) this;
        }

        public Criteria andCommentImagesSrcLike(String value) {
            addCriterion("comment_images_src like", value, "commentImagesSrc");
            return (Criteria) this;
        }

        public Criteria andCommentImagesSrcNotLike(String value) {
            addCriterion("comment_images_src not like", value, "commentImagesSrc");
            return (Criteria) this;
        }

        public Criteria andCommentImagesSrcIn(List<String> values) {
            addCriterion("comment_images_src in", values, "commentImagesSrc");
            return (Criteria) this;
        }

        public Criteria andCommentImagesSrcNotIn(List<String> values) {
            addCriterion("comment_images_src not in", values, "commentImagesSrc");
            return (Criteria) this;
        }

        public Criteria andCommentImagesSrcBetween(String value1, String value2) {
            addCriterion("comment_images_src between", value1, value2, "commentImagesSrc");
            return (Criteria) this;
        }

        public Criteria andCommentImagesSrcNotBetween(String value1, String value2) {
            addCriterion("comment_images_src not between", value1, value2, "commentImagesSrc");
            return (Criteria) this;
        }

        public Criteria andCommentFatherIdIsNull() {
            addCriterion("comment_father_id is null");
            return (Criteria) this;
        }

        public Criteria andCommentFatherIdIsNotNull() {
            addCriterion("comment_father_id is not null");
            return (Criteria) this;
        }

        public Criteria andCommentFatherIdEqualTo(Integer value) {
            addCriterion("comment_father_id =", value, "commentFatherId");
            return (Criteria) this;
        }

        public Criteria andCommentFatherIdNotEqualTo(Integer value) {
            addCriterion("comment_father_id <>", value, "commentFatherId");
            return (Criteria) this;
        }

        public Criteria andCommentFatherIdGreaterThan(Integer value) {
            addCriterion("comment_father_id >", value, "commentFatherId");
            return (Criteria) this;
        }

        public Criteria andCommentFatherIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_father_id >=", value, "commentFatherId");
            return (Criteria) this;
        }

        public Criteria andCommentFatherIdLessThan(Integer value) {
            addCriterion("comment_father_id <", value, "commentFatherId");
            return (Criteria) this;
        }

        public Criteria andCommentFatherIdLessThanOrEqualTo(Integer value) {
            addCriterion("comment_father_id <=", value, "commentFatherId");
            return (Criteria) this;
        }

        public Criteria andCommentFatherIdIn(List<Integer> values) {
            addCriterion("comment_father_id in", values, "commentFatherId");
            return (Criteria) this;
        }

        public Criteria andCommentFatherIdNotIn(List<Integer> values) {
            addCriterion("comment_father_id not in", values, "commentFatherId");
            return (Criteria) this;
        }

        public Criteria andCommentFatherIdBetween(Integer value1, Integer value2) {
            addCriterion("comment_father_id between", value1, value2, "commentFatherId");
            return (Criteria) this;
        }

        public Criteria andCommentFatherIdNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_father_id not between", value1, value2, "commentFatherId");
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