package pt.up.feup.homemaestro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class HomemaestroApplication {

    public static void main(String[] args) {
        SpringApplication.run(HomemaestroApplication.class, args);
    }

}
