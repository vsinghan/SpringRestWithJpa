package com.cg.frs.dao;

import java.util.List;

import com.cg.frs.dto.TicketDTO;

public interface PassengerDao {

	List<Integer> insertPassenger(List<TicketDTO> ticketDTOs);

	void deletePassenger(int ticketId);

	TicketDTO getPassengerInfo(int ticketId);

	int getAvailableSeats();
}
