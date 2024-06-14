package sky.earth.mlv.usuarios.infrastructure;

import org.springframework.stereotype.Repository;
import sky.earth.mlv.usuarios.domain.User;
import sky.earth.mlv.usuarios.domain.UserRepository;

import java.util.HashMap;
import java.util.Optional;

@Repository
public class InMemoryUserRepository implements UserRepository {
    private HashMap<String, User> users;

    @Override
    public void create(String id, User user) {
        users.put(id, user);
    }
    @Override
    public Optional<User> search(String id){
        return Optional.of(users.get(id));
    }
}
