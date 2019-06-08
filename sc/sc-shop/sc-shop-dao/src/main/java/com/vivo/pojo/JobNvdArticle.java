package com.vivo.pojo;

public class JobNvdArticle {
    private Integer id;

    private String lastModifiedDate;

    private String severity;

    private String cveId;

    private String publishedDate;

    private String createDate;

    private String status;

    private String ext1;

    private String ext2;

    private String ext3;

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

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity == null ? null : severity.trim();
    }

    public String getCveId() {
        return cveId;
    }

    public void setCveId(String cveId) {
        this.cveId = cveId == null ? null : cveId.trim();
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getExt1() {
        return ext1;
    }

    public void setExt1(String ext1) {
        this.ext1 = ext1 == null ? null : ext1.trim();
    }

    public String getExt2() {
        return ext2;
    }

    public void setExt2(String ext2) {
        this.ext2 = ext2 == null ? null : ext2.trim();
    }

    public String getExt3() {
        return ext3;
    }

    public void setExt3(String ext3) {
        this.ext3 = ext3 == null ? null : ext3.trim();
    }
}