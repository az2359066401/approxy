package com.vivo.pojo;

import java.util.Date;

public class RoomUrl {
    private Integer id;

    private String url;

    private String urlType;

    private String deFlag;

    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getUrlType() {
        return urlType;
    }

    public void setUrlType(String urlType) {
        this.urlType = urlType == null ? null : urlType.trim();
    }

    public String getDeFlag() {
        return deFlag;
    }

    public void setDeFlag(String deFlag) {
        this.deFlag = deFlag == null ? null : deFlag.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}