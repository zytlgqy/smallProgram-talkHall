package com.liu.smallProgram.talkHall.entity;

import java.util.Date;

public class CommentMessageHallEntity {
    private Integer commentId;

    private Integer userId;

    private Integer rUserId;

    private Date createTime;

    private Integer commentStates;

    private String commentContent;

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getrUserId() {
        return rUserId;
    }

    public void setrUserId(Integer rUserId) {
        this.rUserId = rUserId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getCommentStates() {
        return commentStates;
    }

    public void setCommentStates(Integer commentStates) {
        this.commentStates = commentStates;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent == null ? null : commentContent.trim();
    }
}