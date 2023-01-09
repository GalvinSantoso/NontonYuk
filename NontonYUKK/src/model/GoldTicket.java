package model;

public class GoldTicket extends Ticket{

	public GoldTicket(String ticketID, String movieID, String cinemaID, String passKey, Integer seatQuantity, String seatPosition,
			String ticketDate, Integer ticketPrice, String ticketType) {
		super(ticketID, movieID, cinemaID, passKey, seatQuantity, seatPosition, ticketDate, ticketPrice, "Gold");
		super.setBenefits("Gold : 1 Free Beverages included");
	}

	
}
