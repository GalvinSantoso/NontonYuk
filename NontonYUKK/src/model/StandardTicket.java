package model;

public class StandardTicket extends Ticket{

	public StandardTicket(String ticketID, String movieID, String cinemaID, String passKey, Integer seatQuantity, String seatPosition,
			String ticketDate, Integer ticketPrice, String ticketType) {
		super(ticketID, movieID, cinemaID, passKey, seatQuantity, seatPosition, ticketDate, ticketPrice, "Standard");
		super.setBenefits("Standard : No Benefits");
	}




}
