package com.ajtech.ticket.booking.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ajtech.ticket.booking.app.model.Ticket;
import com.ajtech.ticket.booking.app.service.TicketBookingService;

@RestController
@RequestMapping(value = "/api/tickets")
public class TicketBokkingController {
	@Autowired
	private TicketBookingService bookingService;

	@PostMapping(value = "/create")
	public Ticket createTicket(@RequestBody Ticket ticket) {
		return bookingService.createTicket(ticket);
	}

	@GetMapping(value = "/ticketId/{ticketId}")
	public Optional<Ticket> getTicketById(@PathVariable("ticketId") Integer ticketId) {
		return bookingService.getTicketById(ticketId);
	}

	@GetMapping(value = "/alltickets")
	public List<Ticket> getAllBookedTickets() {
		return bookingService.getAllBookedTickets();
	}

	@DeleteMapping(value = "/ticketId/{ticketId}")
	public void deleteTicket(@PathVariable("ticketId") Integer ticketId) {
		bookingService.deleteTicketById(ticketId);
	}

	@PutMapping(value="/ticketId/{ticketId}/email/{email:.+}")
	public Optional<Ticket> updateTicket(@PathVariable("ticketId") Integer ticketId,
			@PathVariable("email") String email) {

		return bookingService.updateTicket(ticketId, email);
	}

}
