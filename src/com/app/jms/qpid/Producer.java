package com.app.jms.qpid;

import java.io.FileInputStream;
import java.util.Properties;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.MessageConsumer;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.naming.Context;
import javax.naming.InitialContext;

public class Producer {
	
	public Producer() {
		
	}
	
	public static void main(String[] args) {
		Producer producer = new Producer();
		producer.test();
	}
	
	private void test() {
		try {
			Properties properties = new Properties();
			properties.load(new FileInputStream("F:/ISuite-code/Java/Z_Practice/src/test.properties"));
			//properties.load(this.getClass().getResourceAsStream("F:/ISuite-code/Java/Z_Practice/src/test.properties"));
			Context context = new InitialContext(properties);
			
			ConnectionFactory conFactory = (ConnectionFactory)context.lookup("qpidConnectionFactory");
			Connection connection = conFactory.createConnection();
			connection.start();
			
			Session session=connection.createSession(false,Session.AUTO_ACKNOWLEDGE);
			Destination destination = (Destination) context.lookup("topicExchange");
			
			MessageProducer producer = session.createProducer(destination);
			MessageConsumer consumer = session.createConsumer(destination);
			
			TextMessage message = session.createTextMessage("Hello World");
			producer.send(message);
			
			message = (TextMessage)consumer.receive();
			System.out.println(message.getText());
			
			connection.close();
			context.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
