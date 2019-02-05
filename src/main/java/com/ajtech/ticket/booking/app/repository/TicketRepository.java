package com.ajtech.ticket.booking.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ajtech.ticket.booking.app.model.Ticket;

public interface TicketRepository extends JpaRepository<Ticket,Integer>{

	Ticket findByEmail(String email);

}
