package sky.earth.apps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@SpringBootTest
@AutoConfigureMockMvc
public abstract class RequestTestCase {
    @Autowired
    private MockMvc mvc;

    public void assertResponse(String endpoint, Integer expectedStatucCode, String expectedResponse) throws Exception {
        ResultMatcher response = expectedResponse.isEmpty()
                ? content().string("")
                : content().json(expectedResponse);
        //Set the call using MVC.
        mvc
            .perform(get(endpoint))
            .andExpect(status().is(expectedStatucCode))
            .andExpect(response);

    }
}
