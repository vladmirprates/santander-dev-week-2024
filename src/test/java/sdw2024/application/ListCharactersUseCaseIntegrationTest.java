package sdw2024.application;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import sdw2024.domain.model.Character;

import java.util.List;

@SpringBootTest
public class ListCharactersUseCaseIntegrationTest {
    @Autowired
    private ListCharactersUseCase listCharactersUseCase;

    @Test
    public void testListCharacters() {
        List<Character> characters = listCharactersUseCase.findAll();
        Assertions.assertEquals(4, characters.size());
    }
}
