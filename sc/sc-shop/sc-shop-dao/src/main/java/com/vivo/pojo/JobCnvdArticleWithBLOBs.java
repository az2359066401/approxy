package com.vivo.pojo;

public class JobCnvdArticleWithBLOBs extends JobCnvdArticle {
    private String bugCorp;

    private String bugDesc;

    private String referenceLink;

    private String bugSolution;

    private String bugPatch;

    private String comment;

    public String getBugCorp() {
        return bugCorp;
    }

    public void setBugCorp(String bugCorp) {
        this.bugCorp = bugCorp == null ? null : bugCorp.trim();
    }

    public String getBugDesc() {
        return bugDesc;
    }

    public void setBugDesc(String bugDesc) {
        this.bugDesc = bugDesc == null ? null : bugDesc.trim();
    }

    public String getReferenceLink() {
        return referenceLink;
    }

    public void setReferenceLink(String referenceLink) {
        this.referenceLink = referenceLink == null ? null : referenceLink.trim();
    }

    public String getBugSolution() {
        return bugSolution;
    }

    public void setBugSolution(String bugSolution) {
        this.bugSolution = bugSolution == null ? null : bugSolution.trim();
    }

    public String getBugPatch() {
        return bugPatch;
    }

    public void setBugPatch(String bugPatch) {
        this.bugPatch = bugPatch == null ? null : bugPatch.trim();
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }
}