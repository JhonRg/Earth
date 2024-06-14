package sky.earth.mlv.usuarios.infrastructure;

import org.junit.jupiter.api.Test;
import sky.earth.mlv.usuarios.domain.User;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class InMemoryUserRepositoryTest {
    InMemoryUserRepository userRepository = new InMemoryUserRepository();

    @Test
    public void should_create_user(){
        String id = "1";
        String username ="username";
        String password = "password";

        User user = User.builder()
                .id(id)
                .username(username)
                .password(password)
                .build();
        userRepository.create(id, user);

        assertEquals(Optional.of(user), userRepository.search(id));
    }
    @Test
    public void search_a_non_existent_user(){ assertFalse(userRepository.search("non-existent").isPresent()); }
}
