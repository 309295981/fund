package com.fund.model;

import com.fund.util.bean.BeanBase;
import java.io.Serializable;
import java.util.Date;

public class FundInfo extends BeanBase implements Serializable {
    private Long id;

    private Long uid;

    private Long walletAddress;

    private String title;

    private String signature;

    private String fundraisingTokenName;

    private String fundraisingTokenAddress;

    private Long fundraisingPlanAmount;

    private Date fundraisingStart;

    private Date fundraisingEnd;

    private String fundraisingSignature;

    private Byte fundraisingStatus;

    private Byte status;

    private Date gmtCreate;

    private Date gmtModified;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public Long getWalletAddress() {
        return walletAddress;
    }

    public void setWalletAddress(Long walletAddress) {
        this.walletAddress = walletAddress;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature == null ? null : signature.trim();
    }

    public String getFundraisingTokenName() {
        return fundraisingTokenName;
    }

    public void setFundraisingTokenName(String fundraisingTokenName) {
        this.fundraisingTokenName = fundraisingTokenName == null ? null : fundraisingTokenName.trim();
    }

    public String getFundraisingTokenAddress() {
        return fundraisingTokenAddress;
    }

    public void setFundraisingTokenAddress(String fundraisingTokenAddress) {
        this.fundraisingTokenAddress = fundraisingTokenAddress == null ? null : fundraisingTokenAddress.trim();
    }

    public Long getFundraisingPlanAmount() {
        return fundraisingPlanAmount;
    }

    public void setFundraisingPlanAmount(Long fundraisingPlanAmount) {
        this.fundraisingPlanAmount = fundraisingPlanAmount;
    }

    public Date getFundraisingStart() {
        return fundraisingStart;
    }

    public void setFundraisingStart(Date fundraisingStart) {
        this.fundraisingStart = fundraisingStart;
    }

    public Date getFundraisingEnd() {
        return fundraisingEnd;
    }

    public void setFundraisingEnd(Date fundraisingEnd) {
        this.fundraisingEnd = fundraisingEnd;
    }

    public String getFundraisingSignature() {
        return fundraisingSignature;
    }

    public void setFundraisingSignature(String fundraisingSignature) {
        this.fundraisingSignature = fundraisingSignature == null ? null : fundraisingSignature.trim();
    }

    public Byte getFundraisingStatus() {
        return fundraisingStatus;
    }

    public void setFundraisingStatus(Byte fundraisingStatus) {
        this.fundraisingStatus = fundraisingStatus;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        FundInfo other = (FundInfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUid() == null ? other.getUid() == null : this.getUid().equals(other.getUid()))
            && (this.getWalletAddress() == null ? other.getWalletAddress() == null : this.getWalletAddress().equals(other.getWalletAddress()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getSignature() == null ? other.getSignature() == null : this.getSignature().equals(other.getSignature()))
            && (this.getFundraisingTokenName() == null ? other.getFundraisingTokenName() == null : this.getFundraisingTokenName().equals(other.getFundraisingTokenName()))
            && (this.getFundraisingTokenAddress() == null ? other.getFundraisingTokenAddress() == null : this.getFundraisingTokenAddress().equals(other.getFundraisingTokenAddress()))
            && (this.getFundraisingPlanAmount() == null ? other.getFundraisingPlanAmount() == null : this.getFundraisingPlanAmount().equals(other.getFundraisingPlanAmount()))
            && (this.getFundraisingStart() == null ? other.getFundraisingStart() == null : this.getFundraisingStart().equals(other.getFundraisingStart()))
            && (this.getFundraisingEnd() == null ? other.getFundraisingEnd() == null : this.getFundraisingEnd().equals(other.getFundraisingEnd()))
            && (this.getFundraisingSignature() == null ? other.getFundraisingSignature() == null : this.getFundraisingSignature().equals(other.getFundraisingSignature()))
            && (this.getFundraisingStatus() == null ? other.getFundraisingStatus() == null : this.getFundraisingStatus().equals(other.getFundraisingStatus()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getGmtCreate() == null ? other.getGmtCreate() == null : this.getGmtCreate().equals(other.getGmtCreate()))
            && (this.getGmtModified() == null ? other.getGmtModified() == null : this.getGmtModified().equals(other.getGmtModified()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUid() == null) ? 0 : getUid().hashCode());
        result = prime * result + ((getWalletAddress() == null) ? 0 : getWalletAddress().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getSignature() == null) ? 0 : getSignature().hashCode());
        result = prime * result + ((getFundraisingTokenName() == null) ? 0 : getFundraisingTokenName().hashCode());
        result = prime * result + ((getFundraisingTokenAddress() == null) ? 0 : getFundraisingTokenAddress().hashCode());
        result = prime * result + ((getFundraisingPlanAmount() == null) ? 0 : getFundraisingPlanAmount().hashCode());
        result = prime * result + ((getFundraisingStart() == null) ? 0 : getFundraisingStart().hashCode());
        result = prime * result + ((getFundraisingEnd() == null) ? 0 : getFundraisingEnd().hashCode());
        result = prime * result + ((getFundraisingSignature() == null) ? 0 : getFundraisingSignature().hashCode());
        result = prime * result + ((getFundraisingStatus() == null) ? 0 : getFundraisingStatus().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getGmtCreate() == null) ? 0 : getGmtCreate().hashCode());
        result = prime * result + ((getGmtModified() == null) ? 0 : getGmtModified().hashCode());
        return result;
    }
}