package sky.earth.apps.mlv.manga;

import com.fasterxml.jackson.core.json.UTF8JsonGenerator;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import sky.earth.apps.RequestTestCase;

@SpringBootTest
public final class MangaPutControllerTest extends RequestTestCase {

    @Test
    public void saveManga() throws Exception {
            assertRequestWithBody(
                    "PUT",
                    "/saveManga/201",
                    "{\"title\":\"One Piece\",\"author\": \"Eichiro Oda\"}",
                    201
            );
    }
}
