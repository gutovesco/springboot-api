package com.example.springbootbackend.controller;

import com.example.springbootbackend.model.Cases;
import com.example.springbootbackend.repository.CasesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3002")
@RestController
@RequestMapping("api/")
public class CasesController {
    @Autowired
    private CasesRepository casesRepository;

    @GetMapping("cases")
    public List <Cases> getCases() {
        return this.casesRepository.findAll();
    }
}
