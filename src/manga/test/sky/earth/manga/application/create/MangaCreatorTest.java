package sky.earth.manga.application.create;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sky.earth.manga.domain.Manga;
import sky.earth.manga.domain.MangaRepository;

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