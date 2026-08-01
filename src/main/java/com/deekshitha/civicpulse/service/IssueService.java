package com.deekshitha.civicpulse.service;

import com.deekshitha.civicpulse.entity.Issue;
import com.deekshitha.civicpulse.repository.IssueRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IssueService {

    private final IssueRepository issueRepository;

    public IssueService (IssueRepository issueRepository) {
       this.issueRepository = issueRepository;
    }

    public Issue createIssue(Issue issue) {
        return issueRepository.save(issue);
    }

    public List<Issue> getAllIssues() {
        return issueRepository.findAll();
    }
}