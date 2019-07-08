package com.cogn.personalblog.pojo;

public class Article {
    private int authorId;
    private String authorName;
    private String title;
    private String content;




    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
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

    public Article( String authorName, String title, String content) {
        super();
        this.authorName = authorName;
        this.title = title;
        this.content = content;
    }

    public Article(){

    }

    public Article( String authorName, String title) {
        super();
        this.authorName = authorName;
        this.title = title;
    }
    public Article( int authorId,String authorName, String title, String content) {
        super();
        this.authorId = authorId;
        this.authorName = authorName;
        this.title = title;
        this.content = content;
    }
    @Override
    public String toString() {
        return "Article{" +
                "authorId=" + authorId +
                ", authorName='" + authorName + '\'' +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
