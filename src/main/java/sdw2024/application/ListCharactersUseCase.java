package sdw2024.application;

import sdw2024.domain.model.Characters;
import sdw2024.domain.ports.CharactersRepository;

import java.util.List;

public record ListCharactersUseCase(CharactersRepository repository) {
    public List<Characters> findAll () {
        return repository.findAll();
    }
}
