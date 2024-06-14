package sky.earth.manga.infrastructure;

import org.springframework.stereotype.Repository;
import sky.earth.manga.domain.Manga;
import sky.earth.manga.domain.MangaRepository;

import java.util.HashMap;
import java.util.Optional;

@Repository
public final class InMemoryRepository implements MangaRepository {
    private HashMap<String, Manga> mangas = new HashMap<String, Manga>();

    @Override
    public void save(Manga manga) {
        this.mangas.put(manga.getId(), manga);
    }
    public Optional<Manga> search(String id) {
        return Optional.ofNullable(mangas.get(id));
    }
}
