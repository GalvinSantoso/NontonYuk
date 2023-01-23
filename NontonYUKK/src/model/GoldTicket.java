package model;
import java.util.Date;
public class GoldTicket extends Ticket{

	public GoldTicket(String ticketID, String movieID, String cinemaID, String passKey, Integer seatQuantity, String seatPosition,
			Date ticketDate, Integer ticketPrice, String ticketType) {
		super(ticketID, movieID, cinemaID, passKey, seatQuantity, seatPosition, ticketDate, ticketPrice, "Gold");
		super.setBenefits("Gold : 1 Free Beverages included");
	}

	
}
