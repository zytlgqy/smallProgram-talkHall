package com.liu.smallProgram.talkHall.model;

import java.util.Date;

public class UserInfo {
    private Integer userInfoId;

    private Integer userId;

    private String userNameReal;

    private String userNameNick;

    private String userAvatar;

    private Integer userGender;

    private Integer userAge;

    private String userPersonalizedSignature;

    private String userSelfIntroduce;

    private String userPhone;

    private String userQq;

    private String userWechat;

    private Integer userDepartmentBelongs;

    private Date createTime;

    private Date lateUpdateTime;

    public Integer getUserInfoId() {
        return userInfoId;
    }

    public void setUserInfoId(Integer userInfoId) {
        this.userInfoId = userInfoId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserNameReal() {
        return userNameReal;
    }

    public void setUserNameReal(String userNameReal) {
        this.userNameReal = userNameReal == null ? null : userNameReal.trim();
    }

    public String getUserNameNick() {
        return userNameNick;
    }

    public void setUserNameNick(String userNameNick) {
        this.userNameNick = userNameNick == null ? null : userNameNick.trim();
    }

    public String getUserAvatar() {
        return userAvatar;
    }

    public void setUserAvatar(String userAvatar) {
        this.userAvatar = userAvatar == null ? null : userAvatar.trim();
    }

    public Integer getUserGender() {
        return userGender;
    }

    public void setUserGender(Integer userGender) {
        this.userGender = userGender;
    }

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    public String getUserPersonalizedSignature() {
        return userPersonalizedSignature;
    }

    public void setUserPersonalizedSignature(String userPersonalizedSignature) {
        this.userPersonalizedSignature = userPersonalizedSignature == null ? null : userPersonalizedSignature.trim();
    }

    public String getUserSelfIntroduce() {
        return userSelfIntroduce;
    }

    public void setUserSelfIntroduce(String userSelfIntroduce) {
        this.userSelfIntroduce = userSelfIntroduce == null ? null : userSelfIntroduce.trim();
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    public String getUserQq() {
        return userQq;
    }

    public void setUserQq(String userQq) {
        this.userQq = userQq == null ? null : userQq.trim();
    }

    public String getUserWechat() {
        return userWechat;
    }

    public void setUserWechat(String userWechat) {
        this.userWechat = userWechat == null ? null : userWechat.trim();
    }

    public Integer getUserDepartmentBelongs() {
        return userDepartmentBelongs;
    }

    public void setUserDepartmentBelongs(Integer userDepartmentBelongs) {
        this.userDepartmentBelongs = userDepartmentBelongs;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLateUpdateTime() {
        return lateUpdateTime;
    }

    public void setLateUpdateTime(Date lateUpdateTime) {
        this.lateUpdateTime = lateUpdateTime;
    }
}