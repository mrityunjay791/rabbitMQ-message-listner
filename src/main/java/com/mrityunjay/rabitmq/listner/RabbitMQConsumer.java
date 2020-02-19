package com.mrityunjay.rabitmq.listner;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.mrityunjay.rabitmq.model.Employee;

/**
 * This is used for consuming message.
 * 
 * @author mrityunjaykumar
 *
 */
@Component
public class RabbitMQConsumer {

	@RabbitListener(queues = "${mrityunjay.rabbitmq.queue}")
	public void recievedMessage(Employee employee) {
		System.out.println("Recieved Message From RabbitMQ: " + employee);
	}
}