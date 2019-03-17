package ru.basanov.portalad;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.basanov.portalad.controller.UserController;


@EnableConfigServer
@SpringBootApplication
public class PortaladApplication {

    public static void main(String[] args) {
        SpringApplication.run(PortaladApplication.class, args);
    }
}
