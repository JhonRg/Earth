package sky.earth.manga.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class Manga {
    private String id;
    private String title;
    private String author;
}
