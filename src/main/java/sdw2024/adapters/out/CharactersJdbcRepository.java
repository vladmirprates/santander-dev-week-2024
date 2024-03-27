package sdw2024.adapters.out;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import sdw2024.domain.model.Characters;
import sdw2024.domain.ports.CharactersRepository;

import java.util.List;
import java.util.Optional;

@Repository
public class CharactersJdbcRepository implements CharactersRepository {
    private final JdbcTemplate jdbcTemplate;
    private final RowMapper<Characters> charactersRowMapper;
    public CharactersJdbcRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
        this.charactersRowMapper = (rs, rowNum) -> new Characters(
                rs.getLong("id"),
                rs.getString("name"),
                rs.getString("role"),
                rs.getString("lore"),
                rs.getString("image_Url")
        );
    }
    @Override
    public List<Characters> findAll() {
        return jdbcTemplate.query("SELECT * FROM CHARACTERS", charactersRowMapper);
    }

    @Override
    public Optional<Characters> findById(Long id) {
        String sql = "SELECT * FROM CHARACTERS WHERE ID = ?";
        Characters character = jdbcTemplate.queryForObject(sql, charactersRowMapper, id);
        return Optional.ofNullable(character);
    }
}
