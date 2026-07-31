package com.deekshitha.civicpulse.repository;

import com.deekshitha.civicpulse.entity.Issue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IssueRepository extends JpaRepository<Issue, Long> {
    
}