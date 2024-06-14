package java.sky.dev.earth.application;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MangaPutController {

    @PutMapping("/saveManga/{id}")
    public ResponseEntity createManga(@PathVariable String id,@RequestBody Request request) {
        return new ResponseEntity(HttpStatus.CREATED);

    }
}
@Setter
@Getter
final class Request{
        private String title;
        private String author;
}

