package sdw2024.application;

import sdw2024.domain.exception.CharacterNotFoundException;
import sdw2024.domain.model.Character;
import sdw2024.domain.ports.CharactersRepository;

import java.util.List;

public record AskCharacterUseCase(CharactersRepository repository) {
    public String askCharacter (Long characterId, String question){

        Character character = repository.findById(characterId)
                .orElseThrow(() -> new CharacterNotFoundException(characterId));

        String characterContext = character.generateContextByQuestion(question);

        return characterContext;
    }
}
