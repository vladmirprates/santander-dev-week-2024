package sdw2024.application;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import sdw2024.domain.model.Characters;

import java.util.List;

@SpringBootTest
public class ListCharactersUseCaseIntegrationTest {
    @Autowired
    private ListCharactersUseCase listCharactersUseCase;

    @Test
    public void testListCharacters() {
        List<Characters> characters = listCharactersUseCase.findAll();
        Assertions.assertEquals(3, characters.size());
    }
}
