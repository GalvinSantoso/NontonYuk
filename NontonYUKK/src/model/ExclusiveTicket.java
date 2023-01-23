package model;
import java.util.Date;
public class ExclusiveTicket extends Ticket{

	public ExclusiveTicket(String ticketID, String movieID, String cinemaID, String passKey, Integer seatQuantity, String seatPosition,
			Date ticketDate, Integer ticketPrice, String ticketType) {
		super(ticketID, movieID, cinemaID, passKey, seatQuantity, seatPosition, ticketDate, ticketPrice, "Exclusive");
		super.setBenefits("Exclusive : 1 Free Beverages and Food with Reclying Seats included");
	}

	
	
}
