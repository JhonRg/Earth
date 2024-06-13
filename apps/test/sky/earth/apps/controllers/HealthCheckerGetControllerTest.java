package sky.earth.apps.controllers;

import org.junit.jupiter.api.Test;
import sky.earth.apps.RequestTestCase;

/**
 * Test de aceptación
 */
public final class HealthCheckerGetControllerTest extends RequestTestCase {

    @Test
    public void check_health_controller_is_working() throws Exception {
        assertResponse("/health", 200, "{status:'OK'}");
    }

}
