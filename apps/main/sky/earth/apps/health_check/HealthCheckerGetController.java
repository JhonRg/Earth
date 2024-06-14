package sky.earth.apps.health_check;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public final class HealthCheckerGetController {

    /**
     * By default Spring parse the return into JSON
     * @return HashMap internally, JSON for Spring auto parsing response
     */
    @GetMapping("/health")
    public HashMap<String, String> handler() {
        HashMap<String, String> map = new HashMap<>();
        map.put("status", "OK");
        return map;
    }
}
