package com.jpopsession.controller;

import com.jpopsession.service.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/kafkaapp")
public class KafkaController {

    @Autowired
    Producer producer;

    @PostMapping("/postMessage")
    public void sendMessage(@RequestBody String msg){
        producer.publishToTopic(msg);
    }
}
