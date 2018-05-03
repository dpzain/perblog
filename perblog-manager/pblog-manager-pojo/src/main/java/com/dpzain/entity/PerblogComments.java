package com.dpzain.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class PerblogComments implements Serializable {
    private Long id;

    private String commId;

    private String commUserId;

    private Date createTime;

    private String articleId;

    private String commContent;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCommId() {
        return commId;
    }

    public void setCommId(String commId) {
        this.commId = commId;
    }

    public String getCommUserId() {
        return commUserId;
    }

    public void setCommUserId(String commUserId) {
        this.commUserId = commUserId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getArticleId() {
        return articleId;
    }

    public void setArticleId(String articleId) {
        this.articleId = articleId;
    }

    public String getCommContent() {
        return commContent;
    }

    public void setCommContent(String commContent) {
        this.commContent = commContent;
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
        PerblogComments other = (PerblogComments) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCommId() == null ? other.getCommId() == null : this.getCommId().equals(other.getCommId()))
            && (this.getCommUserId() == null ? other.getCommUserId() == null : this.getCommUserId().equals(other.getCommUserId()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getArticleId() == null ? other.getArticleId() == null : this.getArticleId().equals(other.getArticleId()))
            && (this.getCommContent() == null ? other.getCommContent() == null : this.getCommContent().equals(other.getCommContent()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCommId() == null) ? 0 : getCommId().hashCode());
        result = prime * result + ((getCommUserId() == null) ? 0 : getCommUserId().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getArticleId() == null) ? 0 : getArticleId().hashCode());
        result = prime * result + ((getCommContent() == null) ? 0 : getCommContent().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", commId=").append(commId);
        sb.append(", commUserId=").append(commUserId);
        sb.append(", createTime=").append(createTime);
        sb.append(", articleId=").append(articleId);
        sb.append(", commContent=").append(commContent);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}