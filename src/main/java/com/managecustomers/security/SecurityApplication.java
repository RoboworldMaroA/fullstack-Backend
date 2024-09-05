package com.managecustomers.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.managecustomers.security.emaiSenderService.EmailSenderService;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class SecurityApplication {


	@Autowired
	private EmailSenderService senderService;


	public static void main(String[] args) {
		SpringApplication.run(SecurityApplication.class, args);
	}

	//	Data that you will be sending
	@EventListener(ApplicationReadyEvent.class)
	public void sendMail(){
		senderService.sendEmail("marek_augustyn1@o2.pl", "Test 2 info send from spring boot app", "send from backen with spring seciurity app");
	}

}
