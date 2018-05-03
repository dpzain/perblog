package com.dpzain.entity;

import java.io.Serializable;
import java.util.Arrays;

/**
 * @author 
 */
public class PerblogUserWithBLOBs extends PerblogUser implements Serializable {
    private byte[] userNickName;

    private byte[] userPhone;

    private byte[] userEmail;

    private static final long serialVersionUID = 1L;

    public byte[] getUserNickName() {
        return userNickName;
    }

    public void setUserNickName(byte[] userNickName) {
        this.userNickName = userNickName;
    }

    public byte[] getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(byte[] userPhone) {
        this.userPhone = userPhone;
    }

    public byte[] getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(byte[] userEmail) {
        this.userEmail = userEmail;
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
        PerblogUserWithBLOBs other = (PerblogUserWithBLOBs) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getUserPwd() == null ? other.getUserPwd() == null : this.getUserPwd().equals(other.getUserPwd()))
            && (this.getUserSex() == null ? other.getUserSex() == null : this.getUserSex().equals(other.getUserSex()))
            && (this.getUserNickImageurl() == null ? other.getUserNickImageurl() == null : this.getUserNickImageurl().equals(other.getUserNickImageurl()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getWordsId() == null ? other.getWordsId() == null : this.getWordsId().equals(other.getWordsId()))
            && (Arrays.equals(this.getUserNickName(), other.getUserNickName()))
            && (Arrays.equals(this.getUserPhone(), other.getUserPhone()))
            && (Arrays.equals(this.getUserEmail(), other.getUserEmail()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getUserPwd() == null) ? 0 : getUserPwd().hashCode());
        result = prime * result + ((getUserSex() == null) ? 0 : getUserSex().hashCode());
        result = prime * result + ((getUserNickImageurl() == null) ? 0 : getUserNickImageurl().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getWordsId() == null) ? 0 : getWordsId().hashCode());
        result = prime * result + (Arrays.hashCode(getUserNickName()));
        result = prime * result + (Arrays.hashCode(getUserPhone()));
        result = prime * result + (Arrays.hashCode(getUserEmail()));
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userNickName=").append(userNickName);
        sb.append(", userPhone=").append(userPhone);
        sb.append(", userEmail=").append(userEmail);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}