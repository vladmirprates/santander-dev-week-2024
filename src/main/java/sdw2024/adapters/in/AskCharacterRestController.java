package sdw2024.adapters.in;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;
import sdw2024.application.AskCharacterUseCase;
import sdw2024.application.ListCharactersUseCase;
import sdw2024.domain.model.Character;

import java.util.List;

@Tag(name = "Characters", description = "Endpoints do dominio de personagens do WoW.")
@RestController
@RequestMapping("/characters")
public record AskCharacterRestController(AskCharacterUseCase useCase) {

    @CrossOrigin
    @PostMapping("/{characterId}/ask")
    public AskCharacterResponse askCharacter(@PathVariable Long characterId, @RequestBody AskCharacterRequest request) {

        String answer = useCase().askCharacter(characterId, request.question());

        return new AskCharacterResponse(answer);
    }
    public record AskCharacterRequest(String question) { }
    public record AskCharacterResponse(String answer) { }
}
