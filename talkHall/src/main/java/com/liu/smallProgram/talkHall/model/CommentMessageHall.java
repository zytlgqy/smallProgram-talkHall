package com.liu.smallProgram.talkHall.model;

import java.util.Date;

public class CommentMessageHall {
    private Integer commentId;

    private Integer commentSpeakerId;

    private Integer messageId;

    private Integer commentState;

    private Date createTime;

    private String commentImagesSrc;

    private Integer commentFatherId;

    private String commentContent;

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

    public Integer getCommentState() {
        return commentState;
    }

    public void setCommentState(Integer commentState) {
        this.commentState = commentState;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCommentImagesSrc() {
        return commentImagesSrc;
    }

    public void setCommentImagesSrc(String commentImagesSrc) {
        this.commentImagesSrc = commentImagesSrc == null ? null : commentImagesSrc.trim();
    }

    public Integer getCommentFatherId() {
        return commentFatherId;
    }

    public void setCommentFatherId(Integer commentFatherId) {
        this.commentFatherId = commentFatherId;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent == null ? null : commentContent.trim();
    }
}