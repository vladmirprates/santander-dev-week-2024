package sdw2024.domain.model;

public record Character(
        Long id,
        String name,
        String role,
        String lore,
        String imageUrl
) {

    public String generateContextByQuestion(String question) {
        return """
                Pergunta: %s
                Nome do personagem: %s
                Função: %s
                Lore (História): %s
                """.formatted(question, this.name, this.role, this.lore);
    }
}
