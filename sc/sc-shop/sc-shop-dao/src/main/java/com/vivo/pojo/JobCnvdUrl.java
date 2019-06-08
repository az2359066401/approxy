package com.vivo.pojo;

public class JobCnvdUrl {
    private Integer id;

    private String cnvdUrl;

    private String urlType;

    private String deFlag;

    private String focusNum;

    private String commontNum;

    private String urlHits;

    private String bugLevel;

    private String title;

    private String publishDate;

    private String createDate;

    private String updateDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCnvdUrl() {
        return cnvdUrl;
    }

    public void setCnvdUrl(String cnvdUrl) {
        this.cnvdUrl = cnvdUrl == null ? null : cnvdUrl.trim();
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

    public String getFocusNum() {
        return focusNum;
    }

    public void setFocusNum(String focusNum) {
        this.focusNum = focusNum == null ? null : focusNum.trim();
    }

    public String getCommontNum() {
        return commontNum;
    }

    public void setCommontNum(String commontNum) {
        this.commontNum = commontNum == null ? null : commontNum.trim();
    }

    public String getUrlHits() {
        return urlHits;
    }

    public void setUrlHits(String urlHits) {
        this.urlHits = urlHits == null ? null : urlHits.trim();
    }

    public String getBugLevel() {
        return bugLevel;
    }

    public void setBugLevel(String bugLevel) {
        this.bugLevel = bugLevel == null ? null : bugLevel.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate == null ? null : publishDate.trim();
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate == null ? null : createDate.trim();
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate == null ? null : updateDate.trim();
    }
}