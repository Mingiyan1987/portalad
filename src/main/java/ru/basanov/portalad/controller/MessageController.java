package ru.basanov.portalad.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.basanov.portalad.dto.ResultDTO;
import ru.basanov.portalad.dto.SimpleMessage;
import ru.basanov.portalad.integration.SimpleMessageGateway;

import java.util.UUID;

@RestController
@RequestMapping("/api")
public class MessageController {

    @Autowired
    private SimpleMessageGateway simpleMessageGateway;

    @RequestMapping(value = "/simple", method = RequestMethod.GET)
    public ResultDTO send() {
        simpleMessageGateway.fire(MessageBuilder
                .withPayload(new SimpleMessage())
                .setHeader("REQ_ID", UUID.randomUUID().toString())
                .build());
        return new ResultDTO();
    }
}
