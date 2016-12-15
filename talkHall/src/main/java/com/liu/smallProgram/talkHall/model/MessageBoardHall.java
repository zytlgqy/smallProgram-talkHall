package com.liu.smallProgram.talkHall.model;

import java.util.Date;

public class MessageBoardHall {
    private Integer messageId;

    private Integer messageSpeakerId;

    private String messageImagesSrc;

    private Date createTime;

    private Integer messageDepartmentId;

    private String messageTitle;

    private String messageLable;

    private Integer messageState;

    private String messageContent;

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

    public String getMessageImagesSrc() {
        return messageImagesSrc;
    }

    public void setMessageImagesSrc(String messageImagesSrc) {
        this.messageImagesSrc = messageImagesSrc == null ? null : messageImagesSrc.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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

    public String getMessageContent() {
        return messageContent;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent == null ? null : messageContent.trim();
    }
}