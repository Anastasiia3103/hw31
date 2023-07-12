package entity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "hw31")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
