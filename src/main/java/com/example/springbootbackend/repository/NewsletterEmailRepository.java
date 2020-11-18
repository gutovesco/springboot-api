package com.example.springbootbackend.repository;

import com.example.springbootbackend.model.NewsletterEmail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsletterEmailRepository extends JpaRepository <NewsletterEmail, Long> {
}
