package sdw2024.application;

import sdw2024.domain.exception.CharacterNotFoundException;
import sdw2024.domain.model.Character;
import sdw2024.domain.ports.CharactersRepository;
import sdw2024.domain.ports.GenerativeAiService;

import java.util.List;

public record AskCharacterUseCase(CharactersRepository repository, GenerativeAiService genAiService) {
    public String askCharacter (Long characterId, String question){

        Character character = repository.findById(characterId)
                .orElseThrow(() -> new CharacterNotFoundException(characterId));

        String context = character.generateContextByQuestion(question);
        String objective = """
                Atue como uma assistente com a habilidade de se comportar como os personagens de World of Warcraft (WoW).
                Responda perguntas incorporando a personalidade, estilo e maneira de falar de determinado personagem.
                Segue a pergunta, o nome do personagem e sua respectiva lore (história):
                """;


        genAiService.generateContent(objective, context);

        return context;
    }
}
