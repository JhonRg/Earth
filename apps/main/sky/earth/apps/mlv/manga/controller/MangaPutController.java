package sky.earth.apps.mlv.manga.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sky.earth.mlv.mangas.application.create.MangaCreator;

@RestController("manga")
public final class MangaPutController {
    MangaCreator creator;
    public MangaPutController(final MangaCreator creator) {this.creator = creator;}

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

