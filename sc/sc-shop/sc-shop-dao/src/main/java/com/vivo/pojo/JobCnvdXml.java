package com.vivo.pojo;

public class JobCnvdXml {
    private Integer id;

    private String discoverername;

    private String description;

    private String title;

    private String referencelink;

    private String cves;

    private String products;

    private String serverity;

    private String patchName;

    private String number;

    private String submitTime;

    private String formalWay;

    private String bids;

    private String openTime;

    private String patchDescription;

    private String isEvent;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDiscoverername() {
        return discoverername;
    }

    public void setDiscoverername(String discoverername) {
        this.discoverername = discoverername == null ? null : discoverername.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getReferencelink() {
        return referencelink;
    }

    public void setReferencelink(String referencelink) {
        this.referencelink = referencelink == null ? null : referencelink.trim();
    }

    public String getCves() {
        return cves;
    }

    public void setCves(String cves) {
        this.cves = cves == null ? null : cves.trim();
    }

    public String getProducts() {
        return products;
    }

    public void setProducts(String products) {
        this.products = products == null ? null : products.trim();
    }

    public String getServerity() {
        return serverity;
    }

    public void setServerity(String serverity) {
        this.serverity = serverity == null ? null : serverity.trim();
    }

    public String getPatchName() {
        return patchName;
    }

    public void setPatchName(String patchName) {
        this.patchName = patchName == null ? null : patchName.trim();
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }

    public String getSubmitTime() {
        return submitTime;
    }

    public void setSubmitTime(String submitTime) {
        this.submitTime = submitTime == null ? null : submitTime.trim();
    }

    public String getFormalWay() {
        return formalWay;
    }

    public void setFormalWay(String formalWay) {
        this.formalWay = formalWay == null ? null : formalWay.trim();
    }

    public String getBids() {
        return bids;
    }

    public void setBids(String bids) {
        this.bids = bids == null ? null : bids.trim();
    }

    public String getOpenTime() {
        return openTime;
    }

    public void setOpenTime(String openTime) {
        this.openTime = openTime == null ? null : openTime.trim();
    }

    public String getPatchDescription() {
        return patchDescription;
    }

    public void setPatchDescription(String patchDescription) {
        this.patchDescription = patchDescription == null ? null : patchDescription.trim();
    }

    public String getIsEvent() {
        return isEvent;
    }

    public void setIsEvent(String isEvent) {
        this.isEvent = isEvent == null ? null : isEvent.trim();
    }
}