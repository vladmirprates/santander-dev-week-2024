package sdw2024.domain.ports;

import sdw2024.domain.model.Characters;

import java.util.List;
import java.util.Optional;


public interface CharactersRepository {
    List<Characters> findAll();

    Optional<Characters> findById(Long id);
}
