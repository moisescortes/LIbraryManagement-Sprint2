package com.example.library.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.sql.Timestamp;

@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(max = 255)
    @Column(nullable = false)
    private String title;

    @NotNull
    @Size(max = 255)
    @Column(nullable = false)
    private String author;

    @NotNull
    @Size(min = 10, max = 20)
    @Column(unique = true, nullable = false)
    private String isbn;

    @NotNull
    @Min(1000)
    private Integer publicationYear;

    @Size(max = 100)
    private String genre;

    @Min(1)
    private Integer pages;

    @Column(name = "created_at", nullable = false, insertable = false, updatable = false)
    private Timestamp createdAt;

    public Book() {}

    // Getters y setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Integer getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(Integer publicationYear) {
        this.publicationYear = publicationYear;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }
}
