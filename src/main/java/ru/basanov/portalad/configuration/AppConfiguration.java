package ru.basanov.portalad.configuration;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.integration.annotation.IntegrationComponentScan;
import org.springframework.integration.config.EnableIntegration;

@EnableAutoConfiguration
@EnableIntegration
@IntegrationComponentScan("ru.basanov.portalad")
public class AppConfiguration {
}
