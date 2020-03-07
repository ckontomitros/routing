package com.plato.routing.services.imp;

import com.plato.routing.services.ResponseService;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class ResponseServiceImp implements ResponseService {
    @Autowired
    RabbitTemplate rabbitTemplate;

    @Override
    public void sendRequest(String key,Object message) {
        rabbitTemplate.convertAndSend("amq.direct",key,message);

    }

    @Override
    public void setResponse() {

    }
}
