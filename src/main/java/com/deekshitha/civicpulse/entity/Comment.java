package com.deekshitha.civicpulse.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.PrePersist;
import java.time.LocalDateTime;

@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String text;
    private String username;
    private LocalDateTime createdAt;

    @ManyToOne
    private Issue issue;

    @PrePersist
    protected void onCreate() {
        createdAt = LocalDateTime.now();        
    }

    public Comment () {

    }

    public Comment(String username, String text) {
        this.username = username;
        this.text = text;
    }

    public Long getId() {
        return id;
    }    

    public String getText() {
        return text;
    }

    public String getUsername() {
        return username;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public Issue getIssue() {
        return issue;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setIssue(Issue issue) {
        this.issue = issue;
    }
}