package com.example.springbootbackend;

import com.example.springbootbackend.model.*;
import com.example.springbootbackend.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {
	public static List sourceList = new ArrayList();

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}
	@Autowired
	private UserRepository userRepository;

	@Autowired
	private PreventionsRepository preventionsRepository;

	@Autowired
	private NewsRepository newsRepository;

	@Autowired
	private CasesRepository casesRepository;

	@Autowired
	private NewsletterEmailRepository newsletterEmailRepository;

	@Override
	public void run(String... args) throws Exception {
		User usuario1 = new User();
		usuario1.setFirstName("joao");
		usuario1.setLastName("cunha");
		usuario1.setEmail("joao.cunha@gmail.com");
		usuario1.setId(99);

		sourceList.add("G1");
		sourceList.add("O Globo");

		Cases thirdCase = new Cases();
		thirdCase.setId ( 99 );
		thirdCase.setNumber ( "3" );
		thirdCase.setTitle ( "Mogi Mirim" );
		thirdCase.setDescription ( "6311 casos notificados. 2186 casos confirmados. 77 casos suspeitos. 4.048 casos descartados" );
		thirdCase.setUrl ( "https://mogimirim.portaldacidade.com/noticias/saude/em-10-dias-mogi-tem-6-mortes-e-quase-100-casos-por-covid-19-0501" );
		try{
			this.userRepository.save(new User ("Guto", "Raveli", "guto.raveli@hotmail.com"));
			this.userRepository.save(new User ("Samuel", "Marques", "samuel.marques@hotmail.com"));
			this.userRepository.save(new User ("Caio", "Faria", "caio.faria@hotmail.com"));
			this.userRepository.save(new User (usuario1.getFirstName (), usuario1.getLastName (), usuario1.getEmail ()));
			this.preventionsRepository.save(new Preventions ("Lave as mãos", "O virus causa infecções gastrointestinais e infecções respiratórias, por isso é sempre importante higienizar as mãos!", "https://image.freepik.com/free-vector/new-normal-concept-woman-wear-masks-using-alcohol-antiseptic-gel-clean-hands-prevent-corona-virus-illustration-flat-style-isolated-white-background_185694-73.jpg"));
			this.preventionsRepository.save(new Preventions ("Use máscara", "Desde o início da pandemia diversos estabelecimentos adotaram a política de uso obrigatório da máscara, seja responsável e use para impedir a ploriferação do vírus!", "https://cdn3.vectorstock.com/i/1000x1000/71/07/young-man-using-face-mask-isolated-icon-vector-30897107.jpg"));
			this.newsRepository.save(new News ( (String) sourceList.get ( 0 ), "França ultrapassa 2 milhões de casos de Covid; Itália tem maior número de mortes em 7 meses", "https://g1.globo.com/bemestar/coronavirus/noticia/2020/11/17/franca-ultrapassa-2-milhoes-de-casos-de-covid-italia-tem-maior-no-de-mortes-em-7-meses.ghtml"));
			this.newsRepository.save(new News ((String) sourceList.get ( 1 ), "Médica que foi espancada por reclamar de 'festa do corona' está internada com Covid-19: 'Estou em negação'", "https://oglobo.globo.com/rio/medica-que-foi-espancada-por-reclamar-de-festa-do-corona-esta-internada-com-covid-19-estou-em-negacao-24740225"));
			this.casesRepository.save(new Cases ("1", "Jaguariúna", "1200 casos confirmados. 104 casos em investigação. 3083 casos descartados. 1118 curados.", "https://municipio.jaguariuna.sp.gov.br/coronavirus/"));
			this.casesRepository.save(new Cases ("2", "Mogi Guaçu", "3531 casos confirmados. 281 casos agurdando resultado. 10322 casos negativos. 14.134 casos notificados.", "https://mogiguacu.sp.gov.br/noticias/6009/confira-o-boletim-de-casos-de-covid-19-deste-domingo"));
			this.casesRepository.save(new Cases (thirdCase.getNumber (), thirdCase.getTitle (), thirdCase.getDescription (), thirdCase.getUrl ( ) ));
			this.newsletterEmailRepository.save(new NewsletterEmail("guto@gmail.com"));
			this.newsletterEmailRepository.save(new NewsletterEmail("augusto@gmail.com"));
		}catch (Exception err){
			System.out.println(err);
		}
	}
}
