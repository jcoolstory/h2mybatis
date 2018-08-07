package com.postni.h2mybatis.domain;

import java.util.Date;

public class Comment {

    private long commentNo;
    private long boardNo;
    private Member author;
    private String content;
    private Date createDate;

    public long getCommentNo() {
        return commentNo;
    }

    public void setCommentNo(long commentNo) {
        this.commentNo = commentNo;
    }

    public long getBoardNo() {
        return boardNo;
    }

    public void setBoardNo(long boardNo) {
        this.boardNo = boardNo;
    }

    public Member getAuthor() {
        return author;
    }

    public void setAuthor(Member author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
