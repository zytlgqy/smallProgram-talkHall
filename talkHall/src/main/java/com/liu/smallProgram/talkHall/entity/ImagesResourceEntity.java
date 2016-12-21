package com.liu.smallProgram.talkHall.entity;

import java.util.Date;

public class ImagesResourceEntity {
    private Integer imageId;

    private String imageUrl;

    private Integer imageState;

    private Date createTime;

    private Date lastUpdateTime;

    public Integer getImageId() {
        return imageId;
    }

    public void setImageId(Integer imageId) {
        this.imageId = imageId;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl == null ? null : imageUrl.trim();
    }

    public Integer getImageState() {
        return imageState;
    }

    public void setImageState(Integer imageState) {
        this.imageState = imageState;
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