package sdw2024.domain.exception;

public class CharacterNotFoundException extends RuntimeException {
    public CharacterNotFoundException(Long characterId) {
        super("Character %d not found.".formatted(characterId));
    }
}
