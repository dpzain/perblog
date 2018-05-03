package com.dpzain.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class PerblogCommentsBack implements Serializable {
    private Long id;

    private String backId;

    private String backUserIdBy;

    private String commentsId;

    private String backUserIdTo;

    private Date createTime;

    private String backContent;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBackId() {
        return backId;
    }

    public void setBackId(String backId) {
        this.backId = backId;
    }

    public String getBackUserIdBy() {
        return backUserIdBy;
    }

    public void setBackUserIdBy(String backUserIdBy) {
        this.backUserIdBy = backUserIdBy;
    }

    public String getCommentsId() {
        return commentsId;
    }

    public void setCommentsId(String commentsId) {
        this.commentsId = commentsId;
    }

    public String getBackUserIdTo() {
        return backUserIdTo;
    }

    public void setBackUserIdTo(String backUserIdTo) {
        this.backUserIdTo = backUserIdTo;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getBackContent() {
        return backContent;
    }

    public void setBackContent(String backContent) {
        this.backContent = backContent;
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
        PerblogCommentsBack other = (PerblogCommentsBack) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getBackId() == null ? other.getBackId() == null : this.getBackId().equals(other.getBackId()))
            && (this.getBackUserIdBy() == null ? other.getBackUserIdBy() == null : this.getBackUserIdBy().equals(other.getBackUserIdBy()))
            && (this.getCommentsId() == null ? other.getCommentsId() == null : this.getCommentsId().equals(other.getCommentsId()))
            && (this.getBackUserIdTo() == null ? other.getBackUserIdTo() == null : this.getBackUserIdTo().equals(other.getBackUserIdTo()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getBackContent() == null ? other.getBackContent() == null : this.getBackContent().equals(other.getBackContent()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getBackId() == null) ? 0 : getBackId().hashCode());
        result = prime * result + ((getBackUserIdBy() == null) ? 0 : getBackUserIdBy().hashCode());
        result = prime * result + ((getCommentsId() == null) ? 0 : getCommentsId().hashCode());
        result = prime * result + ((getBackUserIdTo() == null) ? 0 : getBackUserIdTo().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getBackContent() == null) ? 0 : getBackContent().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", backId=").append(backId);
        sb.append(", backUserIdBy=").append(backUserIdBy);
        sb.append(", commentsId=").append(commentsId);
        sb.append(", backUserIdTo=").append(backUserIdTo);
        sb.append(", createTime=").append(createTime);
        sb.append(", backContent=").append(backContent);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}