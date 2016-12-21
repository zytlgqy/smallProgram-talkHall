package com.liu.smallProgram.talkHall.entity;

import java.util.Date;

public class DepartmentBelongsEntity {
    private Integer departmentBelongsId;

    private String departmentTitle;

    private Integer departmentState;

    private Integer departmentPriority;

    private Integer departmentNumber;

    private Integer departmentBgImageId;

    private Date createTime;

    private Date lastUpdateTime;

    public Integer getDepartmentBelongsId() {
        return departmentBelongsId;
    }

    public void setDepartmentBelongsId(Integer departmentBelongsId) {
        this.departmentBelongsId = departmentBelongsId;
    }

    public String getDepartmentTitle() {
        return departmentTitle;
    }

    public void setDepartmentTitle(String departmentTitle) {
        this.departmentTitle = departmentTitle == null ? null : departmentTitle.trim();
    }

    public Integer getDepartmentState() {
        return departmentState;
    }

    public void setDepartmentState(Integer departmentState) {
        this.departmentState = departmentState;
    }

    public Integer getDepartmentPriority() {
        return departmentPriority;
    }

    public void setDepartmentPriority(Integer departmentPriority) {
        this.departmentPriority = departmentPriority;
    }

    public Integer getDepartmentNumber() {
        return departmentNumber;
    }

    public void setDepartmentNumber(Integer departmentNumber) {
        this.departmentNumber = departmentNumber;
    }

    public Integer getDepartmentBgImageId() {
        return departmentBgImageId;
    }

    public void setDepartmentBgImageId(Integer departmentBgImageId) {
        this.departmentBgImageId = departmentBgImageId;
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