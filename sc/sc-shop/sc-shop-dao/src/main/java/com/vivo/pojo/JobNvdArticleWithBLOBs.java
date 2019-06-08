package com.vivo.pojo;

public class JobNvdArticleWithBLOBs extends JobNvdArticle {
    private String impact;

    private String des;

    private String comment;

    private String cve;

    public String getImpact() {
        return impact;
    }

    public void setImpact(String impact) {
        this.impact = impact == null ? null : impact.trim();
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des == null ? null : des.trim();
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    public String getCve() {
        return cve;
    }

    public void setCve(String cve) {
        this.cve = cve == null ? null : cve.trim();
    }
}