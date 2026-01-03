package br.techlabz.arquiteturaspring;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		//SpringApplication.run(Application.class, args);

		SpringApplicationBuilder builder = new SpringApplicationBuilder(Application.class);

		builder.bannerMode(Banner.Mode.OFF);
		//builder.lazyInitialization(true); // faz com que todos os beans sejm lazy, ou seja, não serao instanciados quando a aplicação for iniciada.

		builder.run(args);
	}

}
