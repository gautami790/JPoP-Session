package com.jpopsession.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

    @KafkaListener(topics = "JpopTopic", groupId="myGroup")
    public void consumerFromTopic(String message){

    }

}

