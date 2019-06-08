package com.vivo.pojo;

public class JobCnnvdXml {
    private Integer id;

    private String name;

    private String vulnId;

    private String published;

    private String modified;

    private String source;

    private String severity;

    private String vulnType;

    private String thrtype;

    private String vulnExploit;

    private String cveId;

    private String bugtraqId;

    private String otherId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getVulnId() {
        return vulnId;
    }

    public void setVulnId(String vulnId) {
        this.vulnId = vulnId == null ? null : vulnId.trim();
    }

    public String getPublished() {
        return published;
    }

    public void setPublished(String published) {
        this.published = published == null ? null : published.trim();
    }

    public String getModified() {
        return modified;
    }

    public void setModified(String modified) {
        this.modified = modified == null ? null : modified.trim();
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity == null ? null : severity.trim();
    }

    public String getVulnType() {
        return vulnType;
    }

    public void setVulnType(String vulnType) {
        this.vulnType = vulnType == null ? null : vulnType.trim();
    }

    public String getThrtype() {
        return thrtype;
    }

    public void setThrtype(String thrtype) {
        this.thrtype = thrtype == null ? null : thrtype.trim();
    }

    public String getVulnExploit() {
        return vulnExploit;
    }

    public void setVulnExploit(String vulnExploit) {
        this.vulnExploit = vulnExploit == null ? null : vulnExploit.trim();
    }

    public String getCveId() {
        return cveId;
    }

    public void setCveId(String cveId) {
        this.cveId = cveId == null ? null : cveId.trim();
    }

    public String getBugtraqId() {
        return bugtraqId;
    }

    public void setBugtraqId(String bugtraqId) {
        this.bugtraqId = bugtraqId == null ? null : bugtraqId.trim();
    }

    public String getOtherId() {
        return otherId;
    }

    public void setOtherId(String otherId) {
        this.otherId = otherId == null ? null : otherId.trim();
    }
}