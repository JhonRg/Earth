package java.sky.dev.earth.application;

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
final class Request{
        private String title;
        private String author;

        public String getTitle() {return title;}
        public String getAuthor() {return author;}
        public void setTitle(String title) {this.title = title;}
        public void setAuthor(String author) {this.author = author;}
}

