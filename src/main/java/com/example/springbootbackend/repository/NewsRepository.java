package com.example.springbootbackend.repository;

import com.example.springbootbackend.model.News;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NewsRepository  extends JpaRepository <News, Long> {
}
