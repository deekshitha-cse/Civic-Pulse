package com.deekshitha.civicpulse.repository;

import com.deekshitha.civicpulse.entity.Comment;
import com.deekshitha.civicpulse.entity.Issue;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository <Comment, Long> {
    List<Comment> findByIssueId(Long id);
}

