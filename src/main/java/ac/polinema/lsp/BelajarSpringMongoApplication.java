package ac.polinema.lsp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class BelajarSpringMongoApplication {

	public static void main(String[] args) {
		SpringApplication.run(BelajarSpringMongoApplication.class, args);
	}

	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/tuk").allowedOrigins("https://lsp-api-gateway.herokuapp.com/api/management/");
			}
		};
	}

}
