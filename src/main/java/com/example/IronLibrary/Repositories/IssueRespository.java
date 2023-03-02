package com.example.IronLibrary.Repositories;

import com.example.IronLibrary.Models.Issue;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IssueRespository extends JpaRepository <Issue,Integer> {
}
