package sky.earth.apps;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import sky.earth.manga.application.create.MangaCreator;
import sky.earth.manga.domain.MangaRepository;

@Configuration
public class ApplicationConfiguration {
    @Bean
    public MangaCreator mangaCreator(MangaRepository mangaRepository) {
        return new MangaCreator(mangaRepository);
    }
}
