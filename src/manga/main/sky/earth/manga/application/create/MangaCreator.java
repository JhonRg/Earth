package sky.earth.manga.application.create;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.stereotype.Service;
import sky.earth.manga.domain.Manga;
import sky.earth.manga.domain.MangaRepository;

@Data
@AllArgsConstructor
@Builder
@Service
public final class MangaCreator {
    private MangaRepository repository;

    public void create(String id, String title, String author){
        Manga manga = new Manga(id, title, author);

        repository.save(manga);
    }
}
