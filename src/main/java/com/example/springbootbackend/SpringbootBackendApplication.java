package com.example.springbootbackend;

import com.example.springbootbackend.model.User;
import com.example.springbootbackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		this.userRepository.save(new User ("Guto", "Raveli", "guto.raveli@hotmail.com"));
		this.userRepository.save(new User ("Samuel", "Marques", "samuel.marques@hotmail.com"));
		this.userRepository.save(new User ("Caio", "Faria", "caio.faria@hotmail.com"));
	}
}
