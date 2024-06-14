package sky.earth.mlv.mangas.domain;

import java.util.Optional;

public interface MangaRepository {
    void save(Manga manga);
    Optional<Manga> search(String id);
}
