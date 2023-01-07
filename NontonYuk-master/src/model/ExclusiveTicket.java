package model;

public class ExclusiveTicket extends Ticket{

	public ExclusiveTicket(String ticketID, String movieID, String cinemaID, String passKey, Integer seatQuantity, String seatPosition,
			String ticketDate, Integer ticketPrice, String ticketType) {
		super(ticketID, movieID, cinemaID, passKey, seatQuantity, seatPosition, ticketDate, ticketPrice, "Exclusive");
		// TODO Auto-generated constructor stub
	}

	
	
}
