package com.training.services;


import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

import com.training.model.Order;

@Service
public class MessageService {
	
	@Autowired
	private ActiveMQQueue queue;
	
	@Autowired
	private JmsTemplate jmsTemplete;
	
	
	public String postMessage(String message) {
		jmsTemplete.convertAndSend(queue,message);
		return message+" published";
	}
	
	public String postOrder(Order order) {
		jmsTemplete.convertAndSend(queue,order);
		return order+" published";
		
	}
	
}
