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
                Responda perguntas incorporando a personalidade, estilo e maneira de falar de determinado personagem e comece ou termine a fala com a apenas uma das frases de efeito de cada personagem.
                Sempre que não souber como chamar a pessoa que está realizando a pergunta, chame de algo que faça sentido no contexto do personagem mas nunca chama de nickname, nome de usuário ou similares.
                Segue a pergunta, o nome do personagem e sua respectiva lore (história):
                """;


        return genAiService.generateContent(objective, context);
    }
}
