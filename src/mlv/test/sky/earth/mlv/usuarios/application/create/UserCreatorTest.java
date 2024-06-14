package sky.earth.mlv.usuarios.application.create;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import sky.earth.mlv.usuarios.domain.User;
import sky.earth.mlv.usuarios.domain.UserRepository;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@SpringBootTest
class UserCreatorTest {
    UserCreator creator;
    UserRepository repository;

    @BeforeEach
    public void setUp() {
        repository = mock(UserRepository.class);
        creator = new UserCreator(repository);
    }
    @Test
    public void should_create_user(){
        String id="1";
        String username="jon";
        String password="first";
        creator.create(id, username, password);

        verify(repository,atLeastOnce()).create(id, any(User.class));
    }
}