package com.liu.smallProgram.talkHall.model;

import java.util.Date;

public class CommentMessageHall {
    private Integer commentId;

    private Integer commentSpeakerId;

    private Integer messageId;

    private String commentContent;

    private Integer commentState;

    private String commentImagesIds;

    private Integer commentFatherId;

    private Date createTime;

    private Date lastUpdateTime;

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public Integer getCommentSpeakerId() {
        return commentSpeakerId;
    }

    public void setCommentSpeakerId(Integer commentSpeakerId) {
        this.commentSpeakerId = commentSpeakerId;
    }

    public Integer getMessageId() {
        return messageId;
    }

    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent == null ? null : commentContent.trim();
    }

    public Integer getCommentState() {
        return commentState;
    }

    public void setCommentState(Integer commentState) {
        this.commentState = commentState;
    }

    public String getCommentImagesIds() {
        return commentImagesIds;
    }

    public void setCommentImagesIds(String commentImagesIds) {
        this.commentImagesIds = commentImagesIds == null ? null : commentImagesIds.trim();
    }

    public Integer getCommentFatherId() {
        return commentFatherId;
    }

    public void setCommentFatherId(Integer commentFatherId) {
        this.commentFatherId = commentFatherId;
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