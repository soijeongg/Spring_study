package com.example.firstProject2.dto;

public class Articleform {
    private String title;
    private String content;

    public Articleform() {}

    public Articleform(String title, String content) {
        this.title = title;
        this.content = content;
    }
    // Getter와 Setter
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

    @Override
    public String toString() {
        return "title="+ title+'\''+ ",content=" + content+ '\'';
    }

}

