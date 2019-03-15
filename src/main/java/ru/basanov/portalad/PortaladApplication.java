package ru.basanov.portalad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import ru.basanov.portalad.controller.UserController;


@EnableAutoConfiguration
@SpringBootApplication(exclude = JpaRepositoriesAutoConfiguration.class)
public class PortaladApplication {

    public static void main(String[] args) {
        SpringApplication.run(PortaladApplication.class, args);
    }

}
