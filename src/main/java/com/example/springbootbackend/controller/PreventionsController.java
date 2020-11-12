package com.example.springbootbackend.controller;

import com.example.springbootbackend.model.Preventions;
import com.example.springbootbackend.repository.PreventionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3002")
@RestController
@RequestMapping("api/")
public class PreventionsController{

    @Autowired
    private PreventionsRepository preventionsRepository;

    @GetMapping("preventions")
    public List < Preventions > getPreventions() {
        return this.preventionsRepository.findAll();
    }
}
