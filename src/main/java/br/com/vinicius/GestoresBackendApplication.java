package br.com.vinicius;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.vinicius.entities.Gestor;
import br.com.vinicius.repositories.GestorRepositorio;

@SpringBootApplication
public class GestoresBackendApplication implements CommandLineRunner {
	
	@Autowired
	private GestorRepositorio gestorRepositorio;

	public static void main(String[] args) {
		SpringApplication.run(GestoresBackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		gestorRepositorio.save(new Gestor("gestor1","123","12/05/2019","TI"));
		gestorRepositorio.save(new Gestor("gestor2","234","21/06/2019","TI"));
		gestorRepositorio.save(new Gestor("gestor3","678","15/09/2019","TI"));
	}

}
