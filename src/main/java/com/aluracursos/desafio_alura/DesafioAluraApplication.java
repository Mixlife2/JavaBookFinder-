package com.aluracursos.desafio_alura;

import com.aluracursos.desafio_alura.principal.Principal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesafioAluraApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DesafioAluraApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal();
		principal.muestrElMenu();

	}
}
