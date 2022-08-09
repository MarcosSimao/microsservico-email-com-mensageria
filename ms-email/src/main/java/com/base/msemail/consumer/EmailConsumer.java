package com.base.msemail.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import com.base.msemail.dto.EmailDto;
import com.base.msemail.entites.Email;
import com.base.msemail.mapper.Convert;
import com.base.msemail.service.EmailService;

//@Component
public class EmailConsumer {
   
	@Autowired
	EmailService service;
	
	
//@RabbitListener(queues="${spring.rabbitmq.queue}")
public void listen(@Payload EmailDto dto) {
	Email email=service.sendEmail(Convert.convertEmailDto(dto));
	System.out.println("Email Status "+email.getStatusEmail().toString());
}
}
