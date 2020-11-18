package com.example.springbootbackend.controller;

import com.example.springbootbackend.model.NewsletterEmail;
import com.example.springbootbackend.repository.NewsletterEmailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:3002")
@RestController
@RequestMapping("api/")
public class NewsletterEmailController {

    @Autowired
    private NewsletterEmailRepository newsletterEmailRepository;

    @GetMapping("/newsletter/{id}")
    ResponseEntity<?> getNewsletterEmail(@PathVariable Long id){
        Optional<NewsletterEmail> newsletterEmail = newsletterEmailRepository.findById(id);
        return newsletterEmail.map(response -> ResponseEntity.ok().body(response)).orElse(new ResponseEntity <> ( HttpStatus.NOT_FOUND ));
    }

    @PostMapping("/newsletter")
    ResponseEntity<NewsletterEmail> createNewsletterEmail(@Validated @RequestBody NewsletterEmail email) throws URISyntaxException{
        NewsletterEmail result = newsletterEmailRepository.save(email);
        return (ResponseEntity <NewsletterEmail>) ResponseEntity.created ( new URI ("/api/newsletter" + result.getId ())).body ( result );
    }
}
