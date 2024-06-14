package sky.earth.apps.mangas;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import sky.earth.apps.RequestTestCase;

@SpringBootTest
public final class MangaPutControllerTest extends RequestTestCase {

    @Test
    public void saveManga() throws Exception {
        assertRequestWithBody(
        "POST",
        "/saveManga/201",
            "{\"name\":\"One Piece\", \"author\":\"Eichiro Oda\"}",
                201
        );
    }
}
