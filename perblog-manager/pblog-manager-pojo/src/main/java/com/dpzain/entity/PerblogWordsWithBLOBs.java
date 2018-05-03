package com.dpzain.entity;

import java.io.Serializable;

/**
 * @author 
 */
public class PerblogWordsWithBLOBs extends PerblogWords implements Serializable {
    private String wordsContent;

    private String wordsBack;

    private static final long serialVersionUID = 1L;

    public String getWordsContent() {
        return wordsContent;
    }

    public void setWordsContent(String wordsContent) {
        this.wordsContent = wordsContent;
    }

    public String getWordsBack() {
        return wordsBack;
    }

    public void setWordsBack(String wordsBack) {
        this.wordsBack = wordsBack;
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
        PerblogWordsWithBLOBs other = (PerblogWordsWithBLOBs) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getWordsId() == null ? other.getWordsId() == null : this.getWordsId().equals(other.getWordsId()))
            && (this.getWordsUserId() == null ? other.getWordsUserId() == null : this.getWordsUserId().equals(other.getWordsUserId()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getWordsContent() == null ? other.getWordsContent() == null : this.getWordsContent().equals(other.getWordsContent()))
            && (this.getWordsBack() == null ? other.getWordsBack() == null : this.getWordsBack().equals(other.getWordsBack()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getWordsId() == null) ? 0 : getWordsId().hashCode());
        result = prime * result + ((getWordsUserId() == null) ? 0 : getWordsUserId().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getWordsContent() == null) ? 0 : getWordsContent().hashCode());
        result = prime * result + ((getWordsBack() == null) ? 0 : getWordsBack().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", wordsContent=").append(wordsContent);
        sb.append(", wordsBack=").append(wordsBack);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}