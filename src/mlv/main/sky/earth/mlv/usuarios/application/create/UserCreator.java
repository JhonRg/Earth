package sky.earth.mlv.usuarios.application.create;

import org.springframework.stereotype.Service;
import sky.earth.mlv.usuarios.domain.User;
import sky.earth.mlv.usuarios.domain.UserRepository;

@Service
public class UserCreator {
    UserRepository repository;
    public UserCreator(UserRepository repository){this.repository = repository;}

    public void create(String id, String username, String password){
        User user = User.builder().id(id).username(username).password(password).build();
        repository.create(id, user);
    }
}
