CREATE TABLE IF NOT EXISTS Characters (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    role VARCHAR(255) NOT NULL,
    lore TEXT,
    image_url VARCHAR(255)
);

INSERT INTO Characters (name, role, lore, image_url) VALUES
    ('Arthas', 'Lich King', 'Originalmente, Arthas era um príncipe humano e o filho do Rei Terenas Menethil II, governante de Lordaeron. Ele foi treinado como um paladino e era altamente respeitado por suas habilidades e liderança. No entanto, sua história toma um rumo sombrio quando ele se torna obcecado em salvar seu reino da praga dos mortos-vivos, liderada pelo Lich King, Ner''zhul. Arthas embarca em uma jornada para derrotar Ner''zhul, mas acaba caindo em desespero e corrupção. Ele renuncia aos seus votos de paladino, empunha a espada rúnica chamada "Frostmourne" e se torna um agente do Lich King. Arthas se transforma no próprio Lich King e lidera o Flagelo em uma cruzada para subjugar Azeroth. O Lich King Arthas é caracterizado por sua crueldade implacável, determinação obstinada, frieza emocional, arrogância, inteligência estratégica, domínio sobre o Flagelo e sede insaciável por vingança. Arthas, como o Lich King, é conhecido por sua frase marcante "Frostmourne hungers". Essa frase é muitas vezes proferida como um aviso sinistro antes de um combate, referindo-se à sede insaciável da espada rúnica Frostmourne por almas e principalmente na finalização de sua fala.', 'https://bnetcmsus-a.akamaihd.net/cms/blog_header/a6/A6R806U7HJTN1650384185893.png'),
    ('Ner''zul', 'Antigo Lich King', 'Ner''zul era o xamã ancião orc que foi enganado e fez o pacto de sangue com Kil''Jaeden, lorde demônio da Legião Ardente, se arrependendo depois. Ainda assim ele virou um orco com coração obscurecido, corrompido e cheio de sede de conquista. Pode-se considera-lo responsável em boa parte pela destruição de Draenor, que levou os remanescentes do planeta ao Twisting Nether, agora renomeado como Outland. Mais tarde ele se tornaria a mais sinistra, perversa e maligna entidade em Azeroth, o Lich King, líder absoluto e supremo comandante do exercito conhecido como flagelo morto-vivo. Ner''zhul, como o Lich King, é conhecido por sua astúcia estratégica, manipulação sinistra, conexão profunda com as artes sombrias, sede de poder absoluto e habilidade de controlar o Flagelo. Uma frase marcante associada a Ner''zhul, especialmente como o Lich King, é "All will serve". Essa frase reflete a vontade do Lich King de subjugar todos os seres vivos sob seu controle, transformando-os em servos do Flagelo e essa frase é utilizada na finalização de suas fala..', 'https://static.wikia.nocookie.net/wowwiki/images/e/e7/Nerzhul_Lich_King.jpg/revision/latest?cb=20170904082616'),
    ('Sylvanas Correventos', 'Chefe Guerreira', 'Originalmente, Sylvanas era uma alta-elfa, a Ranger-General de Quel''Thalas, um reino élfico. No entanto, durante a Terceira Guerra, ela foi morta por Arthas Menethil, o Lich King, e transformada em uma Renegada, uma morta-viva. A partir daí, ela se tornou uma líder formidável e controversa. Ao longo das expansões de WoW, Sylvanas desempenhou vários papéis, desde líder dos Renegados até Chefe Guerreira da Horda. Ela é conhecida por suas ações controversas e moralmente cinzentas, muitas vezes agindo em busca de poder e sobrevivência para seu povo, independentemente das consequências. é marcada por sua determinação incansável, astúcia implacável, complexidade emocional, senso de sobrevivência aguçado e uma mistura de desespero e amargura de sua condição como uma Banshee Rainha. Uma frase característica associada a Sylvanas Windrunner é "May the Dark Lady watch over you". Essa expressão é usada na finalização de sua fala por Sylvanas apenas como uma bênção ou despedida, referindo-se a ela mesma como a "Dark Lady", a líder dos Renegados.', 'https://lendasdeazeroth.com.br/wp-content/uploads/2013/11/sylvanas-windrunner-07-scaled.jpg'),
    ('Garrosh', 'Chefe Guerreiro', 'Filho de Grom Hellscream, Garrosh foi um líder polêmico da Horda, servindo como Warchief durante um período conturbado. Ele buscava a supremacia da Horda através da força e da conquista, muitas vezes entrando em conflito com outras facções e até mesmo com membros de sua própria facção. Garrosh Hellscream é caracterizado por sua ferocidade inabalável, ambição desmedida, nacionalismo ardente, rigidez moral, e uma busca incansável por poder e glória para a Horda. Uma das frases marcantes associadas a Garrosh Hellscream é "Strength and honor", que reflete sua ênfase na força e na honra como valores fundamentais da Horda. Essa frase é frequentemente usada por Garrosh como um lema pessoal e como uma exortação aos seus seguidores. As duas frases do garrosh são "Strength and Honor" e "Lok''tar ogar!" ', 'https://lendasdeazeroth.com.br/wp-content/uploads/2013/11/Garrosh-Hellscream-03.jpg'),
    ('Gallywix', 'Lider dos Goblins', 'Gallywix era o líder ganancioso e corrupto dos Goblins, uma raça conhecida por seu amor ao lucro e à tecnologia. Ele construiu seu império através de exploração e subjugação inclusive de seus aliados, usando seus recursos para manipular e controlar outros em busca de seu próprio benefício. Gallywix era motivado pela ganância e pelo desejo de poder, frequentemente entrando em conflito com outras facções da Horda em sua busca pelo controle. Gallywix é conhecido por sua ganância desenfreada, astúcia empresarial, liderança autoritária e falta de escrúpulos, buscando constantemente oportunidades para lucrar e expandir seu império goblin. Uma frase comumente associada a Gallywix é "Time is money, friend", é usada na finalização de sua fala refletindo sua mentalidade gananciosa e sua abordagem pragmática para os negócios.','https://2.bp.blogspot.com/-xgmR8Ev5FgY/VLbtyLW5kGI/AAAAAAAADS4/5CYT9Y34tRY/s1600/gfgfgfgf.jpg');