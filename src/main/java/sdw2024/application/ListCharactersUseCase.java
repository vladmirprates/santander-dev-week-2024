package sdw2024.application;

import sdw2024.domain.model.Character;
import sdw2024.domain.ports.CharactersRepository;

import java.util.List;

public record ListCharactersUseCase(CharactersRepository repository) {
    public List<Character> findAll () {
        return repository.findAll();
    }
}
