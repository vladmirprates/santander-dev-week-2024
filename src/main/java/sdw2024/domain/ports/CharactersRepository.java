package sdw2024.domain.ports;
import sdw2024.domain.model.Character;
import java.util.List;
import java.util.Optional;


public interface CharactersRepository {
    List<Character> findAll();

    Optional<Character> findById(Long id);
}
