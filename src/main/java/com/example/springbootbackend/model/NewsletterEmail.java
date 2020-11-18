package com.example.springbootbackend.model;

import javax.persistence.*;

@Entity
@Table(name = "newsletter")
public class NewsletterEmail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String email;

    public NewsletterEmail(){

    }

    public NewsletterEmail(String email) {
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
