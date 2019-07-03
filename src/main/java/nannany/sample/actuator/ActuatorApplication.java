package nannany.sample.actuator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ActuatorApplication {

	public static void main(String[] args) throws InterruptedException {
		SpringApplication.run(ActuatorApplication.class, args);
		while (true) {
			System.out.println("Hello World!");
			Thread.sleep(1997L);
		}
	}

}
