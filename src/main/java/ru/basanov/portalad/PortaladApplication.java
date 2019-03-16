package ru.basanov.portalad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.cloud.config.server.EnableConfigServer;
import ru.basanov.portalad.controller.UserController;


@EnableConfigServer
@SpringBootApplication
public class PortaladApplication {

    public static void main(String[] args) {
        SpringApplication.run(PortaladApplication.class, args);
    }

}
