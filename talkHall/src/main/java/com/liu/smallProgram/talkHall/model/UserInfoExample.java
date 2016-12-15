package com.liu.smallProgram.talkHall.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserInfoExample() {
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

        public Criteria andUserInfoIdIsNull() {
            addCriterion("user_info_id is null");
            return (Criteria) this;
        }

        public Criteria andUserInfoIdIsNotNull() {
            addCriterion("user_info_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserInfoIdEqualTo(Integer value) {
            addCriterion("user_info_id =", value, "userInfoId");
            return (Criteria) this;
        }

        public Criteria andUserInfoIdNotEqualTo(Integer value) {
            addCriterion("user_info_id <>", value, "userInfoId");
            return (Criteria) this;
        }

        public Criteria andUserInfoIdGreaterThan(Integer value) {
            addCriterion("user_info_id >", value, "userInfoId");
            return (Criteria) this;
        }

        public Criteria andUserInfoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_info_id >=", value, "userInfoId");
            return (Criteria) this;
        }

        public Criteria andUserInfoIdLessThan(Integer value) {
            addCriterion("user_info_id <", value, "userInfoId");
            return (Criteria) this;
        }

        public Criteria andUserInfoIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_info_id <=", value, "userInfoId");
            return (Criteria) this;
        }

        public Criteria andUserInfoIdIn(List<Integer> values) {
            addCriterion("user_info_id in", values, "userInfoId");
            return (Criteria) this;
        }

        public Criteria andUserInfoIdNotIn(List<Integer> values) {
            addCriterion("user_info_id not in", values, "userInfoId");
            return (Criteria) this;
        }

        public Criteria andUserInfoIdBetween(Integer value1, Integer value2) {
            addCriterion("user_info_id between", value1, value2, "userInfoId");
            return (Criteria) this;
        }

        public Criteria andUserInfoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_info_id not between", value1, value2, "userInfoId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserNameRealIsNull() {
            addCriterion("user_name_real is null");
            return (Criteria) this;
        }

        public Criteria andUserNameRealIsNotNull() {
            addCriterion("user_name_real is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameRealEqualTo(String value) {
            addCriterion("user_name_real =", value, "userNameReal");
            return (Criteria) this;
        }

        public Criteria andUserNameRealNotEqualTo(String value) {
            addCriterion("user_name_real <>", value, "userNameReal");
            return (Criteria) this;
        }

        public Criteria andUserNameRealGreaterThan(String value) {
            addCriterion("user_name_real >", value, "userNameReal");
            return (Criteria) this;
        }

        public Criteria andUserNameRealGreaterThanOrEqualTo(String value) {
            addCriterion("user_name_real >=", value, "userNameReal");
            return (Criteria) this;
        }

        public Criteria andUserNameRealLessThan(String value) {
            addCriterion("user_name_real <", value, "userNameReal");
            return (Criteria) this;
        }

        public Criteria andUserNameRealLessThanOrEqualTo(String value) {
            addCriterion("user_name_real <=", value, "userNameReal");
            return (Criteria) this;
        }

        public Criteria andUserNameRealLike(String value) {
            addCriterion("user_name_real like", value, "userNameReal");
            return (Criteria) this;
        }

        public Criteria andUserNameRealNotLike(String value) {
            addCriterion("user_name_real not like", value, "userNameReal");
            return (Criteria) this;
        }

        public Criteria andUserNameRealIn(List<String> values) {
            addCriterion("user_name_real in", values, "userNameReal");
            return (Criteria) this;
        }

        public Criteria andUserNameRealNotIn(List<String> values) {
            addCriterion("user_name_real not in", values, "userNameReal");
            return (Criteria) this;
        }

        public Criteria andUserNameRealBetween(String value1, String value2) {
            addCriterion("user_name_real between", value1, value2, "userNameReal");
            return (Criteria) this;
        }

        public Criteria andUserNameRealNotBetween(String value1, String value2) {
            addCriterion("user_name_real not between", value1, value2, "userNameReal");
            return (Criteria) this;
        }

        public Criteria andUserNameNickIsNull() {
            addCriterion("user_name_nick is null");
            return (Criteria) this;
        }

        public Criteria andUserNameNickIsNotNull() {
            addCriterion("user_name_nick is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameNickEqualTo(String value) {
            addCriterion("user_name_nick =", value, "userNameNick");
            return (Criteria) this;
        }

        public Criteria andUserNameNickNotEqualTo(String value) {
            addCriterion("user_name_nick <>", value, "userNameNick");
            return (Criteria) this;
        }

        public Criteria andUserNameNickGreaterThan(String value) {
            addCriterion("user_name_nick >", value, "userNameNick");
            return (Criteria) this;
        }

        public Criteria andUserNameNickGreaterThanOrEqualTo(String value) {
            addCriterion("user_name_nick >=", value, "userNameNick");
            return (Criteria) this;
        }

        public Criteria andUserNameNickLessThan(String value) {
            addCriterion("user_name_nick <", value, "userNameNick");
            return (Criteria) this;
        }

        public Criteria andUserNameNickLessThanOrEqualTo(String value) {
            addCriterion("user_name_nick <=", value, "userNameNick");
            return (Criteria) this;
        }

        public Criteria andUserNameNickLike(String value) {
            addCriterion("user_name_nick like", value, "userNameNick");
            return (Criteria) this;
        }

        public Criteria andUserNameNickNotLike(String value) {
            addCriterion("user_name_nick not like", value, "userNameNick");
            return (Criteria) this;
        }

        public Criteria andUserNameNickIn(List<String> values) {
            addCriterion("user_name_nick in", values, "userNameNick");
            return (Criteria) this;
        }

        public Criteria andUserNameNickNotIn(List<String> values) {
            addCriterion("user_name_nick not in", values, "userNameNick");
            return (Criteria) this;
        }

        public Criteria andUserNameNickBetween(String value1, String value2) {
            addCriterion("user_name_nick between", value1, value2, "userNameNick");
            return (Criteria) this;
        }

        public Criteria andUserNameNickNotBetween(String value1, String value2) {
            addCriterion("user_name_nick not between", value1, value2, "userNameNick");
            return (Criteria) this;
        }

        public Criteria andUserAvatarIsNull() {
            addCriterion("user_avatar is null");
            return (Criteria) this;
        }

        public Criteria andUserAvatarIsNotNull() {
            addCriterion("user_avatar is not null");
            return (Criteria) this;
        }

        public Criteria andUserAvatarEqualTo(String value) {
            addCriterion("user_avatar =", value, "userAvatar");
            return (Criteria) this;
        }

        public Criteria andUserAvatarNotEqualTo(String value) {
            addCriterion("user_avatar <>", value, "userAvatar");
            return (Criteria) this;
        }

        public Criteria andUserAvatarGreaterThan(String value) {
            addCriterion("user_avatar >", value, "userAvatar");
            return (Criteria) this;
        }

        public Criteria andUserAvatarGreaterThanOrEqualTo(String value) {
            addCriterion("user_avatar >=", value, "userAvatar");
            return (Criteria) this;
        }

        public Criteria andUserAvatarLessThan(String value) {
            addCriterion("user_avatar <", value, "userAvatar");
            return (Criteria) this;
        }

        public Criteria andUserAvatarLessThanOrEqualTo(String value) {
            addCriterion("user_avatar <=", value, "userAvatar");
            return (Criteria) this;
        }

        public Criteria andUserAvatarLike(String value) {
            addCriterion("user_avatar like", value, "userAvatar");
            return (Criteria) this;
        }

        public Criteria andUserAvatarNotLike(String value) {
            addCriterion("user_avatar not like", value, "userAvatar");
            return (Criteria) this;
        }

        public Criteria andUserAvatarIn(List<String> values) {
            addCriterion("user_avatar in", values, "userAvatar");
            return (Criteria) this;
        }

        public Criteria andUserAvatarNotIn(List<String> values) {
            addCriterion("user_avatar not in", values, "userAvatar");
            return (Criteria) this;
        }

        public Criteria andUserAvatarBetween(String value1, String value2) {
            addCriterion("user_avatar between", value1, value2, "userAvatar");
            return (Criteria) this;
        }

        public Criteria andUserAvatarNotBetween(String value1, String value2) {
            addCriterion("user_avatar not between", value1, value2, "userAvatar");
            return (Criteria) this;
        }

        public Criteria andUserGenderIsNull() {
            addCriterion("user_gender is null");
            return (Criteria) this;
        }

        public Criteria andUserGenderIsNotNull() {
            addCriterion("user_gender is not null");
            return (Criteria) this;
        }

        public Criteria andUserGenderEqualTo(Integer value) {
            addCriterion("user_gender =", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderNotEqualTo(Integer value) {
            addCriterion("user_gender <>", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderGreaterThan(Integer value) {
            addCriterion("user_gender >", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_gender >=", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderLessThan(Integer value) {
            addCriterion("user_gender <", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderLessThanOrEqualTo(Integer value) {
            addCriterion("user_gender <=", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderIn(List<Integer> values) {
            addCriterion("user_gender in", values, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderNotIn(List<Integer> values) {
            addCriterion("user_gender not in", values, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderBetween(Integer value1, Integer value2) {
            addCriterion("user_gender between", value1, value2, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderNotBetween(Integer value1, Integer value2) {
            addCriterion("user_gender not between", value1, value2, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserAgeIsNull() {
            addCriterion("user_age is null");
            return (Criteria) this;
        }

        public Criteria andUserAgeIsNotNull() {
            addCriterion("user_age is not null");
            return (Criteria) this;
        }

        public Criteria andUserAgeEqualTo(Integer value) {
            addCriterion("user_age =", value, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserAgeNotEqualTo(Integer value) {
            addCriterion("user_age <>", value, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserAgeGreaterThan(Integer value) {
            addCriterion("user_age >", value, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_age >=", value, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserAgeLessThan(Integer value) {
            addCriterion("user_age <", value, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserAgeLessThanOrEqualTo(Integer value) {
            addCriterion("user_age <=", value, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserAgeIn(List<Integer> values) {
            addCriterion("user_age in", values, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserAgeNotIn(List<Integer> values) {
            addCriterion("user_age not in", values, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserAgeBetween(Integer value1, Integer value2) {
            addCriterion("user_age between", value1, value2, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("user_age not between", value1, value2, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserPersonalizedSignatureIsNull() {
            addCriterion("user_personalized_signature is null");
            return (Criteria) this;
        }

        public Criteria andUserPersonalizedSignatureIsNotNull() {
            addCriterion("user_personalized_signature is not null");
            return (Criteria) this;
        }

        public Criteria andUserPersonalizedSignatureEqualTo(String value) {
            addCriterion("user_personalized_signature =", value, "userPersonalizedSignature");
            return (Criteria) this;
        }

        public Criteria andUserPersonalizedSignatureNotEqualTo(String value) {
            addCriterion("user_personalized_signature <>", value, "userPersonalizedSignature");
            return (Criteria) this;
        }

        public Criteria andUserPersonalizedSignatureGreaterThan(String value) {
            addCriterion("user_personalized_signature >", value, "userPersonalizedSignature");
            return (Criteria) this;
        }

        public Criteria andUserPersonalizedSignatureGreaterThanOrEqualTo(String value) {
            addCriterion("user_personalized_signature >=", value, "userPersonalizedSignature");
            return (Criteria) this;
        }

        public Criteria andUserPersonalizedSignatureLessThan(String value) {
            addCriterion("user_personalized_signature <", value, "userPersonalizedSignature");
            return (Criteria) this;
        }

        public Criteria andUserPersonalizedSignatureLessThanOrEqualTo(String value) {
            addCriterion("user_personalized_signature <=", value, "userPersonalizedSignature");
            return (Criteria) this;
        }

        public Criteria andUserPersonalizedSignatureLike(String value) {
            addCriterion("user_personalized_signature like", value, "userPersonalizedSignature");
            return (Criteria) this;
        }

        public Criteria andUserPersonalizedSignatureNotLike(String value) {
            addCriterion("user_personalized_signature not like", value, "userPersonalizedSignature");
            return (Criteria) this;
        }

        public Criteria andUserPersonalizedSignatureIn(List<String> values) {
            addCriterion("user_personalized_signature in", values, "userPersonalizedSignature");
            return (Criteria) this;
        }

        public Criteria andUserPersonalizedSignatureNotIn(List<String> values) {
            addCriterion("user_personalized_signature not in", values, "userPersonalizedSignature");
            return (Criteria) this;
        }

        public Criteria andUserPersonalizedSignatureBetween(String value1, String value2) {
            addCriterion("user_personalized_signature between", value1, value2, "userPersonalizedSignature");
            return (Criteria) this;
        }

        public Criteria andUserPersonalizedSignatureNotBetween(String value1, String value2) {
            addCriterion("user_personalized_signature not between", value1, value2, "userPersonalizedSignature");
            return (Criteria) this;
        }

        public Criteria andUserSelfIntroduceIsNull() {
            addCriterion("user_self_introduce is null");
            return (Criteria) this;
        }

        public Criteria andUserSelfIntroduceIsNotNull() {
            addCriterion("user_self_introduce is not null");
            return (Criteria) this;
        }

        public Criteria andUserSelfIntroduceEqualTo(String value) {
            addCriterion("user_self_introduce =", value, "userSelfIntroduce");
            return (Criteria) this;
        }

        public Criteria andUserSelfIntroduceNotEqualTo(String value) {
            addCriterion("user_self_introduce <>", value, "userSelfIntroduce");
            return (Criteria) this;
        }

        public Criteria andUserSelfIntroduceGreaterThan(String value) {
            addCriterion("user_self_introduce >", value, "userSelfIntroduce");
            return (Criteria) this;
        }

        public Criteria andUserSelfIntroduceGreaterThanOrEqualTo(String value) {
            addCriterion("user_self_introduce >=", value, "userSelfIntroduce");
            return (Criteria) this;
        }

        public Criteria andUserSelfIntroduceLessThan(String value) {
            addCriterion("user_self_introduce <", value, "userSelfIntroduce");
            return (Criteria) this;
        }

        public Criteria andUserSelfIntroduceLessThanOrEqualTo(String value) {
            addCriterion("user_self_introduce <=", value, "userSelfIntroduce");
            return (Criteria) this;
        }

        public Criteria andUserSelfIntroduceLike(String value) {
            addCriterion("user_self_introduce like", value, "userSelfIntroduce");
            return (Criteria) this;
        }

        public Criteria andUserSelfIntroduceNotLike(String value) {
            addCriterion("user_self_introduce not like", value, "userSelfIntroduce");
            return (Criteria) this;
        }

        public Criteria andUserSelfIntroduceIn(List<String> values) {
            addCriterion("user_self_introduce in", values, "userSelfIntroduce");
            return (Criteria) this;
        }

        public Criteria andUserSelfIntroduceNotIn(List<String> values) {
            addCriterion("user_self_introduce not in", values, "userSelfIntroduce");
            return (Criteria) this;
        }

        public Criteria andUserSelfIntroduceBetween(String value1, String value2) {
            addCriterion("user_self_introduce between", value1, value2, "userSelfIntroduce");
            return (Criteria) this;
        }

        public Criteria andUserSelfIntroduceNotBetween(String value1, String value2) {
            addCriterion("user_self_introduce not between", value1, value2, "userSelfIntroduce");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNull() {
            addCriterion("user_phone is null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNotNull() {
            addCriterion("user_phone is not null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneEqualTo(String value) {
            addCriterion("user_phone =", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotEqualTo(String value) {
            addCriterion("user_phone <>", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThan(String value) {
            addCriterion("user_phone >", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("user_phone >=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThan(String value) {
            addCriterion("user_phone <", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThanOrEqualTo(String value) {
            addCriterion("user_phone <=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLike(String value) {
            addCriterion("user_phone like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotLike(String value) {
            addCriterion("user_phone not like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIn(List<String> values) {
            addCriterion("user_phone in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotIn(List<String> values) {
            addCriterion("user_phone not in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneBetween(String value1, String value2) {
            addCriterion("user_phone between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotBetween(String value1, String value2) {
            addCriterion("user_phone not between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserQqIsNull() {
            addCriterion("user_qq is null");
            return (Criteria) this;
        }

        public Criteria andUserQqIsNotNull() {
            addCriterion("user_qq is not null");
            return (Criteria) this;
        }

        public Criteria andUserQqEqualTo(String value) {
            addCriterion("user_qq =", value, "userQq");
            return (Criteria) this;
        }

        public Criteria andUserQqNotEqualTo(String value) {
            addCriterion("user_qq <>", value, "userQq");
            return (Criteria) this;
        }

        public Criteria andUserQqGreaterThan(String value) {
            addCriterion("user_qq >", value, "userQq");
            return (Criteria) this;
        }

        public Criteria andUserQqGreaterThanOrEqualTo(String value) {
            addCriterion("user_qq >=", value, "userQq");
            return (Criteria) this;
        }

        public Criteria andUserQqLessThan(String value) {
            addCriterion("user_qq <", value, "userQq");
            return (Criteria) this;
        }

        public Criteria andUserQqLessThanOrEqualTo(String value) {
            addCriterion("user_qq <=", value, "userQq");
            return (Criteria) this;
        }

        public Criteria andUserQqLike(String value) {
            addCriterion("user_qq like", value, "userQq");
            return (Criteria) this;
        }

        public Criteria andUserQqNotLike(String value) {
            addCriterion("user_qq not like", value, "userQq");
            return (Criteria) this;
        }

        public Criteria andUserQqIn(List<String> values) {
            addCriterion("user_qq in", values, "userQq");
            return (Criteria) this;
        }

        public Criteria andUserQqNotIn(List<String> values) {
            addCriterion("user_qq not in", values, "userQq");
            return (Criteria) this;
        }

        public Criteria andUserQqBetween(String value1, String value2) {
            addCriterion("user_qq between", value1, value2, "userQq");
            return (Criteria) this;
        }

        public Criteria andUserQqNotBetween(String value1, String value2) {
            addCriterion("user_qq not between", value1, value2, "userQq");
            return (Criteria) this;
        }

        public Criteria andUserWechatIsNull() {
            addCriterion("user_wechat is null");
            return (Criteria) this;
        }

        public Criteria andUserWechatIsNotNull() {
            addCriterion("user_wechat is not null");
            return (Criteria) this;
        }

        public Criteria andUserWechatEqualTo(String value) {
            addCriterion("user_wechat =", value, "userWechat");
            return (Criteria) this;
        }

        public Criteria andUserWechatNotEqualTo(String value) {
            addCriterion("user_wechat <>", value, "userWechat");
            return (Criteria) this;
        }

        public Criteria andUserWechatGreaterThan(String value) {
            addCriterion("user_wechat >", value, "userWechat");
            return (Criteria) this;
        }

        public Criteria andUserWechatGreaterThanOrEqualTo(String value) {
            addCriterion("user_wechat >=", value, "userWechat");
            return (Criteria) this;
        }

        public Criteria andUserWechatLessThan(String value) {
            addCriterion("user_wechat <", value, "userWechat");
            return (Criteria) this;
        }

        public Criteria andUserWechatLessThanOrEqualTo(String value) {
            addCriterion("user_wechat <=", value, "userWechat");
            return (Criteria) this;
        }

        public Criteria andUserWechatLike(String value) {
            addCriterion("user_wechat like", value, "userWechat");
            return (Criteria) this;
        }

        public Criteria andUserWechatNotLike(String value) {
            addCriterion("user_wechat not like", value, "userWechat");
            return (Criteria) this;
        }

        public Criteria andUserWechatIn(List<String> values) {
            addCriterion("user_wechat in", values, "userWechat");
            return (Criteria) this;
        }

        public Criteria andUserWechatNotIn(List<String> values) {
            addCriterion("user_wechat not in", values, "userWechat");
            return (Criteria) this;
        }

        public Criteria andUserWechatBetween(String value1, String value2) {
            addCriterion("user_wechat between", value1, value2, "userWechat");
            return (Criteria) this;
        }

        public Criteria andUserWechatNotBetween(String value1, String value2) {
            addCriterion("user_wechat not between", value1, value2, "userWechat");
            return (Criteria) this;
        }

        public Criteria andUserDepartmentBelongsIsNull() {
            addCriterion("user_department_belongs is null");
            return (Criteria) this;
        }

        public Criteria andUserDepartmentBelongsIsNotNull() {
            addCriterion("user_department_belongs is not null");
            return (Criteria) this;
        }

        public Criteria andUserDepartmentBelongsEqualTo(Integer value) {
            addCriterion("user_department_belongs =", value, "userDepartmentBelongs");
            return (Criteria) this;
        }

        public Criteria andUserDepartmentBelongsNotEqualTo(Integer value) {
            addCriterion("user_department_belongs <>", value, "userDepartmentBelongs");
            return (Criteria) this;
        }

        public Criteria andUserDepartmentBelongsGreaterThan(Integer value) {
            addCriterion("user_department_belongs >", value, "userDepartmentBelongs");
            return (Criteria) this;
        }

        public Criteria andUserDepartmentBelongsGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_department_belongs >=", value, "userDepartmentBelongs");
            return (Criteria) this;
        }

        public Criteria andUserDepartmentBelongsLessThan(Integer value) {
            addCriterion("user_department_belongs <", value, "userDepartmentBelongs");
            return (Criteria) this;
        }

        public Criteria andUserDepartmentBelongsLessThanOrEqualTo(Integer value) {
            addCriterion("user_department_belongs <=", value, "userDepartmentBelongs");
            return (Criteria) this;
        }

        public Criteria andUserDepartmentBelongsIn(List<Integer> values) {
            addCriterion("user_department_belongs in", values, "userDepartmentBelongs");
            return (Criteria) this;
        }

        public Criteria andUserDepartmentBelongsNotIn(List<Integer> values) {
            addCriterion("user_department_belongs not in", values, "userDepartmentBelongs");
            return (Criteria) this;
        }

        public Criteria andUserDepartmentBelongsBetween(Integer value1, Integer value2) {
            addCriterion("user_department_belongs between", value1, value2, "userDepartmentBelongs");
            return (Criteria) this;
        }

        public Criteria andUserDepartmentBelongsNotBetween(Integer value1, Integer value2) {
            addCriterion("user_department_belongs not between", value1, value2, "userDepartmentBelongs");
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

        public Criteria andLateUpdateTimeIsNull() {
            addCriterion("late_update_time is null");
            return (Criteria) this;
        }

        public Criteria andLateUpdateTimeIsNotNull() {
            addCriterion("late_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andLateUpdateTimeEqualTo(Date value) {
            addCriterion("late_update_time =", value, "lateUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLateUpdateTimeNotEqualTo(Date value) {
            addCriterion("late_update_time <>", value, "lateUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLateUpdateTimeGreaterThan(Date value) {
            addCriterion("late_update_time >", value, "lateUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLateUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("late_update_time >=", value, "lateUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLateUpdateTimeLessThan(Date value) {
            addCriterion("late_update_time <", value, "lateUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLateUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("late_update_time <=", value, "lateUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLateUpdateTimeIn(List<Date> values) {
            addCriterion("late_update_time in", values, "lateUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLateUpdateTimeNotIn(List<Date> values) {
            addCriterion("late_update_time not in", values, "lateUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLateUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("late_update_time between", value1, value2, "lateUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLateUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("late_update_time not between", value1, value2, "lateUpdateTime");
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