package com.vivo.pojo;

public class JobBoleArticle {
    private Integer content;

    private String title;

    private String url;

    private String createDate;

    private String favNums;

    public Integer getContent() {
        return content;
    }

    public void setContent(Integer content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate == null ? null : createDate.trim();
    }

    public String getFavNums() {
        return favNums;
    }

    public void setFavNums(String favNums) {
        this.favNums = favNums == null ? null : favNums.trim();
    }
}