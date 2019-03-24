package ru.basanov.portalad.integration;

import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;
import org.springframework.messaging.Message;
import ru.basanov.portalad.dto.SimpleMessage;

@MessagingGateway(
        name = "simpleMessageGateway",
        defaultRequestChannel = "simpleMessageChannel"
)
public interface SimpleMessageGateway {

    @Gateway
    void fire(Message<SimpleMessage> message);
}
