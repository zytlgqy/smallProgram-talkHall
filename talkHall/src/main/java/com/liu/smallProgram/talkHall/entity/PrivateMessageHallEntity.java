package com.liu.smallProgram.talkHall.entity;

import java.util.Date;

public class PrivateMessageHallEntity {
    private Integer privateMessageId;

    private Integer privateMessageHallOwnerId;

    private Integer bgImageId;

    private Integer bgMusicId;

    private String privateMessageHallStyle;

    private String privateMessageHallExtends;

    private Date createTime;

    private Date lastUpdateTime;

    public Integer getPrivateMessageId() {
        return privateMessageId;
    }

    public void setPrivateMessageId(Integer privateMessageId) {
        this.privateMessageId = privateMessageId;
    }

    public Integer getPrivateMessageHallOwnerId() {
        return privateMessageHallOwnerId;
    }

    public void setPrivateMessageHallOwnerId(Integer privateMessageHallOwnerId) {
        this.privateMessageHallOwnerId = privateMessageHallOwnerId;
    }

    public Integer getBgImageId() {
        return bgImageId;
    }

    public void setBgImageId(Integer bgImageId) {
        this.bgImageId = bgImageId;
    }

    public Integer getBgMusicId() {
        return bgMusicId;
    }

    public void setBgMusicId(Integer bgMusicId) {
        this.bgMusicId = bgMusicId;
    }

    public String getPrivateMessageHallStyle() {
        return privateMessageHallStyle;
    }

    public void setPrivateMessageHallStyle(String privateMessageHallStyle) {
        this.privateMessageHallStyle = privateMessageHallStyle == null ? null : privateMessageHallStyle.trim();
    }

    public String getPrivateMessageHallExtends() {
        return privateMessageHallExtends;
    }

    public void setPrivateMessageHallExtends(String privateMessageHallExtends) {
        this.privateMessageHallExtends = privateMessageHallExtends == null ? null : privateMessageHallExtends.trim();
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