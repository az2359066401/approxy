package com.vivo.pojo;

public class Comment {
    private Integer id;

    private String articleSource;

    private String uniqueId;

    private Integer articleId;

    private String commentator;

    private String contentDate;

    private String content;

    private String receiver;

    private String processor;

    private String processDate;

    private String processRes;

    private String rejectRes;

    private String rejectDate;

    private String finalRes;

    private String finalDate;

    private String finalProcessor;

    private String processStatus;

    private String ext1;

    private String ext2;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getArticleSource() {
        return articleSource;
    }

    public void setArticleSource(String articleSource) {
        this.articleSource = articleSource == null ? null : articleSource.trim();
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId == null ? null : uniqueId.trim();
    }

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public String getCommentator() {
        return commentator;
    }

    public void setCommentator(String commentator) {
        this.commentator = commentator == null ? null : commentator.trim();
    }

    public String getContentDate() {
        return contentDate;
    }

    public void setContentDate(String contentDate) {
        this.contentDate = contentDate == null ? null : contentDate.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver == null ? null : receiver.trim();
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor == null ? null : processor.trim();
    }

    public String getProcessDate() {
        return processDate;
    }

    public void setProcessDate(String processDate) {
        this.processDate = processDate == null ? null : processDate.trim();
    }

    public String getProcessRes() {
        return processRes;
    }

    public void setProcessRes(String processRes) {
        this.processRes = processRes == null ? null : processRes.trim();
    }

    public String getRejectRes() {
        return rejectRes;
    }

    public void setRejectRes(String rejectRes) {
        this.rejectRes = rejectRes == null ? null : rejectRes.trim();
    }

    public String getRejectDate() {
        return rejectDate;
    }

    public void setRejectDate(String rejectDate) {
        this.rejectDate = rejectDate == null ? null : rejectDate.trim();
    }

    public String getFinalRes() {
        return finalRes;
    }

    public void setFinalRes(String finalRes) {
        this.finalRes = finalRes == null ? null : finalRes.trim();
    }

    public String getFinalDate() {
        return finalDate;
    }

    public void setFinalDate(String finalDate) {
        this.finalDate = finalDate == null ? null : finalDate.trim();
    }

    public String getFinalProcessor() {
        return finalProcessor;
    }

    public void setFinalProcessor(String finalProcessor) {
        this.finalProcessor = finalProcessor == null ? null : finalProcessor.trim();
    }

    public String getProcessStatus() {
        return processStatus;
    }

    public void setProcessStatus(String processStatus) {
        this.processStatus = processStatus == null ? null : processStatus.trim();
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
}