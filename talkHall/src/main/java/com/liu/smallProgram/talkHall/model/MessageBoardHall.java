package com.liu.smallProgram.talkHall.model;

import java.util.Date;

public class MessageBoardHall {
    private Integer messageId;

    private Integer messageSpeakerId;

    private String messageContent;

    private String messageImagesIds;

    private Integer messageDepartmentId;

    private String messageTitle;

    private String messageLable;

    private Integer messageState;

    private String messageExtends;

    private Date createTime;

    private Date lastUpdateTime;

    public Integer getMessageId() {
        return messageId;
    }

    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }

    public Integer getMessageSpeakerId() {
        return messageSpeakerId;
    }

    public void setMessageSpeakerId(Integer messageSpeakerId) {
        this.messageSpeakerId = messageSpeakerId;
    }

    public String getMessageContent() {
        return messageContent;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent == null ? null : messageContent.trim();
    }

    public String getMessageImagesIds() {
        return messageImagesIds;
    }

    public void setMessageImagesIds(String messageImagesIds) {
        this.messageImagesIds = messageImagesIds == null ? null : messageImagesIds.trim();
    }

    public Integer getMessageDepartmentId() {
        return messageDepartmentId;
    }

    public void setMessageDepartmentId(Integer messageDepartmentId) {
        this.messageDepartmentId = messageDepartmentId;
    }

    public String getMessageTitle() {
        return messageTitle;
    }

    public void setMessageTitle(String messageTitle) {
        this.messageTitle = messageTitle == null ? null : messageTitle.trim();
    }

    public String getMessageLable() {
        return messageLable;
    }

    public void setMessageLable(String messageLable) {
        this.messageLable = messageLable == null ? null : messageLable.trim();
    }

    public Integer getMessageState() {
        return messageState;
    }

    public void setMessageState(Integer messageState) {
        this.messageState = messageState;
    }

    public String getMessageExtends() {
        return messageExtends;
    }

    public void setMessageExtends(String messageExtends) {
        this.messageExtends = messageExtends == null ? null : messageExtends.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }
}