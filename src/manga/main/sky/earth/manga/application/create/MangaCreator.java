package sky.earth.manga.application.create;

import org.springframework.stereotype.Service;
import sky.earth.manga.domain.Manga;
import sky.earth.manga.domain.MangaRepository;

@Service
public final class MangaCreator {
    private MangaRepository repository;
    public MangaCreator (MangaRepository repository){this.repository = repository;}

    public void create(String id, String title, String author){
        Manga manga = new Manga(id, title, author);

        repository.save(manga);
    }
}
