package sky.earth.mlv.usuarios.domain;

import java.util.Optional;

public interface UserRepository {
    void create(String id,User user);
    Optional<User> search(String id);
}
