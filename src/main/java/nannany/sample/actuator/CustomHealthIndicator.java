package nannany.sample.actuator;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;

public class CustomHealthIndicator implements HealthIndicator {

    private boolean isHealthy = true;

    @Override
    public Health health() {
        return isHealthy ? Health.up().build() : Health.down().build();
    }


}
