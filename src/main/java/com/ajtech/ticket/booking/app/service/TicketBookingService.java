package com.ajtech.ticket.booking.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ajtech.ticket.booking.app.model.Ticket;
import com.ajtech.ticket.booking.app.repository.TicketRepository;

@Service
public class TicketBookingService {

	@Autowired
	private TicketRepository ticketRepository;

	public Ticket createTicket(Ticket ticket) {
		return ticketRepository.save(ticket);
	}

	public Optional<Ticket> getTicketById(Integer ticketId) {
		return ticketRepository.findById(ticketId);
	}

	public List<Ticket> getAllBookedTickets() {
		return ticketRepository.findAll();
	}

	public void deleteTicketById(Integer ticketId) {
		ticketRepository.deleteById(ticketId);
	}

	public Optional<Ticket> updateTicket(Integer ticketId, String email) {
		Optional<Ticket> ticketFromDb = ticketRepository.findById(ticketId);
		if (ticketFromDb.isPresent()) {
			return ticketFromDb;
		}
		return null;
	}

	public Ticket getTicketByEmail(String email) {
		return ticketRepository.findByEmail(email);
	}
}
