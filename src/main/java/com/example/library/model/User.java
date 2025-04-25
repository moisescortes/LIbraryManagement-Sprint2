package com.example.library.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.sql.Timestamp;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(max = 255)
    @Column(nullable = false)
    private String username;

    @NotNull
    @Size(max = 255)
    @Column(nullable = false)
    private String password;

    @NotNull
    @Size(max = 255)
    @Column(nullable = false, unique = true)
    private String email;

    @NotNull
    @Size(max = 255)
    @Column(nullable = false)
    private String firstName;

    @NotNull
    @Size(max = 255)
    @Column(nullable = false)
    private String lastName;

    @NotNull
    @Column(nullable = false, updatable = false)
    private Timestamp createdAt;

    @NotNull
    @Column(nullable = false)
    private Timestamp updatedAt;

    public User() {}

    // Getters y setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }
}
