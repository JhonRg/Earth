package sky.earth.apps;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import sky.earth.mlv.mangas.application.create.MangaCreator;
import sky.earth.mlv.mangas.domain.MangaRepository;
import sky.earth.mlv.usuarios.application.create.UserCreator;
import sky.earth.mlv.usuarios.domain.UserRepository;

@Configuration
public class ApplicationConfiguration {
    @Bean
    public MangaCreator mangaCreator(MangaRepository mangaRepository) {
        return new MangaCreator(mangaRepository);
    }
    @Bean
    public UserCreator userRepository(UserRepository userRepository) {
        return new UserCreator(userRepository);
    }
}
