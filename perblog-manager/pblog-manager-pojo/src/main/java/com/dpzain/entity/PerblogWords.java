package com.dpzain.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class PerblogWords implements Serializable {
    private Long id;

    private String wordsId;

    private String wordsUserId;

    private Date createTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWordsId() {
        return wordsId;
    }

    public void setWordsId(String wordsId) {
        this.wordsId = wordsId;
    }

    public String getWordsUserId() {
        return wordsUserId;
    }

    public void setWordsUserId(String wordsUserId) {
        this.wordsUserId = wordsUserId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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
        PerblogWords other = (PerblogWords) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getWordsId() == null ? other.getWordsId() == null : this.getWordsId().equals(other.getWordsId()))
            && (this.getWordsUserId() == null ? other.getWordsUserId() == null : this.getWordsUserId().equals(other.getWordsUserId()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getWordsId() == null) ? 0 : getWordsId().hashCode());
        result = prime * result + ((getWordsUserId() == null) ? 0 : getWordsUserId().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", wordsId=").append(wordsId);
        sb.append(", wordsUserId=").append(wordsUserId);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}