package com.vivo.pojo;

public class JobCnnvdXmlWithBLOBs extends JobCnnvdXml {
    private String vulnerableConfiguration;

    private String vulnSoftwareList;

    private String vulnDescript;

    private String vulnSolution;

    private String refs;

    public String getVulnerableConfiguration() {
        return vulnerableConfiguration;
    }

    public void setVulnerableConfiguration(String vulnerableConfiguration) {
        this.vulnerableConfiguration = vulnerableConfiguration == null ? null : vulnerableConfiguration.trim();
    }

    public String getVulnSoftwareList() {
        return vulnSoftwareList;
    }

    public void setVulnSoftwareList(String vulnSoftwareList) {
        this.vulnSoftwareList = vulnSoftwareList == null ? null : vulnSoftwareList.trim();
    }

    public String getVulnDescript() {
        return vulnDescript;
    }

    public void setVulnDescript(String vulnDescript) {
        this.vulnDescript = vulnDescript == null ? null : vulnDescript.trim();
    }

    public String getVulnSolution() {
        return vulnSolution;
    }

    public void setVulnSolution(String vulnSolution) {
        this.vulnSolution = vulnSolution == null ? null : vulnSolution.trim();
    }

    public String getRefs() {
        return refs;
    }

    public void setRefs(String refs) {
        this.refs = refs == null ? null : refs.trim();
    }
}