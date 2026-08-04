package com.deekshitha.civicpulse.controller;

import com.deekshitha.civicpulse.service.CommentService;
import com.deekshitha.civicpulse.entity.Comment;
import com.deekshitha.civicpulse.entity.Issue;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@RestController
@RequestMapping("/comments")
public class CommentController {

    private final CommentService commentService;

    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    @PostMapping
    public Comment createComment(@RequestBody Comment comment) {
        return commentService.createComment(comment);
    } 

    @GetMapping("/issue/{id}")
    public List<Comment> getCommentsByIssueId(@PathVariable Long id) {
        return commentService.getCommentsByIssueId(id);
    }
}