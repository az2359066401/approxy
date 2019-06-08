package com.vivo.pojo;

public class IndexNvdArticle {
    private Integer id;

    private String lastModifiedDate;

    private String cveId;

    private String des;

    private String publishedDate;

    private String createDate;

    private String comment;

    private String status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(String lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate == null ? null : lastModifiedDate.trim();
    }

    public String getCveId() {
        return cveId;
    }

    public void setCveId(String cveId) {
        this.cveId = cveId == null ? null : cveId.trim();
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des == null ? null : des.trim();
    }

    public String getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(String publishedDate) {
        this.publishedDate = publishedDate == null ? null : publishedDate.trim();
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate == null ? null : createDate.trim();
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}