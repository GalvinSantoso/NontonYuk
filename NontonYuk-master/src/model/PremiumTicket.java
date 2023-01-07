package model;

public class PremiumTicket extends Ticket{

	public PremiumTicket(String ticketID, String movieID, String cinemaID, String passKey,Integer seatQuantity, String seatPosition,
			String ticketDate, Integer ticketPrice, String ticketType) {
		super(ticketID, movieID, cinemaID, passKey, seatQuantity, seatPosition, ticketDate, ticketPrice, "Premium");
		// TODO Auto-generated constructor stub
	}



}
