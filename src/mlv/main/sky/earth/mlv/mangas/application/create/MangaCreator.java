package sky.earth.mlv.mangas.application.create;

import org.springframework.stereotype.Service;
import sky.earth.mlv.mangas.domain.Manga;
import sky.earth.mlv.mangas.domain.MangaRepository;

@Service
public final class MangaCreator {
    private MangaRepository repository;
    public MangaCreator (MangaRepository repository){this.repository = repository;}

    public void create(String id, String title, String author){
        Manga manga = new Manga(id, title, author);

        repository.save(manga);
    }
}
