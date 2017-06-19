package fr.xebia.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by joseam on 18/06/2017.
 */
@SpringBootApplication(scanBasePackages = "fr.xebia")
public class ReactiveServiceApplication {

    public static void main(String ... args) {
        SpringApplication.run(ReactiveServiceApplication.class, args);
    }

}
