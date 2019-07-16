package com.cg.frs.service;

import java.util.List;

import com.cg.frs.dto.TicketDTO;

public interface BookingOperations {

	TicketDTO viewTicket(int ticketId);

	List<Integer> bookTicket(List<TicketDTO> ticketDTOs);

	int viewAvailableSeats();

	void cancelTicket(int ticketId);

}
