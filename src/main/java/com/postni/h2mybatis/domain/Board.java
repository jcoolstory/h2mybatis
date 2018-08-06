package com.postni.h2mybatis.domain;

import java.util.Date;

public class Board {

    private long no;

    private Member author;
    private String title;
    private String content;
    private Date createDate;
    private String category;
    private String group;
    private String extendInformation;
    private String fileAttached;
    
    public Board() {
        this.no = 0;
    }

    public Board(long no, String title, Date createDate) {
        this.no = no;
        this.title = title;
        this.createDate = createDate;
    }

    public Board(long no, Member author, String title, String content, Date createDate) {
        this.no = no;
        this.title = title;
        this.createDate = createDate;
    }

    public long getNo() {
        return no;
    }

    public void setNo(long no) {
        this.no = no;
    }

    public Member getAuthor() { return author; }

    public void setAuthor(Member author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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