package sky.earth.apps.manga.controller;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sky.earth.manga.application.create.MangaCreator;

@RestController("manga")
public final class MangaPutController {
    MangaCreator creator;

    @PutMapping(value = "/saveManga/{id}", consumes = {"application/json"})
    public ResponseEntity<String> createManga(@PathVariable String id,@RequestBody Request request) {
        creator.create(id, request.getTitle(), request.getTitle());
        return new ResponseEntity<>(HttpStatus.CREATED);

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

