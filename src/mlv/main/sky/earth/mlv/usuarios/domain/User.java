package sky.earth.mlv.usuarios.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class User {

    private String id;
    private String username;
    private String password;

    private String firstName;
    private String lastName;
    private String mail;
    private String telephone;
}
