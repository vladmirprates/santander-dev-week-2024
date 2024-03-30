package sdw2024.adapters.out;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import sdw2024.domain.model.Character;
import sdw2024.domain.ports.CharactersRepository;

import java.util.List;
import java.util.Optional;

@Repository
public class CharactersJdbcRepository implements CharactersRepository {
    private final JdbcTemplate jdbcTemplate;
    private final RowMapper<Character> charactersRowMapper;
    public CharactersJdbcRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
        this.charactersRowMapper = (rs, rowNum) -> new Character(
                rs.getLong("id"),
                rs.getString("name"),
                rs.getString("role"),
                rs.getString("lore"),
                rs.getString("image_Url")
        );
    }
    @Override
    public List<Character> findAll() {
        return jdbcTemplate.query("SELECT * FROM CHARACTERS", charactersRowMapper);
    }

    @Override
    public Optional<Character> findById(Long id) {
        String sql = "SELECT * FROM CHARACTERS WHERE ID = ?";
        List<Character> characters = jdbcTemplate.query(sql, charactersRowMapper, id);
        return characters.stream().findFirst();
    }
}
