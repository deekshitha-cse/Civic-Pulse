package com.deekshitha.civicpulse.service;

import com.deekshitha.civicpulse.entity.Comment;
import com.deekshitha.civicpulse.entity.Issue;
import com.deekshitha.civicpulse.repository.CommentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {

    private final CommentRepository commentRepository;

    public CommentService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    public Comment createComment(Comment comment) {
        return commentRepository.save(comment);
    }

    public List<Comment> getCommentsByIssue(Issue issue) {
        return commentRepository.findByIssue(issue);
    }
}