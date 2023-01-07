package model;

public class GoldTicket extends Ticket{

	public GoldTicket(String ticketID, String movieID, String cinemaID, String passKey, Integer seatQuantity, String seatPosition,
			String ticketDate, Integer ticketPrice, String ticketType) {
		super(ticketID, movieID, cinemaID, passKey, seatQuantity, seatPosition, ticketDate, ticketPrice, "Gold");
		// TODO Auto-generated constructor stub
	}


}
