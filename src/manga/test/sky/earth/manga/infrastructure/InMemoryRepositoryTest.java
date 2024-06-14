package sky.earth.manga.infrastructure;

import org.junit.jupiter.api.Test;
import sky.earth.manga.domain.Manga;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class InMemoryRepositoryTest {
    InMemoryRepository repo = new InMemoryRepository();
    @Test
    void save_a_valid_course() {
        String manga_id = "1";
        Manga toSave =new Manga(manga_id, "One Piece", "Eichiro Oda");

        repo.save(toSave);

        assertEquals(Optional.of(toSave), repo.search(manga_id));
    }
    @Test
    void seach_a_non_existing_course() {
        assertFalse(repo.search("non-existing-id").isPresent());
    }
}