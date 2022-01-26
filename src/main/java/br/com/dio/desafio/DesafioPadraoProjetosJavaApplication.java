package br.com.dio.desafio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


/**
 * DIO - Desafio Padrões de Projeto Java
 * Projeto Spring Boot gerado via Spring Initializr.
 * Os seguintes módulos foram selecionados:
 *  - Spring Data JPA;
 *  - Spring Web;
 *  - H2 Database;
 *  - OpenFeing
 *
 * @author Natalia Ferreira
 */

@EnableFeignClients
@SpringBootApplication
public class DesafioPadraoProjetosJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesafioPadraoProjetosJavaApplication.class, args);
	}

}
