package com.example.demo2.models;

import java.time.LocalDate;

public class Book {
    private long id;
    private String name;
    private String author;
    private LocalDate publishAt;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDate getPublishAt() {
        return publishAt;
    }

    public void setPublishAt(LocalDate publishAt) {
        this.publishAt = publishAt;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publishAt=" + publishAt +
                '}';
    }
}
