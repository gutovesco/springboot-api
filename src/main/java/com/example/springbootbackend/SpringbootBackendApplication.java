package com.example.springbootbackend;

import com.example.springbootbackend.model.Preventions;
import com.example.springbootbackend.model.User;
import com.example.springbootbackend.repository.PreventionsRepository;
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

	@Autowired
	private PreventionsRepository preventionsRepository;

	@Override
	public void run(String... args) throws Exception {
		this.userRepository.save(new User ("Guto", "Raveli", "guto.raveli@hotmail.com"));
		this.userRepository.save(new User ("Samuel", "Marques", "samuel.marques@hotmail.com"));
		this.userRepository.save(new User ("Caio", "Faria", "caio.faria@hotmail.com"));
		this.preventionsRepository.save(new Preventions ("Lave as mãos", "O virus causa infecções gastrointestinais e infecções respiratórias, por isso é sempre importante higienizar as mãos!", "https://image.freepik.com/free-vector/new-normal-concept-woman-wear-masks-using-alcohol-antiseptic-gel-clean-hands-prevent-corona-virus-illustration-flat-style-isolated-white-background_185694-73.jpg"));
		this.preventionsRepository.save(new Preventions ("Use máscara", "Desde o início da pandemia diversos estabelecimentos adotaram a política de uso obrigatório da máscara, seja responsável e use para impedir a ploriferação do vírus!", "https://cdn3.vectorstock.com/i/1000x1000/71/07/young-man-using-face-mask-isolated-icon-vector-30897107.jpg"));
	}
}
