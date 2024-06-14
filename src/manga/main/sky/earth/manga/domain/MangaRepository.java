package sky.earth.manga.domain;

import java.util.Optional;

public interface MangaRepository {
    void save(Manga manga);
    Optional<Manga> search(String id);
}
