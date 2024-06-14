package sky.earth.apps.mlv.user.controller;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sky.earth.mlv.usuarios.application.create.UserCreator;

@RestController("user")
public class UserPutController {
    UserCreator creator;

    @PutMapping("/saveUser/{id}")
    public ResponseEntity saveUser(@RequestParam String id, @RequestBody Request request){
        creator.create(id, request.getUserName(), request.getPassword());
        return new ResponseEntity(HttpStatus.CREATED);
    }
}
@Getter
@Setter
final class Request{
    private String userName;
    private String password;
}
