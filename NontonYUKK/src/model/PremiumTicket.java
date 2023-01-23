package model;
import java.util.Date;
public class PremiumTicket extends Ticket{

	public PremiumTicket(String ticketID, String movieID, String cinemaID, String passKey,Integer seatQuantity, String seatPosition,
			Date ticketDate, Integer ticketPrice, String ticketType) {
		super(ticketID, movieID, cinemaID, passKey, seatQuantity, seatPosition, ticketDate, ticketPrice, "Premium");
		super.setBenefits("Premium :  1 Free Beverages and Food included");
	}



}
