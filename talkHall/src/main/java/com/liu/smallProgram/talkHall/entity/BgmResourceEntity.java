package com.liu.smallProgram.talkHall.entity;

import java.util.Date;

public class BgmResourceEntity {
    private Integer bgmId;

    private String bgmUrl;

    private Integer bgmState;

    private Date createTime;

    private Date lastUpdateTime;

    public Integer getBgmId() {
        return bgmId;
    }

    public void setBgmId(Integer bgmId) {
        this.bgmId = bgmId;
    }

    public String getBgmUrl() {
        return bgmUrl;
    }

    public void setBgmUrl(String bgmUrl) {
        this.bgmUrl = bgmUrl == null ? null : bgmUrl.trim();
    }

    public Integer getBgmState() {
        return bgmState;
    }

    public void setBgmState(Integer bgmState) {
        this.bgmState = bgmState;
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