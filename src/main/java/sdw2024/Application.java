package sdw2024;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import sdw2024.application.AskCharacterUseCase;
import sdw2024.application.ListCharactersUseCase;
import sdw2024.domain.ports.CharactersRepository;
import sdw2024.domain.ports.GenerativeAiService;

@EnableFeignClients
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public ListCharactersUseCase provideListCharactersUseCase(CharactersRepository repository) {
		return new ListCharactersUseCase(repository);
	}

	@Bean
	public AskCharacterUseCase provideAskCharacterUseCase(CharactersRepository repository, GenerativeAiService genAiService) {
		return new AskCharacterUseCase(repository, genAiService);
	}
}
