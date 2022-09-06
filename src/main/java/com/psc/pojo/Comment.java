package com.psc.pojo;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: pushicheng
 * @Date: 2022/09/05/15:54
 * @Description:
 */
public class Comment {
    private int commentId;
    private String context;
    private Long createTime;
    private Long updateTime;

    public Comment(int commentId, String context, Long createTime, Long updateTime) {
        this.commentId = commentId;
        this.context = context;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }
}
