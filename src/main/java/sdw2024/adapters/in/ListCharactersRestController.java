package sdw2024.adapters.in;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sdw2024.application.ListCharactersUseCase;
import sdw2024.domain.model.Character;

import java.util.List;

@Tag(name = "Characters", description = "Endpoints do dominio de personagens do WoW.")
@RestController
@RequestMapping("/characters")
public record ListCharactersRestController(ListCharactersUseCase useCase) {

    @GetMapping
    public List<Character> findAllCharacters() {
        return useCase.findAll();
    }
}
