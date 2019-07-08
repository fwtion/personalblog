package com.cogn.personalblog.pojo;

public class Comment {
    private int comId;
    private String commentName;
    private String commentContent;
    private int authorId;

    public int getComId() {
        return comId;
    }

    public void setConId(int comId) {
        this.comId = comId;
    }

    public String getCommentName() {
        return commentName;
    }

    public void setCommentName(String commentName) {
        this.commentName = commentName;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public Comment(String commentName, String commentContent, int authorId) {
        super();
        this.commentName = commentName;
        this.commentContent = commentContent;
        this.authorId = authorId;
    }
    public Comment(){

    }

    @Override
    public String toString() {
        return "Comment{" +
                "conId=" + comId +
                ", commentName='" + commentName + '\'' +
                ", commentContent='" + commentContent + '\'' +
                ", authorId=" + authorId +
                '}';
    }
}
