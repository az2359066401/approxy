package com.vivo.pojo;

import java.io.Serializable;
import java.util.Date;

public class TbConfig implements Serializable {
    private String cfgCode;

    private String cfgName;

    private String cfgValue;

    private String pCfgCode;

    private Integer seqNo;

    private String description;

    private String remark;

    private String ext1;

    private String ext2;

    private String ext3;

    private String ext4;

    private String ext5;

    private String rCfgCode;

    private String crtUserid;

    private String createdBy;

    private Date createdTime;

    private String updatedBy;

    private Date updatedTime;

    public String getCfgCode() {
        return cfgCode;
    }

    public void setCfgCode(String cfgCode) {
        this.cfgCode = cfgCode == null ? null : cfgCode.trim();
    }

    public String getCfgName() {
        return cfgName;
    }

    public void setCfgName(String cfgName) {
        this.cfgName = cfgName == null ? null : cfgName.trim();
    }

    public String getCfgValue() {
        return cfgValue;
    }

    public void setCfgValue(String cfgValue) {
        this.cfgValue = cfgValue == null ? null : cfgValue.trim();
    }

    public String getpCfgCode() {
        return pCfgCode;
    }

    public void setpCfgCode(String pCfgCode) {
        this.pCfgCode = pCfgCode == null ? null : pCfgCode.trim();
    }

    public Integer getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(Integer seqNo) {
        this.seqNo = seqNo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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

    public String getExt4() {
        return ext4;
    }

    public void setExt4(String ext4) {
        this.ext4 = ext4 == null ? null : ext4.trim();
    }

    public String getExt5() {
        return ext5;
    }

    public void setExt5(String ext5) {
        this.ext5 = ext5 == null ? null : ext5.trim();
    }

    public String getrCfgCode() {
        return rCfgCode;
    }

    public void setrCfgCode(String rCfgCode) {
        this.rCfgCode = rCfgCode == null ? null : rCfgCode.trim();
    }

    public String getCrtUserid() {
        return crtUserid;
    }

    public void setCrtUserid(String crtUserid) {
        this.crtUserid = crtUserid == null ? null : crtUserid.trim();
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy == null ? null : createdBy.trim();
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy == null ? null : updatedBy.trim();
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }
}