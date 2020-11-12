package com.example.springbootbackend.repository;

import com.example.springbootbackend.model.Preventions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PreventionsRepository extends JpaRepository<Preventions, Long> {
}
