package sky.earth.mlv.mangas.application.create;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sky.earth.mlv.mangas.application.create.MangaCreator;
import sky.earth.mlv.mangas.domain.Manga;
import sky.earth.mlv.mangas.domain.MangaRepository;

import static org.mockito.Mockito.*;

class MangaCreatorTest {
    MangaRepository repository;
    MangaCreator creator;

    @BeforeEach
    void setUp() {
        repository = mock(MangaRepository.class);
        creator = new MangaCreator(repository);
    }

    @Test
    void save_a_valid_manga() {
        creator.create("0","One Piece", "Eichiro Oda");

        verify(repository, atLeastOnce()).save(any(Manga.class));
    }
}