package com.ajtech.ticket.booking.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class TicketBookingRestAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(TicketBookingRestAppApplication.class, args);
	}

}

