package fr.eni.projet.springcicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class SpringCiCdApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCiCdApplication.class, args);
    }
}
