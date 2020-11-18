package com.example.springbootbackend.repository;

import com.example.springbootbackend.model.Cases;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CasesRepository extends JpaRepository <Cases, Long> {
}
