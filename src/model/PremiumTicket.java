package model;

public class PremiumTicket extends Ticket{

	public PremiumTicket(String ticketID, String movieID, String cinemaID, String passKey, String seatPosition,
			String ticketDate, String ticketPrice, String ticketType) {
		super(ticketID, movieID, cinemaID, passKey, seatPosition, ticketDate, ticketPrice, "Premium");
		// TODO Auto-generated constructor stub
	}



}
