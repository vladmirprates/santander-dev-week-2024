package sdw2024;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import sdw2024.application.ListCharactersUseCase;
import sdw2024.domain.ports.CharactersRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public ListCharactersUseCase provideListCharactersUseCase(CharactersRepository repository) {
		return new ListCharactersUseCase(repository);
	}
}
