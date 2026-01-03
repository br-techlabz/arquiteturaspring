package br.techlabz.arquiteturaspring;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

@SpringBootApplication
@EnableConfigurationProperties
public class Application {

	public static void main(String[] args) {
		//SpringApplication.run(Application.class, args);

		SpringApplicationBuilder builder = new SpringApplicationBuilder(Application.class);

		builder.bannerMode(Banner.Mode.OFF);
		//builder.lazyInitialization(true); // faz com que todos os beans sejm lazy, ou seja, não serao instanciados quando a aplicação for iniciada.

		builder.run(args);

		ConfigurableApplicationContext applicationContext = builder.context();

		ConfigurableEnvironment environment = applicationContext.getEnvironment();
		//recuperando o valor de uma propriedade do application.property ou arquivo yml
		String applicationName = environment.getProperty("spring.application.name");

		System.out.println("Nome da aplicacao: " + applicationName);

		ExemploValue exemploValue = applicationContext.getBean(ExemploValue.class);
		exemploValue.imprimirVariavel();
	}

}
