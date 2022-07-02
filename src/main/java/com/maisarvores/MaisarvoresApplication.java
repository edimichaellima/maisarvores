package com.maisarvores;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.maisarvores.model.Arvore;
import com.maisarvores.repository.ArvoreRepository;

@SpringBootApplication
public class MaisarvoresApplication {

	public static void main(String[] args) {
		SpringApplication.run(MaisarvoresApplication.class, args);
	}

	@Bean
	CommandLineRunner initDataBase(ArvoreRepository arvoreRepository) {
		return args -> {
			arvoreRepository.deleteAll();
			
			Arvore a = new Arvore();
			a.setDescricao("Jurubatuba");
			
			arvoreRepository.save(a);
		};
	}
}
